package abstraction;

public class MRV {
	String name;
	int id;
	long c_no;
	public MRV(String name,int id,long c_no) {
		this.name=name;
		this.id=id;
		this.c_no=c_no;
	}
	public int hashCode() {
		return (int)c_no;
	}
	public String toString() {
		System.out.println("E_name ->"+name);
		System.out.println("E_id->"+id);
		System.out.println("E_c_no ->"+c_no);
		return " ";
	}
	public static void main(String[] args) {
		MRV m=new MRV("Raghavamma",24354,9951403199l);
		System.out.println(m);
		System.out.println(m.hashCode());
		//MRV m2= new MRV ("mrv",123,23243543l);
		//System.out.println(m2);
	//	System.out.println(m2.hashCode());
		//System.out.println(m.hashCode()==m2.hashCode());
	}

}
