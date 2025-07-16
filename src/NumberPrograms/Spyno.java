package NumberPrograms;

public class Spyno {
	public static void main(String args []) {
		int no=123,sum=0;
		int a=no;
		int b=no;
	int	count=0;
		while(no>0) {
			int rem=no%10;
			count++;
			no=no/10;
			sum=sum+rem;
		}	
		
		System.out.println(sum);
	int fact=1;
	//int a=no;
	while(a>0) {
		int res=a%10;
	fact=fact*res;
	a=a/10;
	}
	System.out.println(fact);
	if(sum==fact) {
	System.out.println("Spy no "+b);
	}
	else {
		System.out.println(" not a Spy no "+b);
	}
	
}
}