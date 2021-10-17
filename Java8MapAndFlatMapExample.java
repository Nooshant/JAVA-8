package intermediate.operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Institute {
	String name;
	List<String> locations;

	public Institute(String name, List<String> locations) {
		this.name = name;
		this.locations = locations;
	}

	public String getName() {
		return name;
	}

	public List<String> getLocations() {
		return locations;
	}
}

public class Java8MapAndFlatMapExample {

	public static void main(String[] args) {
		List<Institute> instituteList = new ArrayList<>();

		instituteList.add(new Institute("IIM", Arrays.asList("Bangalore", "Ahmedabad", "Kozhikode", "Lucknow")));
		instituteList.add(new Institute("IIT", Arrays.asList("Delhi", "Mumbai", "Kharagpur")));
		instituteList.add(new Institute("NIFT", Arrays.asList("Hyderabad", "Mumbai", "Patna", "Bangalore")));
		
		List<String> nameList = instituteList.stream().map(institute -> institute.getName()).collect(Collectors.toList());
		System.out.println(nameList);
		
		List<String> locationList = instituteList.stream().flatMap(institute -> institute.getLocations().stream())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(locationList);
	}

}
