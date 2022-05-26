import java.util.Scanner;
public class binary_search
{
	int a[] = new int[50];
	int i,j,key,size;
	
	void input()
	{
		System.out.println("Enter size of the array : ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		System.out.println("Enter elements in ascending order : ");
		for(i=0; i<size; i++)
		{
			System.out.println("Enter a number for the "+(i+1)+"the position");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the Number you want to search for");
		key=sc.nextInt();
	}
		void search()
		{
			int flag,mid,pos;
			flag=0;
			pos=0;
			i=size-1;
			i=0;
			while(i<=j && flag==0)
			{
				mid = (i+j)/2;
				if(a[mid]==key)
				{
					flag=1;
					pos = mid+1;
				}
				if(a[mid]>key)
					j=mid-1;
				if(a[mid]<key)
					i=mid+1;
			}
			if(flag==1)
			{
				System.out.println("The Number :"+key+"is in the array");
				System.out.println("It is at"+pos+"position is");
			}
			else
				System.out.println("The number : "+key+" could not be found");
		}
		
		void output()
		{
			int i;
			for(i=0;i<size;i++)
				System.out.println(a[i]);
		}
		public static void main(String []args)
		{
			binary_search aa = new binary_search();
			aa.input();
			System.out.println("Array Elements are : ");
			aa.output();
			aa.search();
		}
}