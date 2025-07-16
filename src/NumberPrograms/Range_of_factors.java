package NumberPrograms;

public class Range_of_factors
{
	public int range(int no) {
		int sum=0;
		for(int i=1;i<no;i++) {
			if(no%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String args []) {
		Range_of_factors s1=new Range_of_factors();
		for(int i=1;i<=200;i++) {
			if(s1.range(i)==i) {
				System.out.println(i+" it is a perfect number");
			}
		}
	}
		
}