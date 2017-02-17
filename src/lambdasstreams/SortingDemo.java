package lambdasstreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingDemo {
	private List<String> sampleStrings = Arrays.asList("this", "is", "a", "stream", "of", "strings");
	
	public List<String> alphaSort() {
		Collections.sort(sampleStrings);
		return sampleStrings;
	}
	
	public List<String> lengthReverseSortWithComparator() {
		Collections.sort(sampleStrings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}
			
		});
		return sampleStrings;
	}
	
	public List<String> lengthSortWithLambda() {
		Collections.sort(sampleStrings, (s1, s2) -> s1.length() - s2.length());
		return sampleStrings;
	}
	
	public List<String> lengthSortVerbose() {
		Collections.sort(sampleStrings,
				(String s1, String s2) -> {
					return Integer.compare(s1.length(), s2.length());
				});
		return sampleStrings;
	}
	
	public List<String> lengthSortComparator() {
		Collections.sort(sampleStrings, Comparator.comparingInt(String::length));
		return sampleStrings;
	}
	
	public List<String> lengthSortThenAlphaSort() {
		Collections.sort(sampleStrings, Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
		return sampleStrings;
	}
	
	public List<String> alphaSortUsingSorted() {
		return sampleStrings.stream().sorted().collect(Collectors.toList());
	}
	
	public List<String> lengthSortUsingSorted() {
		return sampleStrings.stream().sorted((s1, s2) -> s1.length() - s2.length())
				.collect(Collectors.toList());
	}

	public List<String> lengthSortThenAlphaSortUsingSorted() {
		return sampleStrings.stream()
				.sorted(Comparator.comparing(String::length)
						.thenComparing(Comparator.naturalOrder()))
				.collect(Collectors.toList());
	}
}
