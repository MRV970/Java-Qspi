package ARRAYLISTCLASS;

import java.util.Stack;

public class STACK {
public static void main(String[] args) {
	Stack s1=new Stack();
	s1.add("abcde");
	s1.add(123);
	s1.add("");
	s1.add(true);
	s1.add(20.0);
	s1.add('A');
	s1.add(null);
	
	System.out.println(s1);
	Stack s2=new Stack();
	s2.add("abc");
	s2.add(false);
	s1.add(2,s2);
	System.out.println(s1);
}
}
