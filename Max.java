import java.util.*;
class Max
{
public static void main(String []args)
{
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number");
a = sc.nextInt();
System.out.println("Enter Second Number");
b = sc.nextInt();
System.out.println("Enter Third Number");
c = sc.nextInt();
if(a>b && a>c)
{
System.out.println("Max is = " +a);
}
else if(b>a && b>c)
{
System.out.println("Max is = " +b);
}
else
{
System.out.println("Max is = " +c);
}
}
}
