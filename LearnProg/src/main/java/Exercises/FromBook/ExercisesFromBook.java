package Exercises.FromBook;

import java.util.Scanner;

public class ExercisesFromBook {
    public static void main(String[] args) {

        double gallons, liters;
        Scanner gal = new Scanner(System.in);

        System.out.print("Insert number of gallons: ");

        gallons = gal.nextDouble();
        liters = 3.7854;

        liters = liters * gallons;
        System.out.println(gallons + " gallons will be " + liters);
    }
}
