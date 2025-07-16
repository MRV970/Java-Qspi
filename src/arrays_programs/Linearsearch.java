package arrays_programs;
import java.util.Scanner;
public class Linearsearch {
	
		static int search(int a[],int key) {
			for(int i=0;i<a.length;i++) {
				if(a[i]==key)
					return i;
				
			}
			return-1;
		}
	public static void main(String[] args) {
		int a[]= {10,45,35,70};
		System.out.println("enter the key value");
		int n=new Scanner(System.in).nextInt();
		System.out.println(search(a,n));
	}

}
