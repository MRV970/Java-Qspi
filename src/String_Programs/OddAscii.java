package String_Programs;

public class OddAscii {
	public static void main(String[] args) {
		String s1="abcdefghijklmnop";
		String s2="";
		for(int i=0;i<=s1.length()-1;i++) {
			char ch=s1.charAt(i);
				
			if(ch%2!=0) {
				s2=s2+ch;
				//s1=s1+ch;
				//System.out.println(s1);
			}
			
		}
		System.out.println(s2);
	}

}
