package arrays_programs;

public class Second_largest {
	public static void main(String args []) {
		int a[]= {25 ,30 ,56,20};
		int first=a[0];
		int second=a[1];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>first) {
				second=first;
			first=a[i];
		}
			else if(a[i]>second&& a[i]!=first){
				second=a[i];
			}
	
	}
		System.out.println(first+"->first largest element");
        System.out.println(second+"-> second largest element");

	}


}
