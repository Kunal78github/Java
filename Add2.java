import java.util.*;
class Add2
{
public static void main(String[]args)
{
int i,n,add=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter number of n");
n = sc.nextInt();
i=1;
while(i<=n)
{
add=add+i;
i=i+1;
}
System.out.println("Addition of first N natural Numbers are="+add);
}
}