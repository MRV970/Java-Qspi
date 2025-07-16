package arrays;
import java.util.Scanner;
public class Sample {
	public static void main(String args []) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter the size of an Array");
	int size= sc.nextInt();
	char ch[]=new char[size];
	System.out.println(ch.length);
	for(int i=0;i<=ch.length-1;i++) {
		System.out.println(" enter the value in the index"+i);
		ch[i]=sc.next().charAt(0);
	}
	for(int i=0;i<=ch.length-1;i++ ) {
		System.out.println(ch[i]);
	}
	}

}
