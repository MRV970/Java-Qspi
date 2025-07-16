package Inheritance;

public class Monkey extends Animal1 {
String mtype="Herbivorous";
public void random() {
	System.out.println("monkey do random things");
}
public static void main(String args[]) {
	
	Monkey m1=new Monkey();
	System.out.println(m1.nooftypes);
	run();
	System.out.println(m1.mtype);
	m1.random();
	
	
	
}
}
