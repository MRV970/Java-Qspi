package constuctor;

public class SQLDriver {
	public static void main(String args[]) {
		SQL s1=new SQL();
		
		SQL s2=new SQL(500);
		System.out.println(s2.nopages);
		
		SQL s3=new SQL(500,"Revanth sir ");
		System.out.println(s3.nopages);
		System.out.println(s3.sirname);
		
		SQL s4=new SQL(1000.0,"Queries,theory");
		System.out.println(s4.price);
		System.out.println(s4.content);
		
		SQL s5=new SQL(500,"Revanth sir",1000.0,"Queries,theory");
		System.out.println("nopages -->> "+s5.nopages);
		System.out.println("sirname -->> "+s5.sirname);
		System.out.println("price -->> "+s5.price);
		System.out.println("content-->>  "+s5.content);
	}

}
