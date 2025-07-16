package arrays_programs;

public class E_O_P {
	public static void main(String []args) {
		int a[]= {2,3,4,5,7,11,6,8,10};
		int E_count=0;
		int O_count=0;
		int P_count=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				E_count++;
				
			}
			else {
				O_count++;
			}
			int count=0;
			for(int j=1;j<=a[i];j++) {
				
				if(a[i]%j==0) {
					count++;
				}
				
			}
			if(count==2) {
				P_count++;
			}
		}
		System.out.println("even count->"+E_count);
		System.out.println("odd count->"+O_count);
		System.out.println("prime count->"+P_count);
		
	}

}
