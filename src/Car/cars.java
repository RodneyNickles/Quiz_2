package Car;

import java.util.Scanner;
import java.text.NumberFormat;

public class cars {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		NumberFormat nf = NumberFormat.getInstance();

		System.out.println("Enter total cost of the car :");
		double carCost = sc.nextDouble();

		System.out.println("Enter how much the down payment was :");
		double downPayment = sc.nextDouble();

		System.out.println("Enter the length of the loan in months :");
		double loanMonths = sc.nextInt();

		System.out.println("Enter the interest rate of the loan :");
		double interest = sc.nextInt();

		nf.setMaximumFractionDigits(2);

		double monthlyPayment = (carCost - downPayment) / (((Math.pow((((interest / 100) / 12) + 1), loanMonths)) - 1)
				/ ((Math.pow((((interest / 100) / 12) + 1), loanMonths)) * ((interest / 100) / 12)));
		double totalInterest = (monthlyPayment * loanMonths) - carCost;

		System.out.println("Your monthly car payment is : $" + nf.format((monthlyPayment)));
		System.out.println("Your total interest paid will be : $" + nf.format((totalInterest)));

		sc.close();
	}

}

/* I attempted to get the Junit testing to work several times, however I could not remember how to properly apply it. I attempted to
 * search up online, however nothing seemed to help. Also, as far as making methods and attributes, I was running into more troubles 
 * than it seemed worth. I know the code above isn't the prettiest but it gets the job done!
 */
