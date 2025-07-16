package String_Programs;

public class Count {
	public static void main(String[] args) {
		String s="JavaClass";
		System.out.println(s.length());
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			count++;
		}
		System.out.println(count);
	}

}
