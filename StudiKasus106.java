import java.util.Scanner;

public class StudiKasus106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pricePerCup = 18000;
        int totalCup, moneyPaid;
        int totalPrice, discount, totalPayment;
        int change, shortage;

        System.out.print("Enter the number of cups: ");
        totalCup = sc.nextInt();
        System.out.print("Enter money paid: ");
        moneyPaid = sc.nextInt();

        totalPrice = totalCup * pricePerCup;
        discount = 0;

        if (totalPrice >= 100000) {
            discount = totalPrice * 10 / 100;
        }

        totalPayment = totalPrice - discount;

        System.out.println("Total price         : Rp " + totalPrice);
        System.out.println("Discount            : Rp " + discount);
        System.out.println("Total payment       : Rp " + totalPayment);

        if (moneyPaid >= totalPayment) {
            change = moneyPaid - totalPayment;
            System.out.println("Change              : Rp " + change);
        } else {
            shortage = totalPayment - moneyPaid;
            System.out.println("Money is not enough, shortage Rp " + shortage);
        }
    }
}