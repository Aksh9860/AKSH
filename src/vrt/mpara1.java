package vrt;

public class mpara1 {

	public static void main(String[] args) {
		System.out.println("Addition= "); x1(8,5);
		
		mpara2 o5=new mpara2();
		System.out.println("Multiplication= ");
		o5.x2(5,6);
		
		mpara1 o7=new mpara1();
		System.out.println("subtraction= ");
		o7.x6(10,4);
		

	}
	public static void x1(int a,int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	
	public void x6(int q,int w)
	{
		int y=q-w;
		System.out.println(y);
	}

}
