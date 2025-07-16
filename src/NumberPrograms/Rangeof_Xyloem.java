package NumberPrograms;

public class Rangeof_Xyloem {
	public static void main(String args[] ){
		int st=1,ed=1000;
		int count=0;
		
		for(int i=st;i<=ed;i++) {
			
			
				int no=i;
				int a=no;
				int last=no%10;
				no=no/10;
				int sum=0;
				
				while(no>10) {
					
					int rem=no%10;
					sum=sum+rem;
					no=no/10;
					
				}
				int res=last+no;
				//System.out.println(res);
				//System.out.println(sum);
				if(sum==res) {
					count++;
					System.out.println("xyleam number "+a);
				}
		} 
				System.out.println(count);
		
	}

}
