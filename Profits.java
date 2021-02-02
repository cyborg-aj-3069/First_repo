interface Branch1
{
int pro1=100000;
int lo1= 10000;
Fprofit1= pro1-lo1;
void cal();

}

interface Branch2
{
int pro2=500000;
int lo2= 250000;
Fprofit2= pro2-lo2;



}

interface Branch3
{
int pro3=600000;
int lo3= 30000;
Fprofit3= pro3-lo3;

void display();

}


class Profits implements Branch1,Branch2,Branch3
{
public void cal()
{

System.out.println("The profits And Loss of  Branches Are");

if( pro1 < 25000)
{
System.out.println( "Branch1 should Work Hard");
}
if( pro1 >25000)
{
System.out.println("Branch1 is Doing well");

}
if(lo1 > 10000)
{
System.out.println("Branch1 should Work Hard");

}
if( lo1 < 10000)
{
System.out.println("Branch1 is Doing well");

if( pro2 < 25000)
{
System.out.println( "Branch2 should Work Hard");
}
if( pro2 >25000)
{
System.out.println("Branch2 is Doing well");

}
if(lo2 > 10000)
{
System.out.println("Branch2 should Work Hard");

}
if( lo2 < 10000)
{
System.out.println("Branch2 is Doing well");


if( pro3 < 25000)
{
System.out.println("Branch3 should Work Hard");
}
if( pro3 >25000)
{
System.out.println("Branch3 is Doing well");

}
if(lo3 > 10000)
{
System.out.println("Branch3 should Work Hard");

}
if( lo3 < 10000)
{
System.out.println( "Branch3 is Doing well");


}
}

public void display()
{
totalpro = pro1 + pro2 + pro3 + pro4;
totallo = lo1 + lo2 + lo3 + lo4;

totalProfit=Fprofit1 + Fprofit2 + Fprofit3;


System.out.println("The total Profit Of The Company =" +totalpro);
System.out.println("The total Losses Of The Company =" +totallo);
System.out.println("Branch1  Branch2  Branch3   Total");
System.out.println(Fprofit1 + "\t" + Fprofit2 + "\t" + Fprofit3 + "\t"  + totalProfit);

	

}
}
class Myprofits 
{
public static void main(String Args[])
{
 Profits obj = new Profits();
 obj.cal();
 obj.display();
}
}


