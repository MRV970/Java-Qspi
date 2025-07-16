package arrays_programs;
import java.util.Scanner;
public class Sum_2D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of rows");
		int row=sc.nextInt();
		System.out.println("enter the no.of coloumns");
		int col=sc.nextInt();
		int s1[][]=new int[row][col];
		for(int i=0;i<=s1.length-1;i++) {
			for(int j=0;j<=s1.length-1;j++) {
				System.out.println(i+":"+j);
				s1[i][j]=sc.nextInt();
			}
		}
		System.out.println("-------");
		int sum=0;
		for(int i=0;i<=s1.length-1;i++) {
			for(int j=0;j<=s1.length-1;j++) {
				sum=sum+s1[i][j];
				
			}
		}
		System.out.println("sum ="+sum);
	}

}
