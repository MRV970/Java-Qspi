package WRAPPERCLASS;

public class LONG {
public static void main(String[] args) {
	
	long l=123344678l;
	System.out.println(l);
	Long l1=new Long(l);
	System.out.println(l1);
	Long l2= Long.valueOf(l);
}
}
