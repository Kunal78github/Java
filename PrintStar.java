import java.util.*;
class PrintStar
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int n = sc.nextInt();
		for(int i =1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+i);
			}
			System.out.println();
		}
	}
}