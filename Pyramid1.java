import java.util.*;
class Pyramid1
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int b=1;b<i;b++)
				System.out.print(" ");
			for(int j=1; j<=2*(n-i)+1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}