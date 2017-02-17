package lambdasstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingCollect {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("this", "is", "a", "stream", "of", "strings");
		
		List<String> evenLength = new ArrayList<>();
		strings.stream()
			.filter(s -> s.length() % 2 == 0)
			.forEach(evenLength::add);
		System.out.println(evenLength);
		
		List<String> events = strings.stream().filter(s -> s.length() % 2 == 0).collect(Collectors.toList());
		System.out.println(events);

	}

}
