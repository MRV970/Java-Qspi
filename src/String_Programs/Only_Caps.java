package String_Programs;

public class Only_Caps {
	public static void main(String[] args) {
		String s1="JavaClaSs";
		String s2="";
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)>='A'&& s1.charAt(i)<='Z') {
			s2=s2+s1.charAt(i);
		}
		}
		System.out.println(s2);
	}

}
