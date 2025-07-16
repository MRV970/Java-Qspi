package arrays;
import java.util.Scanner;
public class Double {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the size");
		int size=sc.nextInt();
		double d[]=new double[size];
		System.out.println(d.length);
		for(int i=0;i<=d.length-1;i++) {
			System.out.println("enter the index value"+i);
			d[i]=sc.nextDouble();
		}
		
		for(int i=0;i<=d.length-1;i++) {
			System.out.println(d[i]);
		}
		
		
		
		
	}

}
