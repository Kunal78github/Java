class CmdDemo1
{
	public static void main(String args[])
	{
		int valid,invalid,i,number;
		valid=invalid=0;
		for(i=0;i<args.length;i++)
		{
			try
			{
				number = Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e)
			{
				invalid = invalid+1;
				System.out.println("Argument ErrorL+:"+args[i]);
				continue;
			}
			valid = valid+1;
		}
			System.out.println("Total Valid Arguments="+valid);
			System.out.println("Total Invalid Arguments="+invalid);
	}
}