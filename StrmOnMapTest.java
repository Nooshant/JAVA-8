package thakur.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrmOnMapTest {
	
	private static void winner(String[] votes)
	{
		Stream<String> stream = Arrays.stream(votes);
		Map<String, Long> map = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.forEach((k,v)->{
			System.out.println(k+"  "+v);
		});
	}
	
	public static void main(String[] args) {
		String votes[] = {"john", "johnny", "jackie",
				 "johnny", "john", "jackie",
				 "jamie", "jamie", "john",
				 "johnny", "jamie", "john"};
		winner(votes);
	}
}
