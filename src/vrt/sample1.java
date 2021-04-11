package vrt;

public class sample1 {
public static void main(String[] args) {
	//calling regular static method from same class
	m1();
	//method name();
	
	System.out.println("lambun uchalaleli method= ");
	cat2.m2();
	
	System.out.println("lambun aleli non static=");
	nonst l1=new nonst();
	l1.m3();
	
	
	
	
}
public static void m1() {
	
	System.out.println("hello");
}

}
