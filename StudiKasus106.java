import java.util.Scanner;

public class StudiKasus106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pricePerCup = 18000;
        int totalCup, moneyPaid;
        int totalPrice, discount, totalPayment;
        int change, shortage;

        System.out.print("Masukkan jumlah cup : ");
        totalCup = sc.nextInt();
        System.out.print("Masukkan uang bayar : ");
        moneyPaid = sc.nextInt();

        totalPrice = totalCup * pricePerCup;
        discount = 0;

        if (totalPrice >= 100000) {
            discount = totalPrice * 10 / 100;
        }

        totalPayment = totalPrice - discount;

        System.out.println("Total harga         : Rp " + totalPrice);
        System.out.println("Diskon              : Rp " + discount);
        System.out.println("Total bayar         : Rp " + totalPayment);

        if (moneyPaid >= totalPayment) {
            change = moneyPaid - totalPayment;
            System.out.println("Kembalian           : Rp " + change);
        } else {
            shortage = totalPayment - moneyPaid;
            System.out.println("Uang tidak cukup, kurang Rp " + shortage);
        }
    }
}