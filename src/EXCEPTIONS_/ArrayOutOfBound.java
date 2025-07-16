package EXCEPTIONS_;

public class ArrayOutOfBound {
	public static void main(String[] args) {
		int a[]= {10,20,30,50,60};
		try {
			
		
		for(int i=0;i<=a.length;i++) {
			//try {
			System.out.println(a[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception ends");
		
	}
	}
	}
