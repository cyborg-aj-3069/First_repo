import java.util.Scanner;
class Palindrome
{


public static void main(String Args[])
{
Scanner sc = new Scanner(System.in);
int temp,n,r,sum=0;
System.out.println("Enter the no. to Check: ");
n=sc.nextInt();
temp=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;

}
if (temp==sum)
System.out.println("Palindrome");
else
System.out.println("Not a Palindrome");


{
 
}
}
}