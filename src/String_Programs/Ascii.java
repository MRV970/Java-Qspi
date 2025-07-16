package String_Programs;

public class Ascii {
	public static void main(String[] args) {
		String s1="Java";
		for(int i=0;i<=s1.length()-1;i++) {
			System.out.println(s1.codePointAt(i));
		}
	}

}
