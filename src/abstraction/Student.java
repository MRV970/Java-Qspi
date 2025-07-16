package abstraction;

public class Student {
	String name;
	int id;
	String email;
	public Student(String name,int id,String email) {
		this.name=name;
		this.id=id;
		this.email=email;
		
	}
	public String toString() {
		return name+" "+id+" "+email;
	}
	public static void main(String args []) {
		Student s=new Student("mrv",4563,"midderaghavamma@gmail.com");
		System.out.println(s.name);
		System.out.println(s.id);
		System.out.println(s.email);
	}

}
