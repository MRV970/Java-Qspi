package arrays_programs;

public class Odd_Merge {
	public static void main(String args []) {
		int a[]= {10,20,101};
		int b[]= {101,201,30};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
				if(a[i]%2!=0) {
				c[i]=a[i];
				}
			}
			else {
				if(b[i-a.length]%2!=0) { 
					
				c[i]=b[i-a.length];
				}
			}
		}
		
				
				for(int k:c) {
					if(k!=0) {
					System.out.println(k);
					}
				}
	}

}
