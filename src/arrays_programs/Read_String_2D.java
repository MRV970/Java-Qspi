package arrays_programs;
import java.util.Scanner;
public class Read_String_2D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the no.of rows");
		int row=sc.nextInt();
		System.out.println("enter the no.of coloums");
		int col =sc.nextInt();
		String s[][]=new String[row][col];
		for(int i=0;i<=s.length-1;i++) {
			for(int j=0;j<=s.length-1;j++) {
				System.out.println(i+": "+j);
				s[i][j]=sc.next();
			}
		}
		System.out.println();
		for(int i=0;i<=s.length-1;i++) {
			for(int j=0;j<=s.length-1;j++) {
				System.out.print(s[i][j]+" ");
			}
		
		System.out.println();     
	}
	}

}
