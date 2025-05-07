package Question;

import java.util.Scanner;

public class CodingQue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean member = sc.nextBoolean();
        double amount = sc.nextDouble();
        double discount;

        if (!member) {
            discount = amount * 0.5;
        } else if (amount < 5000) {
            discount = amount * 0.1;
        } else {
            discount = amount * 0.05;
        }

        System.out.println("Discount: " + discount);
        sc.close();
    }
}
