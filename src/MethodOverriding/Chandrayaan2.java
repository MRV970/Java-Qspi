package MethodOverriding;

public class Chandrayaan2 extends Chandrayaan1 {
public void moonsurface() {
	super.moonsurface();
	System.out.println("Reached near to Sun");
}
public static void main(String args[]) {
	Chandrayaan2 c1=new Chandrayaan2 ();
	c1.moonsurface();
}
}
