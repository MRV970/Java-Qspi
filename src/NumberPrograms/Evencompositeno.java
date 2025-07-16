package NumberPrograms;

public class Evencompositeno {
	public static void main(String args []) {
		int st=1,ed=20;
		int	sum=0;
		for(int i=st;i<=ed;i++) {
			int count=0;
			int no=i;
			for(int j=1;j<=no;j++) {
				if(no%j==0) {
					count++;
				
					
				}
			}
			if(count!=2) {
			if(no%2==0) {
				sum=sum+no;
				
		
			}
			}
		}
	
			
			
				System.out.println("sum of the even composite nos is "+sum);
			
		
			
		}	}


