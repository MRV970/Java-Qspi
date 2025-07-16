package constuctor;

public class SQL {
	int nopages;
	String sirname;
	double price;
	String content;
	public SQL() {
		System.out.println("Executing Queries,studying Theory");
		
	}
	public SQL(int Nopages) {
		nopages=Nopages;
		System.out.println(Nopages);
	}
	public SQL(int nopages, String sirname) {
		this.nopages=nopages;
		this.sirname=sirname;
	}
	public SQL(double price,String content) {
		this.price=price;
		this.content=content;
		
	}
	public SQL(int nopages,String sirname,double price,String content) {
		this.nopages=nopages;
		this.sirname=sirname;
		this.price=price;
		this.content=content;
		
	}

}
