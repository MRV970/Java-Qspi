package arrays_programs;

public class Largest_element {
	public static void main(String args []) {
		int a[]= {25,35,555,45,67};
		int max=a[0];
			for(int i=0;i<=a.length-1;i++) {
				if(a[i]>=max) {
					max=a[i];
				}
			}
			System.out.println(max);
		
		
	}

}
