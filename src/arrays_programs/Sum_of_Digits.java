package arrays_programs;

public class Sum_of_Digits {

	public static void main(String[] args) {
		int s[]= {12,13,14,15};
		for(int i=0;i<s.length;i++) {
			int sum=0;
			int j=s[i];
			while(s[i]>0) {
				int rem=s[i]%10;
				sum=sum+rem;
				s[i]/=10;
			}
			System.out.println(sum+"sum of "+j);
		}

	}

}
