package cap3;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		
//		System.out.print("What is your name? ");
//
//		String name = in.nextLine();
//		
//		System.out.print("How old are you? ");
//
//		int age = in.nextInt();
//		
//		
//		System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
		
		
		
//		Console cons = System.console();
//
//		String username = cons.readLine("User name: ");
//
//		char[] passwd = cons.readPassword("Password: ");
		
		
		

		
		try (PrintWriter out = new PrintWriter("c:\\Flavia\\Formation\\workspace2\\advancedJava\\src\\cap3\\MyFile.txt", "UTF-8")) {
			out.write("write");
			out.println("print");
			out.println("print2");
			out.write("write2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (Scanner in = new Scanner(Paths.get("src\\cap3\\MyFile.txt"), "UTF-8")) {
			String test = in.nextLine();
			System.out.println(test);
			test = in.nextLine();
			System.out.println(test);
			test = in.nextLine();
			System.out.println(test);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		
		
	}
}
