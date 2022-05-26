import java.util.*;
class Rectangle
{
public static void main(String[]args)
{
float length,breadth,area,perimeter;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Length of Rectangle");
length = sc.nextFloat();
System.out.println("Enter the Breadth of Rectangle");
breadth = sc.nextFloat();
area = length*breadth;
perimeter = 2*(length+breadth);
System.out.println("The Area of Rectangle is : " +area);
System.out.println("The Perimeter of Rectangle is : " +perimeter);
}
}