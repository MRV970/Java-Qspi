package String_Programs;

public class Vowels {
	public static void main(String[] args) {
		String s1="ABCdefghiJKLMNO";
		
		
		for(int i=0;i<=s1.length()-1;i++) {
			char ch=s1.charAt(i);
			
			if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'||ch=='U'
				||ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'	) {
				System.out.println(ch);
			}
		}
		
	}

}
