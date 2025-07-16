package NumberPrograms;

public class Range_StrongNumber {
public static void main(String args[]) {
	for(int i=200;i>=1;i--) {
		int a=i;
		int b=a;
		int sum=0;
		while(a>0) {
			int fact=1;
			int rem=a%10;
			for(int j=1;j<=rem;j++) {
				fact=fact*j;
				
			}
			sum=sum+fact;
			a=a/10;
		}
			if(sum==b) {
				System.out.println(b+"is a strong number");
			}
			//else {
			//	System.out.println(b+"is not a Strong number");
			//}
		}
	}
	
}

