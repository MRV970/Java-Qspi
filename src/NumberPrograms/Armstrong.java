package NumberPrograms;
import java.util.Scanner;
public class Armstrong {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int no=sc.nextInt();
		int count=0;
		int no1=no;
		int no2=no;
		int sum=0;
		while(no>0) {
			int rem=no%10;
			count++;
			no=no/10;
			
		}
		System.out.println(no);
		System.out.println(count);
		while(no1>0) {
			int rem=no1%10;
			int mul=1;
			for(int i=1;i<=count;i++) {
				mul=mul*rem;
				
			}
			sum=sum+mul;
			no1=no1/10;
		}System.out.println("------");
		System.out.println(no1);
		System.out.println(sum);
		System.out.println("------");
		if(sum==no2) {
			System.out.println(sum+" Its Armstrong Number");
			
		}
		else {
			System.out.println(sum+" Its Not an Armstrong Number");
		}
	}

}
	
	


