package Encapsulation;

public class BagDriver {
public static void main(String args[] ){
Bag b1=new Bag("Lenovo","Black",2000,"laptopbag",2) ;
	System.out.println(b1.getname());
	System.out.println(b1.getcolor());
	System.out.println(b1.getprice());
	System.out.println(b1.gettype());
	System.out.println(b1.getcompartments());
	b1.setname("hp");
	System.out.println(b1.getname());
	b1.setcolor("blue");
	System.out.println(b1.getcolor());
	b1.setprice(1000.0);
	System.out.println(b1.getprice());
	b1.settype("collegebag");
	System.out.println(b1.gettype());
	b1.setcompartments(3);
	System.out.println(b1.getcompartments());
}
}

