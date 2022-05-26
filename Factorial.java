//Find factorial of a given number
import java.util.*;
class Factorial
{
	public static void main(String[]args)
	{
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No to find factorial");		
		int a = sc.nextInt();
		while(a>0)
		{
			fact = fact * a;
			a=a-1;	
		}
		System.out.println("Factorial="+fact);
	}
}
		
