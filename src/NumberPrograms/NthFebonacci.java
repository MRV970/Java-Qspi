package NumberPrograms;

public class NthFebonacci {
public static void main(String args []) {
	int F1=0;
	int F2=1;
	int F3=0;
	for(int i=1;i<=10;i++) {
		F3=F1+F2;
		F1=F2;
		F2=F3;
	}
	System.out.println(F3);
}

}
