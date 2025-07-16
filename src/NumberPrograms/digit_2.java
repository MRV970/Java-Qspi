package NumberPrograms;

public class digit_2 {
	public static void main(String args[]) {
		int no=1234;
		int count=0;
		while(no>=100) {
			int rem=no%10;
			count++;
			no=no/10;
			
		}
		System.out.println(no);
		//int no1=no;
		int res=no%10;
		System.out.println(res);
	}

}
