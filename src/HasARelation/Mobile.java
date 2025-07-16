package HasARelation;

public class Mobile {
	String name,color;
	Mobile(String name,String color){
		this.name=name;
		this.color=color;
	}
	Playstore pid;
	public void installPlaystore() {
		pid=new Playstore();
		System.out.println("Playstore installed successfully");
	}

}
