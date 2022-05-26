import java.util.*;
class PrimeClass
{
	int n;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Check");
		n = sc.nextInt();
	}
	void putdata()
	{
		int i,count=0;
		for(i=1; i<=n; i++)
		{
			if(n%i==0)
				count=count+1;
		}
		if(count==2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
	public static void main(String[]args)
	{
		PrimeClass p = new PrimeClass();
		p.getdata();
		p.putdata();
		
	}
}