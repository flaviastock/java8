package oop;

public class UseHR {
	public static void main(String[] args) {
		HR hr = new HR();
		hr.hire(new Salaried("Fred"));
		hr.hire(new Salaried());
		hr.printEverybody();
//		hr.payEverybody();
	}

}
