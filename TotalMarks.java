interface acad
{
int a=75,b=80,c=77;
int wA=(a+b+c)*75/300;

void cal();

}

interface Pt
{
int a=75,b=80;
int wS=(a+b)*25/200;
default void check()
{

}
void display();

}

class Total implements acad,Pt
{
int sum=0;
public void cal()
{
 sum= wA+wS;
}

public void display()
{
System.out.print("Total Percentage ="+sum);
}
}

class TotalMarks 
{
public static void main(String Args[])
{
 Total obj = new Total();
 obj.cal();
 obj.display();
}
}