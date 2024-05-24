import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Employee's full name: "); //scans name
		String name = scan.nextLine();
		
		System.out.println("Enter the Employee's number: "); //scans id
		String number = scan.nextLine();
		
		System.out.println("Enter the pay rate per hour: "); //scans payrate
		double payrate = scan.nextDouble();
		
		System.out.println("Enter the regular hours worked: "); //scans hours worked
		double hours = scan.nextDouble();
		
		double gross = payrate*hours;
		double grossr = Math.round(gross*100.0)/100.0;
		System.out.println();
		System.out.println("Thank you!");
		System.out.println();
		System.out.println("Here is your paycheck!");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		
		System.out.println("Employee's name:"+"         "+name);
		System.out.println("Employee's number:"+"       "+number);
		System.out.println("Hourly rate of pay:"+"      "+payrate);
		System.out.println("Hours worked:"+"            "+hours);
		System.out.println();
		System.out.println("Total grosspay:"+"          " + "$"+grossr);
		System.out.println();
		System.out.println("Deductions");
		double deduct = 0.06*(payrate*hours);
		double deductr = Math.round(deduct*100.0)/100.0;
	
		System.out.println("Tax (6 %):"+"               "+"$"+deductr);
		System.out.println();
		System.out.println();
		double net = gross - deduct;
		double netr = Math.round(net*100.0)/100.0;
		
		System.out.println("Net pay:" + "                 " + "$"+ (netr)+ " Dollars");
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Bye!");
		
		scan.close();
	}
}