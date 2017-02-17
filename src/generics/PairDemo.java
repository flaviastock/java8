package generics;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class PairDemo {

	public static void main(String[] args) {
		Pair<Integer> pair = new Pair<>(3, 4);
		System.out.println(pair);
		Pair.swap(pair);
		System.out.println(pair);
		
		Pair<Integer> pair1 = new Pair<>(5, 12);
		System.out.println(pair1);
		Pair.swap(pair1);
		System.out.println(pair1);
		
		Pair.<Integer>swap(pair1);
		System.out.println(pair1);

	}

}
