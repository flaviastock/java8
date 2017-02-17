package java8.cap2;

import java.util.List;

import org.junit.Test;

import java8.Exercise;

public class C2E3 implements Exercise {

	@Test
	@Override
	public void perform() {
		List<String> words = getWordsAsList();
		long start = System.currentTimeMillis();
		words.stream().filter(s -> s.length() > 12).count();
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start));
		
		
		start = System.currentTimeMillis();
		words.parallelStream().filter(s -> s.length() > 12).count();
		end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start));
		
	}
}
