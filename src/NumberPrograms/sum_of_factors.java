package NumberPrograms;

public class sum_of_factors {
public static void main(String args[]) {
	int st=1,ed=18,sum=0;
	for(int i=st;i<=ed;i++) {
		if(ed%i==0) {
			sum=sum+i;
			System.out.println(i);
			
	}
	}
	System.out.println(sum);
}
}
