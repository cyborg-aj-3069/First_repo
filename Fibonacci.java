import java.util.Scanner;
class Fibonacci
{
public static void main(String Args[])
{
int a=0,b=1,c,d,i;
Scanner sc = new Scanner(System.in);
d=sc.nextInt();

System.out.print(a+" "+b);
for(i=0;i<d;i++)
{
c=a+b;
System.out.print(" "+c);
a=b;
b=c;
}

}

}