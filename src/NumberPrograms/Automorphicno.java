package NumberPrograms;

public class Automorphicno {
	public static void main(String args[]) {
	int no=25;
	int no1=no;
	int sq=no*no;
	boolean flag=true;
	while(no>0) {
		if(no%10==sq%10) {
			no=no/10;
			sq=sq/10;
			
		}
		else {
			flag=false;
			break;
		}
	}
	if(flag==true) {
		System.out.println("its an automorphic no "+no1);
	}
	else {
		System.out.println("its not an automorphic no "+no1);
	}
	
	
	}

}
