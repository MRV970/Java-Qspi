package arrays_programs;
import java.util.Scanner;
public class Sum_Diagonal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of rows");
		int row=sc.nextInt();
		System.out.println("enter the no.of coloumns");
		int col=sc.nextInt();
		int s[][]=new int [row][col];
		for(int i=0;i<=s.length-1;i++) {
			for(int j=0;j<=s.length-1;j++) {
				System.out.println(i+":"+j);
				s[i][j]=sc.nextInt();
				
			}
		}
		int Dsum=0;
		for(int i=0;i<=s.length-1;i++) {
			for(int j=0;j<=s.length-1;j++) {
				if(i==j || i+j==s.length-2) {
					Dsum+=s[i][j];
					//System.out.println(Dsum);
				}
				}
			}
			System.out.println(Dsum);
		
		
	}

}
