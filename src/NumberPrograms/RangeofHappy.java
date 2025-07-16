package NumberPrograms;

public class RangeofHappy {
public static void main(String args[]) {
	int st=1,ed=100;
	int count=0;
	for(int i=st;i<=ed;i++) {
		int no=i;
		int no1=no;
		
		while(true) {
			int sum=0;
			int sq=1;
			while(no>0) {
				
				
				int rem=no%10;
			sq=rem*rem;
				sum=sum+sq;
				no=no/10;
			}
			
			 no=sum;
			if(no==1) {
				
				System.out.println("happy no"+no1);
				count++;
			break;
			}
				else if(no==4){
			//System.out.println(count);
					break;
				}
			}
			
	}
		System.out.println("Happy nuber"+count);
	}
	}