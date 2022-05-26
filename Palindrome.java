import java.util.*;
class Palindrome
{
public static void main(String[]args)
{
int a,z,rev=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter A Number");
a = sc.nextInt();
z=a;
while(a>0)
{
	rev = (rev*10)+a%10;
	a=a/10;
	if(rev==z)
	System.out.println("Number is palindrome");
	else
	System.out.println("This Number is not palindrome");
}
}
}