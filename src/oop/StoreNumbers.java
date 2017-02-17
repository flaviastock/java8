package oop;

public class StoreNumbers {
	private boolean[] nummbers = new boolean[100];
	
	public void store(int num) {
		nummbers[num] = true;
	}
	
	public boolean isStored(int num) {
		return nummbers[num];
	}
	
	public static void main(String[] args) {
		StoreNumbers sn = new StoreNumbers();
		System.out.println(sn.isStored(2));
		sn.store(2);
		System.out.println(sn.isStored(2));
	}
}
