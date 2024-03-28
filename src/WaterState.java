import java.util.Scanner;
public class WaterState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter 'C' for Celsius or 'F' for Fahrenheit: ");
        char scale = scanner.next().charAt(0);
        double celsiusTemperature;
        if (scale == 'C' || scale == 'c') {
            celsiusTemperature = temperature;
        } else if (scale == 'F' || scale == 'f') {
            celsiusTemperature = (temperature - 32) * 5 / 9;
        } else {
            System.out.println("Invalid input for temperature scale. Please enter 'C' or 'F'.");
            return;
        }
        if (celsiusTemperature >= 100) {
            System.out.println("At sea level, water is gaseous at " + temperature + " degrees " + scale);
        } else if (celsiusTemperature <= 0) {
            System.out.println("At sea level, water is solid at " + temperature + " degrees " + scale);
        } else {
            System.out.println("At sea level, water is liquid at " + temperature + " degrees " + scale);
        }
    }
}