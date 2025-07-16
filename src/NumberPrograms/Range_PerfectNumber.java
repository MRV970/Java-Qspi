package NumberPrograms;

public class Range_PerfectNumber {
	public void range() {
		for(int r=1;r<=200;r++) {
			 int num=r;
			 int sum=0;
			 for(int i=1;i<num;i++) {
				 if(num%i==0) {
					 sum=sum+i;
					 
				 }
			 }
			 if(sum==num) {
				 System.out.println(num+" Its a perfect no");
			 }
			 
		}
	}
	public static void main(String args []) {
		Range_PerfectNumber p1=new Range_PerfectNumber();
		p1.range();
	}
}
