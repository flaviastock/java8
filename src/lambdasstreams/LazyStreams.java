package lambdasstreams;

import java.util.stream.IntStream;

public class LazyStreams {
	
	private static int multByTwo(int n) {
		System.out.printf("Inside multByTwo with arg %d%n", n);
		return n * 2;

	}
	
	public static void main(String[] args) {
		int firstDoubleDivBy3 = IntStream.range(100, 200).map(LazyStreams::multByTwo).filter(n -> n % 3 == 0).findFirst().orElse(999);
		System.out.printf("First even divisible by 3 is %d%n", firstDoubleDivBy3);
	}

}
