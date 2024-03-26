import java.util.Scanner;
public class FindLargest {
    public static void main(String[] args) {
        System.out.print("Please enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        if(num1 > num2 && num1 > num3){
            System.out.println("The largest number is:" + num1);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("The largest number is:" + num2);
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println("The largest number is:" + num3);
        }
    }
}
