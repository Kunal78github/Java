import java.util.*;
class Calculator
{
public static void main(String[]args)
{
int a,b,ch;
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number");
a = sc.nextInt();
System.out.println("Enter Second Number");
b = sc.nextInt();
System.out.println("Enter Choice \n1)Addition \n2)Subtraction \n3)Multiplication \n4)Division");
ch = sc.nextInt();

if(ch==1)
System.out.println("Addition="+(a+b));
else if(ch==2)
System.out.println("Subtraction="+(a-b));
else if(ch==3)
System.out.println("Multiplication="+(a*b));
else if(ch==4)
System.out.println("Division="+(a/b));
else
System.out.println("Invalid Input");
}
}