package COLLECTIONS;

import java.util.LinkedHashSet;

public class No_Of_Occurence {
	public static void main(String[] args) {
		String s1="Java Class A4";
		LinkedHashSet<Character> s=new LinkedHashSet();
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)!=' ') {
				s.add(s1.charAt(i));
			}
		}
		System.out.println("---------");
		for(Character ch:s) {
			char ch1=ch;
			int count=0;
			for(int i=0;i<=s1.length()-1;i++) {
				if(s1.charAt(i)==ch1) {
					count++;
				}
				
			}
			System.out.println(ch1+"->"+count);
			
		}
		
		
	}

}
