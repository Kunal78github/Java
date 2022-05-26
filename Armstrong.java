import java.util.*;
class Armstrong
{
		public static void main(String[]args)
		{
			int n,z,count=0,digit,i,pro,sum=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter an Number");
			n = sc.nextInt();
			z=n;
			while(z>0)
			{
				count=count+1;
				z=z/10;
			}
			System.out.println("No of Digits = "+count);
			z=n;
			while(z>0)
			{
				digit=z%10;
				pro=1;
				for(i=1; i<=count;i++)
				{
					pro = pro*digit;
					sum=sum+pro;
					z=z/10;
				}
				if(sum==n)
					System.out.println("Armstrong");
				else
					System.out.println("Not ArmStrong");
			}
		}
}