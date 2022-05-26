//wrap to find product of digits of a given Number
import java.util.*;
class Pro
{
public static void main(String[]args)
{
int a, pro =1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number");
a = sc.nextInt();

while(a>0)
{
	pro = pro*a%10;
	a= a/10;
}
System.out.println("Product of Digits" +pro);
}
}