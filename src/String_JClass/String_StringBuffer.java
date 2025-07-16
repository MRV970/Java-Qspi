package String_JClass;

public class String_StringBuffer {
	public static void main(String[] args) {
		long st=System.nanoTime();
		// this is static method which present inside system class 
		// is used to count the time in nanoseconds according to  sysytemtime for execution
		
		String s1="synchronized";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
			
		}
		System.out.println(s2);
		long ed=System.nanoTime();
		System.out.println(ed-st);
		System.out.println("------");
		long st1=System.nanoTime();
		StringBuffer sb= new StringBuffer("synchronized");
		StringBuffer sb1=new StringBuffer("");
		for(int i=sb.length()-1;i>=0;i--) {
			sb1=sb1.append(sb.charAt(i));
			
		}
		System.out.println(sb1);
		long ed1=System.nanoTime();
		System.out.println(ed1-st1);
	}

}
