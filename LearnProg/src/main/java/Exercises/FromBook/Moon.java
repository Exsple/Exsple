package Exercises.FromBook;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {
        Scanner weigt = new Scanner(System.in);
        double dif = 0.17;

        System.out.println("Insert your weight");
        int userWeigt = weigt.nextInt();

        System.out.println("Your weight in Moon will be " + userWeigt * dif);
    }


}
