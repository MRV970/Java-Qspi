package NumberPrograms;

public class Even_Odd {
	public static void main(String args[]) {
		int no=12345;
		int countE=0;
		int countO=0;
		
		while(no>0) {
			int rem=no%10;
			if(rem%2==0) {
				countE++;
				
			
			System.out.println(rem+"= even digits");
			}
			else {
				countO++;
				System.out.println(rem+"= odd digits");
				
			}
			no=no/10;
		}
		//	System.out.println(countO);
		
			System.out.println(countE+" no of even digits");
			System.out.println(countO+" no of odd digits");
}
}