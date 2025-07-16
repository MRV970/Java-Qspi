package String_Programs;

public class Remove_String {
	public static void main(String[] args) {
		String s1="My name is  Khan";
		String s2="";
		char ch[]=s1.toCharArray();
		int count1=0;
		for(int i=0;i<=ch.length-1;i++) {
			int count=0;
			
			for(int j=0;j<i;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			//int count1=0;
			if(count<1) {
				s2=s2+ch[i];
			}
			//System.out.println(s2);
		count1++;
				
				
				
				
		}
		System.out.println(s2);
		System.out.println(count1);
	
	}}

