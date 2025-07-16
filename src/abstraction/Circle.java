package abstraction;

public class Circle {
	int rad;
	public Circle(int rad) {
		this.rad=rad;
	}
	public String toString() {
		//System.out.println(rad);
		return rad+" ";
	}
	public static void main(String args []) {
		Circle c1=new Circle(10);
		System.out.println(c1);
		System.out.println(c1.toString());
		
	}

}

