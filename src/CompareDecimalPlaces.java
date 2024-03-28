import java.util.Scanner;
public class CompareDecimalPlaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two floating-point numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        int intNum1 = (int) (num1 * 100);
        int intNum2 = (int) (num2 * 100);
        if (intNum1 == intNum2) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }
        scanner.close();
    }
}
