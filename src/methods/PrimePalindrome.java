package methods;
import java.util.Scanner;
public class PrimePalindrome {
	public static int primepalindromeno(int n) {
		int count=0;
		int r=0;
		for(int j=1;j<=n;j++)
		{
			if(n%j==0)
			{
				count++;
				
				
			}
			
		}
		if(count==2)
		{
			int rev=0;
			int temp=n;
			while(n>0)
			{
				int rem=n%10;
				rev=rev*10+rem;
				n=n/10;
				
			}
			if(temp==rev)
			{
				r=temp;
				
			}
		}
		return r;
		
	}
public static void main(String args []) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  the start value");
	int st=sc.nextInt();
	System.out.println("enter  the end value");
	int ed=sc.nextInt();
	for(int i=st;i<=ed;i++)
	{
		int res=primepalindromeno(i);
		if(res!=0)
		{
			System.out.println(i+"is a prime palindrome");
		}
	}
	
}
}
