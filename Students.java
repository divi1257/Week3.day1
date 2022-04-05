package Week3.day3.ass2.ass5;

public class Students {
	
	public void getStudentInfo(int a)
	{
		System.out.println(a);
	}
	public void getStudentInfo(int a,String b,int c, double d)
	{
		System.out.println(a+b+c+d);
	}
	public void add(int a,int i) {
		System.out.println(a+i);
		
	}

	public static void main(String[] args) {
		Students std = new Students();
		std.add(3,7);
		std.getStudentInfo(3);
		std.getStudentInfo(5, null, 3, 5463.21);

	}

}
