//Passing argument to function in class and object
import java.util.*;
class Reverse1
{
	int n;
	void getdata(int i)
	{
		n=i;
	}
	void putdata()
	{
		int rev = 0;
		while(n>0)
		{
			rev = (rev*10)+n%10;
			n=n/10;
		}
		System.out.println("Reverse = "+rev);
	}

	public static void main(String[]args)
	{
		int m;
		Reverse1 r = new Reverse1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to find Reverse");
		m = sc.nextInt();
		r.getdata(m);
		r.putdata();
	}
}