class runnabletest
{
	public static void main(String[]args)
	{
		A aa = new A();
		Thread tt = new Thread(aa);
		tt.start();
		System.out.println("End of Main Thread");
	}
}
class A implements Runnable
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Thread A"+i);
			
		}
		System.out.println("End of Thread A");
	
	}
}