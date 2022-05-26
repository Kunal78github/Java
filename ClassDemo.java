import java.util.*;
class ClassDemo
{
	int a,b;//Class Variable
	void getdata()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Number");
	a = sc.nextInt();
	System.out.println("Enter Second number");
	b = sc.nextInt();
	}
	void putdata()
	{
		System.out.println("Addition="+(a+b));
	}
	public static void main(String[]args)
	{
		ClassDemo cd = new ClassDemo();
		cd.getdata();
	}
}