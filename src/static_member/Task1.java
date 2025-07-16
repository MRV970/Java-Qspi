package static_member;

public class Task1 {
	public static void demo1() {
		System.out.println("Task 1 class Method");
		
	}
	public static void main(String [] args) {
		demo1();
		System.out.println(Task.s1);
		System.out.println(Task.t1);
		Task.demo();
		
	}

}
