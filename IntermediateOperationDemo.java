package intermediate.operation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperationDemo {
	
	//predicate
	public static Predicate<String> isContainChareacetPredicate() {
        return str -> str.contains("L");
    }
	
	//function mapper
	public static Function<List<Integer>,List<Integer>> multipleOf3() {
        return null;
    }
	
	public static void main(String[] args) {
		List<String> list = Stream.of("Monkey", "Lion", "Giraffe", "Lemur")
				.filter(isContainChareacetPredicate())
				.collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer> numList = Arrays.asList(3, 6, 9, 12, 15);
	}
}
