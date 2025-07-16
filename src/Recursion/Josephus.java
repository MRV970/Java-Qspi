package Recursion;

import java.util.Scanner;

public class Josephus {
	static int jos(int n,int r) {
		if(n==1)return 0;
		return ((jos(n-1,r)+r)%n);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number of persons");
	int n=sc.nextInt();
	System.out.println("enter the ratio");
	int r=sc.nextInt();
	System.out.println(jos(n,r)+1);
}
}
