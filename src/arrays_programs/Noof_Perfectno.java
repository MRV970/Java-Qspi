package arrays_programs;

public class Noof_Perfectno {
	public static void main(String args []) {
		int a[]= {2,3,6,18,28};
		int count=0;
			for(int i=0;i<=a.length-1;i++) {
				int sum=0;
				for(int j=1;j<a[i];j++) {
					if(a[i]%j==0) {
						sum=sum+j;
					}
				}
				
			
			if(sum==a[i]) {
				count++;
				System.out.println("perfectno-> "+ a[i]);
			}	
			}
			System.out.println(count);
		}
	}


