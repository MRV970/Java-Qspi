package constuctor;

public class Student {
	String Name;
	int Id;
	String Email;
	public Student(String name,int id,String email) {
		Name=name;
		Id=id;
		Email=email;
	}
	public static void main(String args []) {
		Student s1=new Student("ram",3245,"mrv@gmail.com");
		System.out.println(s1.Name);
		System.out.println(s1.Id);
		System.out.println(s1.Email);
		
	}

}
