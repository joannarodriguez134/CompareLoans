/**
Name: Joanna Rodriguez
Course: CIS 144
Purpose: Chapter 5 - Programming Exercise 5.21
*/
import java.util.Scanner; 
public class CompareLoans{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter Loan Amount: ");
	    double loanAmount = input.nextDouble();
	    
	    System.out.print("Enter Number of years: ");
	    int numberOfYears = input.nextInt();
	    
	    System.out.println("Interest Rate       Monthly Payment         Total Payment");
	    
	    for (double intRate = 5.0; intRate <= 8; intRate+= 0.125) {
	        System.out.printf("%-5.3f", intRate); // intRate is the annual interest rate aka 12 months
	        System.out.print("%                    ");
	        
	        double monthlyInterestRate = intRate / 1200; // extra zeroes because of percent mode
	        double monthlyPayment = loanAmount * monthlyInterestRate / 
	        (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
	        double totalPayment = monthlyPayment * numberOfYears * 12;
	        System.out.printf("%-20.2f", monthlyPayment);
	        
	        System.out.printf("%-10.2f\n", totalPayment);
	    }
		
	}
}
