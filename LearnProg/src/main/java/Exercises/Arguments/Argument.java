package Exercises.Arguments;

import java.util.Scanner;

public class Argument {
    public static void main(String[] args) {

        Scanner shtuka = new Scanner(System.in);
        String item = shtuka.nextLine();
        String reverseStr = new StringBuilder(item).reverse().toString();
        System.out.println(reverseStr);
    }
}

