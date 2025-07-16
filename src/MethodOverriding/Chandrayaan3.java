package MethodOverriding;

public class Chandrayaan3 extends Chandrayaan2 {
	
	public void moonsurface() {
		super.moonsurface();
		System.out.println("successful to reach Moon");
	}
	public static void main(String args[]) {
		Chandrayaan3 c3=new Chandrayaan3();
		c3.moonsurface();
		
	}

}
