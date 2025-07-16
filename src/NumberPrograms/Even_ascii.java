package NumberPrograms;

public class Even_ascii {
	public static void main(String args[]) {
		int sum=0,count=0;
		for(char ch='a';ch<='z';ch++) {
			int xy=ch;
			if(xy%2==0) {
				sum=sum+xy;
				count++;
			}
		}
				System.out.println(sum);
				
			
		
		System.out.println(count);
	}

}
