package Inheritance;

public class WhatsappDriver extends Whatsapp{
	double money=20000;
	String sms="hi";
	public static void main(String args []) {
		WhatsappDriver d1=new WhatsappDriver();
		System.out.println(d1.name);
		System.out.println(d1.no);
		System.out.println(d1.money);
		System.out.println(d1.c_no);
		System.out.println(d1.sms);
	}
	

}
