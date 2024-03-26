import java.util.Scanner;

public class getLetterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numeric grade between 0 and 4: ");
        double numericGrade = scanner.nextDouble();

        String letterGrade;

        if (numericGrade >= 4.0) {
            letterGrade = "A";
        } else if (numericGrade >= 3.7) {
            letterGrade = "A-";
        } else if (numericGrade >= 3.3) {
            letterGrade = "B+";
        } else if (numericGrade >= 3.0) {
            letterGrade = "B";
        } else if (numericGrade >= 2.7) {
            letterGrade = "B-";
        } else if (numericGrade >= 2.3) {
            letterGrade = "C+";
        } else if (numericGrade >= 2.0) {
            letterGrade = "C";
        } else if (numericGrade >= 1.7) {
            letterGrade = "C-";
        } else if (numericGrade >= 1.3) {
            letterGrade = "D+";
        } else if (numericGrade >= 1.0) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        System.out.println("The closest letter grade is: " + letterGrade);
    }
}
