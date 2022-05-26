import java.util.*;
class ReverseStar
{
	public static void main(String[]args)
	{
		int k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int n = sc.nextInt();
		for(;n>=1; n--)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(k);
			}
			k=k+1;
			System.out.println(); 
		}
	}
}