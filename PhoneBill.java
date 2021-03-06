import java.util.Scanner;
interface Bill
	{
		void billing();
		default void takeUsageMins()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the calls duration of this month made by customer");
			PhoneBill.callDuartionCurrentMonth=s.nextInt();
			System.out.println("Enter the calls duration of previous month made by customer");
			PhoneBill.callDuartionPrevMonth=s.nextInt();
		}

	}
public class PhoneBill implements Bill 
	{
		static int callDuartionCurrentMonth;
		static int callDuartionPrevMonth;
		int callRate;
		int moneyOfThisMonths;
		int moneyOfPreviousMonths;
		public PhoneBill()
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Call Rate per Min");
			callRate = s.nextInt();
		}
		public void billing()
		{
			moneyOfThisMonths = callRate * callDuartionCurrentMonth;
			moneyOfPreviousMonths = callRate * callDuartionPrevMonth;
		}
		 public static void main(String[] args)
		 {
			PhoneBill p=new PhoneBill();
			p.takeUsageMins();
			p.billing();
			System.out.println("Bill generated Of Total Current Amount made by the customer=" + p.moneyOfThisMonths);
			System.out.println("Bill generated Of Total Previous balance  made by the customer=" + p.moneyOfPreviousMonths);
		}
}
		