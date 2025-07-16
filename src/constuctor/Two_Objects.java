package constuctor;

public class Two_Objects {
	String name;
	double sal;
	public Two_Objects(String name,double sal) {
		this.name=name;
		this.sal=sal;
	}
	{
		System.out.println("Non static block");
	}

}
