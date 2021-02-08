import java.util.Scanner;

class ArrayTest
{
public static void main(String arg[])
{

Scanner sc=new Scanner(System.in);
int a[]=new int[4];
int i;

for(i=0;i<4;i++)
{
System.out.println("Enter the numbers:");
a[i]=sc.nextInt();
}

for(i=0;i<4;i++)
{
System.out.print (" "+a[i]);
}
}
}

