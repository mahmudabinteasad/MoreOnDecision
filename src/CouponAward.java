import java.util.Scanner;
public class CouponAward {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the cost of your groceries: ");
        double cost = scanner.nextDouble();
        double coupon = 0;
        if (cost >= 10 && cost <= 60) {
            coupon = cost * 0.08;
        } else if (cost > 60 && cost <= 150) {
            coupon = cost * 0.1;
        } else if (cost > 150 && cost <= 210) {
            coupon = cost * 0.12;
        } else if (cost > 210) {
            coupon = cost * 0.14;
        }
        System.out.printf("You win a discount coupon of $ %.2f. (%.0f%% of your purchase)%n", coupon, (coupon / cost) * 100);
    }
}
