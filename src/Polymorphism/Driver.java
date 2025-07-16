package Polymorphism;

public class Driver {
	public static void ansim(Human s1) {
		s1.acting("Ahi");
	}
	public static void main(String args []) {
		ansim( new Trainer ());
	}

}
