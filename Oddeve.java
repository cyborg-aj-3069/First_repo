import java.util.*;
class Oddeve
{
 public static void main(String Args[])
{
 System.out.println("Enter The number To check:");
 Scanner sc= new Scanner(System.in);
 int a=sc.nextInt();
  if(a%2==0)
{
  System.out.println("The Number "+a+" is an even number");
 }
  else
 {
  System.out.println("The Number "+a+" is an odd number");
}
}


}