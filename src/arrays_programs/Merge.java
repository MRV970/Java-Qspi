package arrays_programs;

public class Merge {
	public static void main(String args []) {
		int a[]= {10,201};
		int b[]= {101,20,0,301};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
				c[i]=a[i];
				
			}
			else {
				c[i]=b[i-a.length];
			}
		}
		for(int k:c) {
			System.out.println(k);
		}
	}

}
