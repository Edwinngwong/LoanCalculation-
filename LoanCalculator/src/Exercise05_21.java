import java.util.*;

public class Exercise05_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();


        // Display table header
        System.out.printf("%-15s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        // Display table with interest rates
        for (double i = 5.0; i <= 8; i += 0.125) {
            System.out.printf("%-15.3f", i);
            double monthlyInterestRate = i / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            System.out.printf("%-20.2f", monthlyPayment);
            System.out.printf("%-20.2f\n",(monthlyPayment * 12) * numberOfYears);
        }
    }
}

