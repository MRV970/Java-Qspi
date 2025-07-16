package NumberPrograms;

public class Compositeno {
public static void main(String args[]) {
	int no=18,count=0;
	for(int i=1;i<=no;i++) {
		
		if(no%i==0) {
			count++;
		}
	}if(count==2) {
			System.out.println(" not acomposite number"+no);
		}
		else {
			System.out.println("its a composite number"+no);
		}
	}
}

