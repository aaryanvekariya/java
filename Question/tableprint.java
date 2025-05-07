package Question;

import java.util.Scanner;

public class tableprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Table of " + num + ":");

        for (int j = 1; j <= 10; j++) {
            System.out.println(num + " * " + j + " = " + (num * j));
        }

        sc.close();
    }
}