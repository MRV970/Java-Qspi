package NumberPrograms;

public class Sumofprimefactors {
	public static void main(String args[]) {
		int no=14;
		int sum=0;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
			int	no1=i;
			int count=0;
			
			for(int j=1;j<=no1;j++) {
				if(no1%j==0) {
					count++;
				}
				
			}
				
			
			if(count==2) {
				sum=sum+no1;
				System.out.println("prime factors"+no1);
			
			
				//sum=sum+no1;
			}
			}
			}
			
		
			System.out.println(sum);
				
				
			
		
		
	}
}
	


