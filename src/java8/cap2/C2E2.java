package java8.cap2;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import java8.Exercise;

public class C2E2 implements Exercise {
	
	@Test
	@Override
	public void perform() {
		List<String> words = getWordsAsList();
		words.stream().filter(s -> s.length() > 12).limit(5).forEach(System.out::println);
	}
	

}
