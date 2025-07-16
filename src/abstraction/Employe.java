package abstraction;

public class Employe {
	String name;
	double sal;
	int id;
	public Employe(String name,double sal,int id) {
		this.name=name;
		this.sal=sal;
		this.id=id;
		
		
	}
	public String toString() {
		return name+" "+sal+" "+id;
	}
	public static void main(String args []) {
		Employe e1=new Employe("mrv",55000,25);
		Employe e2=new Employe("Nithya",100000,100);
		Employe e3=new Employe("Teja",78000,234);
		Employe e4=new Employe("Nishi",60000,29);
		Employe e5=new Employe("Anu",65000,298);
		Employe e6=new Employe("Renu",45000,35);
		Employe e7=new Employe("Sai",80000,145);
		Employe e8=new Employe("Harsha",75000,75);
		Employe emp[]= {e1,e2,e3,e4,e5,e6,e7,e8};
		for(Employe e:emp) {
			System.out.println(e);
		}
	}

}
