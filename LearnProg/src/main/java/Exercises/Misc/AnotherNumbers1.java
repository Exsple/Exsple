package Exercises.Misc;

import java.util.Scanner;

public class AnotherNumbers1 {
    public static void main(String[] args) {

        Scanner chip = new Scanner(System.in);
        Scanner chip1 = new Scanner(System.in);
        int num = 0;
        int x = 0;
        int sum = 0;

        System.out.println("Insert quantity");
        int n = chip1.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Insert your number: ");
            num = chip.nextInt();
            sum = x + num;
            x = sum;
        }System.out.println("Sum is: " + x);
    }
}
