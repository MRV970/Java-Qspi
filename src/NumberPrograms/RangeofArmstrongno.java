package NumberPrograms;

import java.util.Scanner;

public class RangeofArmstrongno {
	public static int count(int no) {
		int count=0;
		while(no>0) {
			int rem=no%10;
			count++;
			no=no/10;
			
		}
		return count;
}
	public static int sumofpower(int no) {
		int no1=no;
		int sum=0;
		while(no>0) {
			int rem=no%10;
			int mul=1;
			for(int i=1;i<=count(no1);i++) {
				mul=mul*rem;
			}
			
		
		sum=sum+mul;
		no=no/10;
	}
		return sum;
}
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start point");
		int st=sc.nextInt();
		System.out.println("enter the end point");
		int ed=sc.nextInt();
		int count=0;
		for(int i=st;i>=ed;i--) {
			if(sumofpower(i)==i) {
				count++;
				System.out.println("Armstrong Number"+i);
			}
		}
		System.out.println("Number of armstrong numbers"+count);
		
		
	}
}