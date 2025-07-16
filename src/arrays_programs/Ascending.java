package arrays_programs;

public class Ascending {
public static void main(String args []) {
	int a[]= {34,54,4,9,789};
	for(int i=0;i<=a.length-1;i++) {
		
	
	int temp=a[i];
	
	for(int j=0;j<=a.length-1;j++) {
		if(a[j]>temp) {
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			
		}
	}
	}
		for(int i:a) {
			
		
	
	System.out.println(i);
}
}
}
