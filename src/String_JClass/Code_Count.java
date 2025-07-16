package String_JClass;

public class Code_Count {
	public static void main(String[] args) {
		String s="abcdefgh";
		int a=s.codePointCount(0, s.length()-1);
		System.out.println(a);
	}

}
