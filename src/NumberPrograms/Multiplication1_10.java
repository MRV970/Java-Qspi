package NumberPrograms;

public class Multiplication1_10 {
public static void main(String args[]) {
	int st=1,ed=10;
	for(int i=st;i<=ed;i++) {
		System.out.println("-----");
		for(int j=1;j<=10;j++) {
			int res=i*j;
			System.out.println(i+"*"+j+"="+res);
			
		}
	}
}
}