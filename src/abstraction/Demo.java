package abstraction;

public  class Demo extends Sample {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String args []) {
		Demo d1=new Demo();
		d1.add(10,20);
	}

}
