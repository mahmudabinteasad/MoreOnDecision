import java.util.Scanner;
public class CompassDirection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle (in degrees): ");
        int angle = scanner.nextInt();
        String[] directions = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
        int index = (int) Math.round(angle / 45.0) % 8;
        if (index < 0) {
            index += 8;
        }
        String direction = directions[index];
        System.out.println("The nearest compass direction is: " + direction);
        scanner.close();
    }
}
