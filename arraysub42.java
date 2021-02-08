import java.util.Scanner;
class arraysub42
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int m[][]=new int[4][2];
       int n[][]=new int[4][2];
       int o[][]=new int[4][2];
       int p[][]=new int[4][2];
       int i,j;
for(i=0;i<4;i++)
{
   for(j=0;j<2;j++)
{
    System.out.println("Enter the no. in array 1 ");
    m[i][j]=sc.nextInt();
    
}
}

for(i=0;i<4;i++)
{
  for(j=0;j<2;j++)
{
 System.out.println("Enter the no. in array 2 ");
    n[i][j]=sc.nextInt();
}
  
}

for(i=0;i<4;i++)
{
  for(j=0;j<2;j++)
{
o[i][j]=m[i][j]+n[i][j];
p[i][j]=m[i][j]-n[i][j];
}
}
 System.out.println("The sum is :");
for(i=0;i<4;i++)
{
  for(j=0;j<2;j++)
{
   
    System.out.print(" "+o[i][j]);
        
}
 System.out.println(" ");
}

 System.out.println("The subtraction is :");
for(i=0;i<4;i++)
{
  for(j=0;j<2;j++)
{
   
    System.out.print(" "+p[i][j]);
        
}
 System.out.println(" ");
}
}
}