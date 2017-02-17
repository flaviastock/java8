package cap3;

import java.util.Scanner;

public class Constants2 {

	public static final double CM_PER_INCH = 2.54;
	
	public static void main(String[] args) {
//		double paperWidth = 8.5;
//
//		double paperHeight = 11;
//
//		System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
//		
//		
//		double x = 4;
//
//		double y = Math.sqrt(x);
//
//		System.out.println(y); // prints 2.0
//		
//		System.out.println("The square root of \u03C0 is " + sqrt(PI));
//		
//		int n = 123456789;
//
//		float f = n; // f is 1.23456792E8
//		
//		System.out.println(f);
		
//		double x = 9.997;
//
//		int nx = (int)round(x);
//		
//		System.out.println(nx);
		
//		int x = 1;
//		
//		x += 3.5;
//		
//		System.out.println(x);
		
//		int m = 7;
//
//		int n = 7;
//
//		int a = 2 * ++m; // now a is 16, m is 8
//
//		int b = 2 * n++; // now b is 14, n is 8
//		
//		System.out.println(a + " e " +m);
//		System.out.println(b + " e " +n);
		
//		
//		int x = 3;
//
//		int y = 2;
//		
//		System.out.println(x < y ? x : y);
		
//		
//		int fourthBitFromRight = (n & 0b1000) / 0b1000;
//		
//		
//		System.out.println(fourthBitFromRight);
//		
//		int x = 1;
//		
//		System.out.println(5/x++);
//		System.out.println(x);
		
//		String expletive = "Expletive";
//
//		String PG13 = "deleted";
//
//		String message = expletive + PG13;
//		
//		System.out.println(message);
		
//		int age = 13;
//
//		String rating = "PG" + age;
//		
//		System.out.println(rating);
		
//		String all = String.join(" ; ", "S", "M", "L", "XL");
//		System.out.println(all);
		
//		String greeting = "Help";
//		
//		System.out.println(greeting);
//		
//		greeting = greeting.substring(0, 3) + "p!";
//		
//		System.out.println(greeting);
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("What is your name? ");

		String name = in.nextLine();
		System.out.println(name);
		
		System.out.print("How old are you? ");

		int age = in.nextInt();
		
		System.out.println(age);
		
	}

}
