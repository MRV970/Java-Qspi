package abstraction;

public class Person3 {
	String name;
	int age;
	long c_no;
	Person3(String name,int age,long c_no){
		this.name=name;
		this.age=age;
		this.c_no=c_no;
		
	}
	public String toString() {
		return name+" "+age+" "+c_no;
}
	public boolean  equals(Object obj) {
		Person3 p1=(Person3)obj;
		return this.name==p1.name&& this.age==p1.age&& this.c_no==p1.c_no;
	}
	public static void main(String args []) {
		Person3 p1=new Person3("Ahi",25,1234567899l);
		System.out.println(p1);
		Person3 p2=new Person3("Ahi",25,1234567899l);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
	}

}
