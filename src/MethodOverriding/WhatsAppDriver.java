package MethodOverriding;

public class WhatsAppDriver extends WhatsApp {
	public   void status() {
		super.status();
		System.out.println("upload photos");
		
	}
	public static void main(String args[]) {
		WhatsAppDriver w1=new WhatsAppDriver();
		w1.status();
	}

}
