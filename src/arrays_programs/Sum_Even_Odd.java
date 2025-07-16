package arrays_programs;
import java.util.Scanner;
public class Sum_Even_Odd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no.of rows");
	int row=sc.nextInt();
	System.out.println("enter the no.of columns");
	int col=sc.nextInt();
	int s[][]=new int[row][col];
	for(int i=0;i<=s.length-1;i++) {
		for(int j=0;j<=s.length-1;j++) {
			System.out.println(i+":"+j);
			s[i][j]=sc.nextInt();
		}
	}
	int E_Sum=0;
	int O_Sum=0;
	for(int i=0;i<=s.length-1;i++) {
		for(int j=0;j<=s.length-1;j++) {
			if(s[i][j]%2==0) {
				E_Sum+=s[i][j];
				
			}
			else {
				O_Sum+= s[i][j];
				//
				System.out.println(O_Sum);
			}
		}
		
	}
	System.out.println(E_Sum);
	System.out.println(O_Sum);
	
}
}
