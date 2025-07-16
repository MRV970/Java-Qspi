package HasARelation;

public class Test {
	public static void main(String[] args) {
		Mobile m=new Mobile("iphone","yellow");
		System.out.println(m.name);
		System.out.println(m.color);
		m.installPlaystore();
		m.pid.installsnap("rafik sir");
		 m.pid.installQtalk("uppal baalu");
	}

}
