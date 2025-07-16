package arrays_programs;

public class Prime_element {
	public static void main(String args []) {
		int a[]= {12,21,23,32,50};
		
		for(int i=0;i<=a.length-1;i++) {
			int count=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0){
				count++;
			}
		
			}
			if(count==2){
			
			System.out.println("Prime->"+a[i]);
		
		}
	}}

}
