package String_Programs;

public class STring_Caps {
	public static void main(String[] args) {
		String s=" EAST OR WEST";
		String res="";
		if(s.charAt(0)!=' ') {
			res=res+(char)(s.charAt(0)-32);
		}
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i-1)==' '&& s.charAt(i)!=' ') {
				res=res+(char)(s.charAt(i)-32);
			}
			else {
				res+=s.charAt(i);
			}
		}
		System.out.println(res);
	}
	}


