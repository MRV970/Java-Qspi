package Encapsulation;

public class OrderDriver {
public static void main(String args[]) {
	Order o1=new Order("chair",2345,500.0,true);
System.out.println(o1.getname());
System.out.println(o1.getid());
System.out.println(o1.getprice());
System.out.println(o1.getpay());
o1.setname("pen");
System.out.println(o1.getname());
o1.setid(3456);
System.out.println(o1.getid());
o1.setprice(20.0);
System.out.println(o1.getprice());
o1.setpay(false);
System.out.println(o1.getpay());

}
}