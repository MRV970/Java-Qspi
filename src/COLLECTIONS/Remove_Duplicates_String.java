package COLLECTIONS;

import java.util.LinkedHashSet;

public class Remove_Duplicates_String {
	public static void main(String[] args) {
		String s="JavaClass";
		LinkedHashSet l1=new LinkedHashSet();
		for(int i=0;i<=s.length()-1;i++) {
			l1.add(s.charAt(i));
			
		}
		
		System.out.println(l1);
		
	}

}
