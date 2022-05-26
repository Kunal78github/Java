import java.util.*;
class Print
{
public static void main(String[]args)
{
int a,n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number which upto you have to print");
n = sc.nextInt();
a=1;
while(a<=n)
{
System.out.println(a);
a=a+1;
}
}
}