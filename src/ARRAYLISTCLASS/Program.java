package ARRAYLISTCLASS;
import java.util.ArrayList;
public class Program {
	public static void main(String[] args) {
		ArrayList<String>l1=new ArrayList();
		l1.add("Java");
		l1.add("c");
		l1.add("c++");
		l1.add("Python");
		System.out.println(l1.get(0));
		System.out.println("---");
		for(int i=0;i<=l1.size()-1;i++) {
			System.out.println(l1.get(i));
		}
		
	}

}
          