package String_Programs;

public class Only_Small {
	public static void main(String[] args) {
		String s1="JavaA4 Students Are Good Students";
		String s2="";
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)>='a'&& s1.charAt(i)<='z') {
				s2=s2+s1.charAt(i);
			}
			
		}
		System.out.println(s2);
	}

}
