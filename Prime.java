import java.util.*;
class Prime
{
public static void main(String[]args)
{
int n, count = 0,i;
Scanner sc= new Scanner(System.in);
System.out.println("Enter Number to Check:");
n = sc.nextInt();
i=1; //Intialization
while(i<=n)
{
	if(n%i==0)
		count=count+i;
	i=i+1;
}
if(count==2)
	System.out.println("Prime");
else	
	System.out.println("Not Prime");
}
}
	