package static_member;

public class Local_Global {
	static String name="Java";
	public static void main(String args[]) {
		String name="Mava";
		System.out.println(Local_Global.name);
		System.out.println(name);
	}

}
