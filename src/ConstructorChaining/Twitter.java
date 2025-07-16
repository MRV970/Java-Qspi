package ConstructorChaining;

public class Twitter {
    String name;
    int size;
    public Twitter() {
    	
    	System.out.println("No arg Constructor");
    }
    public Twitter(String name) {
        this(); 
       // this.name=name;
        System.out.println("Arg constructor");
        System.out.println(name);
        
        
    }
    public Twitter(int size) {
    	this("Twitter");
    	this.size=size;
    	System.out.println("Arg Constructor 1");
    	//System.out.println(size);
    }
    public  static void main(String args[]) {
    	Twitter t1=new Twitter(20);
    	//System.out.println(t1.name);
    	//System.out.println(t1.size);
    }
}
