import java.util.*;
public class linear_search
{
	int a[] = new int[50];
	int i, size,x;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size= sc.nextInt();
		for(i=0; i<size; i++)
		{
			System.out.println("Enter a number for array");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the number you want to search");
		x=sc.nextInt();
	}
	void print()
	{
		System.out.println("Array Numbers : ");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
	void search()
	{
		int flag = 0;
		for(i=0; i<size;i++)
		{
			if(a[i]==x)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("The Number you searched for is on the "+(i+1)+"the position!");
		else
			System.out.println("The Number you searched for is not in the array!");
	}
	public static void main(String[]args)
	{
		linear_search aa = new linear_search();
		aa.input();
		aa.print();
		aa.search();
	}
}
