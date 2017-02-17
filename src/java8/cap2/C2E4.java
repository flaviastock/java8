package java8.cap2;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.junit.Test;

import java8.Exercise;

public class C2E4 implements Exercise {

	@Test
	@Override
	public void perform() {
		int[] values = { 1, 4, 9, 16 };
		IntStream i = IntStream.of(values);
		i.forEach(System.out::println);
		IntStream streamOfInts = Arrays.stream(values);
        streamOfInts.forEach(System.out::println);
	}
}
