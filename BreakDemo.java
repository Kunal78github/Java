class BreakDemo
{
	public static void main(String[]args)
	{
		int i;
		i = 0;
		while(i<=10)
		{
			i = i+1;
			System.out.println(i);
			if(i==5)
				break;
			System.out.println(i);
		}
		System.out.println("Exection done");
		}
		
	}