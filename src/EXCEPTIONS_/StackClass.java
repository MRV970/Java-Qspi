package EXCEPTIONS_;

public class StackClass {
	{
	try	{
	
		StackClass s1=new StackClass();
	}

	catch(StackOverflowError e){
		System.out.println("exception ends");
	}
		
	}	
	
public static void main(String[] args) {
	StackClass s1=new StackClass();
	
}
}
