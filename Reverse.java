import java.util.*;
class Reverse
{
public static void main(String[]args)
{
int a,rev=0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter number to reverse");
a = sc.nextInt();
while(a>0)
{
rev= (rev*10)+(a%10);
a= a/10;
}
System.out.println(rev);
}
}

