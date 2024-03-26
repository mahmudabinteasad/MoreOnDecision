import java.util.Scanner;
public class getNumericGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String letterGrade = scanner.nextLine().toUpperCase();
        char grade = letterGrade.charAt(0);
        double numericGrade;
        switch (grade) {
            case 'A':
                numericGrade = 4.0;
                break;
            case 'B':
                numericGrade = 3.0;
                break;
            case 'C':
                numericGrade = 2.0;
                break;
            case 'D':
                numericGrade = 1.0;
                break;
            case 'F':
                numericGrade = 0.0;
                break;
            default:
                System.out.println("Invalid grade entered.");
                return;
        }

        if (letterGrade.length() > 1) {
            char modifier = letterGrade.charAt(1);
            if (modifier == '+') {
                 if (grade == 'A') {
                    numericGrade = 4.0;
                } else {
                    numericGrade += 0.3;
                }
            }
            else if (modifier == '-') {
                if (grade != 'F') {
                    numericGrade -= 0.3;
                } else {
                    System.out.println("F grades cannot have a modifier.");
                    return;
                }
            } else {
                System.out.println("Invalid modifier entered.");
                return;
            }
        }
        System.out.println("The numeric value is " + numericGrade + ".");
    }
}