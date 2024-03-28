import java.util.Scanner;
public class MonthDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int monthNumber = scanner.nextInt();
        int length;
        boolean isThirtyDays = monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11;
        boolean isFebruary = monthNumber == 2;
        if (isThirtyDays) {
            length = 30;
        } else if (isFebruary) {
            length = 28;
        } else{
            length = 31;
        }
        System.out.println(length + " days");
    }
}