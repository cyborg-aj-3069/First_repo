import java.util.*;
class matrixmult
{
 public static void main(String arg[]) throws Exception
{
   Scanner sc = new Scanner(System.in);
  int m1,n1,m2,n2,i,j,k;
 System.out.println("Enter The Dimensions of 1st Array");
 m1= sc.nextInt();
 n1= sc.nextInt();
 System.out.println("Enter The Dimensions of 2nd Array");
 m2=sc.nextInt();
 n2=sc.nextInt();
 if(m1!=n2)
{
  System.out.println("invalid Matrix for multiplication");
}
 else
{
 int A[][]= new int[m1][n1];
  System.out.println("Enter The elements In 1st array");
 for(i=0;i<m1;i++)
 for(j=0;j<n1;j++)
 A[i][j]= sc.nextInt();

int B[][]= new int[m2][n2];
  System.out.println("Enter The elements In 2nd array");
 for(i=0;i<m2;i++)
 for(j=0;j<n2;j++)
 B[i][j]= sc.nextInt();

int C[][]=new int[m1][n2];
for(i=0;i<m1;i++)
{
for(j=0;j<n2;j++)
{
 C[i][j]=0;
 for(k=0; k<n1; k++)
{
C[i][j]=C[i][j]+A[i][k]*B[k][j];

}

}
}

System.out.println("Resultant matrix is ");
for(i=0; i<m1;i++)
 {
for(j=0;j<n2;j++)
 {
System.out.print(C[i][j]+" ");
}
System.out.print("\n");
}

}
}
}