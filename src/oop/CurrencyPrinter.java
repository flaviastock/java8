package oop;

import java.text.NumberFormat;

public class CurrencyPrinter {

	public static void main(String[] args) {
		double amount = 1234567.8901234;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(amount));
	}
}
