package arrays;

public class Float {
	public static void main(String args []) {
		float f1[]= new float[5];
		f1[4]=32.4f;
		f1[3]=44.4f;
		f1[1]=0.0f;
		f1[2]=f1[3];
		f1[0]=f1[1];
		System.out.println(f1[4]);
		System.out.println(f1[3]);
		System.out.println(f1[1]);
		System.out.println(f1[2]);
		System.out.println(f1[0]);
	}

}
