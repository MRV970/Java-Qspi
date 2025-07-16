package arrays_programs;

public class Prime_Elements {
	public static void main(String args []) {
		int a[]= {12,21,23,32,50};
		int count=0;
		int p=a[0];
		for(int i=0;i<=a.length-1;i++) {
		
			if(p%i==0){
			int	p1=a[i];
				count++;
			
		
		
			if(count==2){
			
			System.out.println(p1);
			}
		}
	}}


}
