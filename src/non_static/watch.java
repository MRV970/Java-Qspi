package non_static;

public class watch {
	String cname="TOMI";
	double price=250;
	String colour="Gold";
	public void time() {
		System.out.println(cname);
		System.out.println(price);
		System.out.println("seeing time");
		
	}
	public void alaram() {
		System.out.println(cname);
		System.out.println(price);
		System.out.println(colour);
		System.out.println("setting alaram");
		
	}
public static void main(String args[] ){
	watch w=new watch();
	System.out.println(w.cname);
	System.out.println(w.colour);
	w.time();
	w.alaram();
			
}
}
