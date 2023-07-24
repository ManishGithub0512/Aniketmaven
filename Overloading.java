package Polymormshim;

public class Overloading {

	private double sum;

	public  void addition1 (int a, int b) {
		 sum = a+b;
		System.out.println("sum of two n." +sum);	
	}

	public void  addition(double d, double e ,double f ) {
		sum= d+e+f;
		System.out.println("sum of three n."+ sum);
		
}
	public void addition(int a, int b, int c, int d) {
		sum =a+b+c+d;
		System.out.println("sum of four n. "+ sum);
	}
	public void addition(float a, float b , float c) {
		 sum = Float(a+b+c);
		System.out.println("sum f three n."+sum);
	}

	private float Float(float f) {
		// TODO Auto-generated method stub
		return 0;	
	}

		
	}

