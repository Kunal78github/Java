import java.util.*;

class Number
{
	public static void main(String []args)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		a= sc.nextInt();
		if(a>0)
		{
			System.out.println("Number is Positive");
		}
		else if(a<0)
		{
			System.out.println("Number is Negative");
		}
		else
		{
			System.out.println("Number is 0");
		}
	}	
}
