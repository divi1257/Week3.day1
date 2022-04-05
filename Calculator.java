package Week3.day3;

public class Calculator {

	
		public void add(int a,int  b)
		{
			System.out.println(a+b);
		}
		public void add(int c, int d, int e)
		{
			System.out.println(c+d+e);
		}
		
		public void sub(int a,int  b)
		{
			System.out.println(a-b);
		}
		public void sub(int c, int d, int e)
		{
			System.out.println(c-d-e);
		}
		
		public void multiply(int a,int  b)
		{
			System.out.println(a*b);
		}
		public void add(int g,double  i)
		{
			System.out.println(g*i);
		}
		public void divide(int g,  int b)
		{
			System.out.println(g/b);
		}
		public void divide(double h,  double i)
		{
			System.out.println(h/i);
		}
		public static void main(String[] args) {
	

          Calculator overload = new Calculator();
           overload.add(3, 5);
           overload.sub(15, 3, 2);
           overload.divide(10, 5);
           overload.multiply(4, 2);
}
}
