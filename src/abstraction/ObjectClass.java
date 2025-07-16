package abstraction;

public class ObjectClass {
	public static void main(String[] args) {
		ObjectClass c1=new ObjectClass();
		System.out.println(c1);
		System.out.println(c1.hashCode());
		Sample1 s1=new Sample1();
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(c1.hashCode()==s1.hashCode());
	}

}
