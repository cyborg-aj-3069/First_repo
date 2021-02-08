import java.util.Scanner;
class arrayuser42
{
    public static void main(String args[])
    {
int a,b;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no of rows ");
       a=sc.nextInt();
      System.out.println("Enter the no.of coloumns ");
       b=sc.nextInt();
       int m[][]=new int[a][b];
       int n[][]=new int[a][b];
       int o[][]=new int[a][b];
       int p[][]=new int[a][b];
       int i,j;
for(i=0;i<a;i++)
{
   for(j=0;j<b;j++)
{
    System.out.println("Enter value of m["+i+"]["+j+"] ");
    m[i][j]=sc.nextInt();
    
}
}

for(i=0;i<a;i++)
{
  for(j=0;j<b;j++)
{
 System.out.println("Enter value of n["+i+"]["+j+"]  ");
    n[i][j]=sc.nextInt();
}
  
}

for(i=0;i<a;i++)
{
  for(j=0;j<b;j++)
{
o[i][j]=m[i][j]+n[i][j];
p[i][j]=m[i][j]-n[i][j];
}
}
 System.out.println("The sum is :");
for(i=0;i<a;i++)
{
  for(j=0;j<b;j++)
{
   
    System.out.print(" "+o[i][j]);
        
}
 System.out.println(" ");
}

 System.out.println("The subtraction is :");
for(i=0;i<a;i++)
{
  for(j=0;j<b;j++)
{
   
    System.out.print(" "+p[i][j]);
        
}
 System.out.println(" ");
}
}
}