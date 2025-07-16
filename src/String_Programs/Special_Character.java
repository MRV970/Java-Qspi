package String_Programs;

public class Special_Character {
	public static void main(String[] args) {
		String s1="JavaClass@ # 123";
		String s2="";
		for(int i=0;i<=s1.length()-1;i++) {
			char ch=s1.charAt(i);
	
			if(!(ch>='a'&&ch<='z')&&!(ch>='A'&&ch<='Z')&& !(ch>='0'&&ch<='9')&&ch!=' ') {
				s2=s2+ch;
				
			}	
			
		}
		System.out.println(s2);
	}

}
