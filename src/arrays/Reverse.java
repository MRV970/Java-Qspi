package arrays;

public class Reverse {
	public static void main(String[] args) {
		int t[]= {12,34,23,90,9,7};
		System.out.println("length->"+t.length);
		for(int i=t.length-1;i>=0;i--) {
			System.out.println(t[i]);
		}
	}

}
