import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        System.out.print("Enter your gender (M for male, F for female, O for older than 65): ");
        char gender = scanner.next().charAt(0);
        double taxFreeThreshold;
        if (gender == 'F' || gender == 'O') {
            taxFreeThreshold = 400000;
        } else {
            taxFreeThreshold = 350000;
        }
        double tax = 0;
        if (income > taxFreeThreshold) {
            double taxableIncome = income - taxFreeThreshold;
            if (taxableIncome <= 100000) {
                tax = taxableIncome * 0.05;
            } else if (taxableIncome <= 300000) {
                tax = 100000 * 0.05 + (taxableIncome - 100000) * 0.1;
            } else if (taxableIncome <= 600000) {
                tax = 100000 * 0.05 + 200000 * 0.1 + (taxableIncome - 300000) * 0.15;
            } else if (taxableIncome <= 1000000) {
                tax = 100000 * 0.05 + 200000 * 0.1 + 300000 * 0.15 + (taxableIncome - 600000) * 0.2;
            } else if (taxableIncome <= 1500000) {
                tax = 100000 * 0.05 + 200000 * 0.1 + 300000 * 0.15 + 400000 * 0.2 + (taxableIncome - 1000000) * 0.25;
            } else {
                tax = 100000 * 0.05 + 200000 * 0.1 + 300000 * 0.15 + 400000 * 0.2 + 500000 * 0.25 + (taxableIncome - 1500000) * 0.3;
            }
        }
        System.out.println("Your income tax is: BDT " + tax);
    }
}
