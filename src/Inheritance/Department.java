package Inheritance;

public class Department extends College{
	String bname="MPC,MPCS";
	int noofdept=10;
	public void practicals() {
		System.out.println("conducting practicals");
		
	}
	public static void main(String args[]) {
		Department d1=new Department();
		System.out.println(d1.name);
		System.out.println(d1.place);
		System.out.println(d1.name);
		System.out.println(d1.noofdept);
		results();
		d1.external_exams();
		d1.practicals();
	}

}
