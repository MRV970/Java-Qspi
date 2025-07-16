package abstraction;

public class Employee {
	String name;
	int id;
	long c_no;
	public Employee(String name,int id,long c_no) {
		this.name=name;
		this.id=id;
		this.c_no=c_no;
	}
	public int hashCode() {
		return id;
	}
	public String toString() {
		System.out.println("Employee name->"+name);
		System.out.println("Employee id->"+id);
		System.out.println("Employee c_no ->"+c_no);
		return " ";
		
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee("mrv",142,1234567899l);
		System.out.println(e1);
		System.out.println(e1.hashCode());
		System.out.println("-------");
		Employee e2=new Employee("Nishi",321,23354657l);
		System.out.println(e2);
		System.out.println(e2.hashCode());
		System.out.println(e1.hashCode()==e2.hashCode());
		
		
	}

}
