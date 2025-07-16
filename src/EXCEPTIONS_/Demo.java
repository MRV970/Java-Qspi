package EXCEPTIONS_;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\RAGHAVAMMA\\Desktop\\FILE\\Demo.java");
		System.out.println(f.createNewFile());
	}


}
