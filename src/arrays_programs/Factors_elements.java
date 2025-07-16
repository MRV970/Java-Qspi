package arrays_programs;

public class Factors_elements {
	public static void main(String args [] ){
		int a[]= {10,20,30,40};
			
		for(int i=0;i<=a.length-1;i++) {
			
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					System.out.println(j+"factors of numbers"+a[i]);
				}
			}
			System.out.println();
		}
		
	}

}
