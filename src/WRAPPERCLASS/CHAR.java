package WRAPPERCLASS;

public class CHAR {
	public static void main(String[] args) {
		char ch='A';
		System.out.println(ch);
		Character ch1=new Character(ch);
		System.out.println(ch1);
		Character ch2=Character.valueOf(ch);
	}

}
