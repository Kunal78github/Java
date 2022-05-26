//caluculator using Switch
import java.util.*;
class Calculator1
{
public static void main(String[]args)
{
int a,b,ch;
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number");
a = sc.nextInt();
System.out.println("Enter Second Number");
b = sc.nextInt();
System.out.println("Enter Your Choice \n1)Addition \n2)Subtraction \n3)Multiplication \n4)Division");
ch = sc.nextInt();
switch(ch)
{
	case 1:
		System.out.println("Addition = " +(a+b));
		break;
	case 2:
		System.out.println("Subtraction = "+(a-b));
		break;
	case 3:
		System.out.println("Multiplication = "+(a*b));
		break;
	case 4:
		System.out.println("Division = " +(a/b));
		break;
	default:
		System.out.println("Invalid Input");
		break;
}
}
}
