import java.util.*;
class Digit1
{
public static void main(String[]args)
{
int n,sum=0,pro=1,digit;
Scanner sc =new Scanner(System.in);
System.out.println("Enter a number");
n = sc.nextInt();
while(n>0)
{
	digit = n%10;
	if(n%2==0)
		sum = sum+digit;
	else
		pro=pro+digit;
	n = n/10;
}
System.out.println("Addition of the Even = "+sum+"\nMultiplication of odd="+pro);
}
}