package arrays_programs;

public class Merging_arrays {
	public static void main(String args []) {
		int a[]= {10,20,30,40};
		int b[]= {200,300,100,400};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<=a.length-1;i++) {
			c[i]=a[i];
		}
		for(int j=0;j<=b.length-1;j++) {
			c[a.length+j]=b[j];
			
		}
		for(int i:c) {
			System.out.println(i);
		}
	}

}
