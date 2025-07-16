package String_JClass;

public class StringBuffer_StringBuilder {
	public static void main(String[] args) {
		long st=System.nanoTime();
		StringBuffer s =new StringBuffer("synchronized");
		StringBuffer s1=new StringBuffer("");
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1.append(s.charAt(i));
			
		}
		System.out.println(s1);
		long ed=System.nanoTime();
		System.out.println(ed-st);
		System.out.println("------");
		
		long st1=System.nanoTime();
		StringBuilder sb =new StringBuilder("synchronized");
		StringBuilder sb1=new StringBuilder("");
		for(int i=sb.length()-1;i>=0;i--) {
			sb1=sb1.append(sb.charAt(i));
		}
		System.out.println(sb1);
		long ed1=System.nanoTime();
		System.out.println(ed1-st1);
		
		
		
	}

}
