package NumberPrograms;

public class Rangeofsunny {
public static  void main(String []args) {
int	count=0;
for(int i=1;i<=100;i++) {
	int no=i;
	int no1=no+1;
	int n=0;
	
	//boolean f=true;
	for(int j=1;j<=no;j++) {
		if(j*j==no1) {
			count++;
			n=j;
			//f=false;
			break;
		}
	}
			if(n!=0) {
				System.out.println("Its a Sunny number"+no);
				
			}
			
		
	}
System.out.println(count);




	
}
}
