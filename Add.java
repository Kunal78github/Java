import java.io.*;
class Add
{
public static void main(String []args) throws IOException
{
int a,b,sum;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the First Number");
a = Integer.parseInt(br.readLine());
System.out.println("Enter the Second Number");
b = Integer.parseInt(br.readLine());
sum = a+b;
System.out.println("The Addition of the numbers = " + sum);
}
}
