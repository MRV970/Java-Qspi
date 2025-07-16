package arrays;

public class Task {
	public static void main(String args []) {
	
		int a[]= new int[4];
		a[2]=20;
		a[1]=a[2];
		a[0]='a';
		a[3]=a[0];
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[0]);
	}

}
