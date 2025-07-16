package NumberPrograms;
import java.util.Scanner;

public class ArmstrongNo {
	public static int counts(int no) {
		int count=0;
		while(no>0) {
			int rem=no%10;
			count++;
			no=no/10;
		}
		System.out.println("count="+count);
		return count;
			
		}
		public static int sum(int no) {
			int count=counts(no);
			int sum=0;
			while(no>0) {
				int mul=1;
				int rem=no%10;
				for(int i=1;i<=count;i++) {
					mul=mul*rem;
				}
				sum=sum+mul;
				no=no/10;
			}
			System.out.println("sum of the numbers="+sum);
			return sum;
		}
		public static void compare(int no) {
			if(no==sum(no)) {
				System.out.println(no+"="+"Its Armstrong number");
			}
			else {
				System.out.println(no+"="+"Its  Not an Armstrong number");
			}
		}
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int no=sc.nextInt();
			compare(no);
		}
	}
	
	


