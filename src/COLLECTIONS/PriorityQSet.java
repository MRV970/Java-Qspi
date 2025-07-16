package COLLECTIONS;

import java.util.PriorityQueue;

public class PriorityQSet {
	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue();
		p1.add("mrv");
		p1.add("nishi");
		p1.add("RR");
		p1.add("ammu");
		p1.add("vbnvn");
		
		System.out.println(p1);
		System.out.println(p1.poll());
		System.out.println(p1);
		System.out.println(p1.peek());
		System.out.println(p1);
	}

}
