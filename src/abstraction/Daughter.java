package abstraction;

public class Daughter implements Father,Mother {
	public void responsibility() {
		System.out.println(" Father is my Hero");
	}
	public void affection() {
		System.out.println("Mother is my Strength");
	}
	public static void main(String args []) {
		Daughter d=new Daughter();
		System.out.println(s1);
		System.out.println(s2);
		d.responsibility();
		d.affection();
		
	}

}
