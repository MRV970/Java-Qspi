package arrays_programs;

public class Repeated_Elements {
	public static void main(String args []) {
		int a[]= { 10,4,2,10,5,4,4,2,10};
		int count=0;
		int b=a[0];
		for(int i=0;i<=a.length-1;i++) {
			
				
			
			if(a[i]==b) {
				count++;
			}
		}
		System.out.println(count+"-->>"+b);
		for(int i:a) {
			int c=b;
			if(c==i) {
				System.out.println(count+"  "+c);
			}
		}
	}

}
