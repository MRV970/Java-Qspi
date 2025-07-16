package NumberPrograms;

public class Rangeof_automorphic {
	public static void main(String args[]) {
		
		int count=0,count1=0;
		int sum=0;
		int sum1=0;
	
	for(int i=1;i<=100;i++) {
		
		int no=i;
		int no1=no;
		
		int sq=no*no;
		boolean flag=true;
		while(no>0) {
			if(no%10==sq%10) {
				no=no/10;
				sq=sq/10;
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			count++;
			//System.out.println("automorphic no "+no1);
			sum=sum+no1;
		}
		
		else {
			count1++;
			//System.out.println("non automorphic no "+no1);
			sum1=sum1+no1;
		
	}
		
	}
	System.out.println(count+" no of  automorphic nos");
	System.out.println(count1+" no of non automorphic nos");
	System.out.println(sum+" sum of automorphic nos");
	System.out.println(sum1+" sum of non automorphic nos");
	}
}
