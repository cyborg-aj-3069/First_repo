import java.util.*;
class Binarysearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m[]=new int[10];
        int i,k=0,p=0,ns,lb=0,ub=9;
        for(i=0;i<10;i++)
        {
            m[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        ns=sc.nextInt();
        while(lb<=ub)
        {
            p=(lb+ub)/2;
            if(m[p]<ns)
            lb=p+1;
            if(m[p]>ns)
            ub=p-1;
            if(m[p]==ns)
            {
                break;
            }
                }
                
                System.out.println("The search is successful and the number is present at "+(i-1));
               
            }
            }