package Exercises.PlayGuitar;

import java.util.Scanner;

public class RockStarActually {
    public static void main(String[] args) {
        ElectricGuitar guitar = new ElectricGuitar();
        Scanner thing = new Scanner(System.in);
        Scanner thing1 = new Scanner(System.in);
        Scanner thing2 = new Scanner(System.in);

        System.out.println("Is Rock Star playing guitar? ");
        boolean th = thing.nextBoolean();
        System.out.println("Which brand of guitar is? ");
        String th1 = thing1.nextLine();
        System.out.println("Number of pick-ups");
        Integer th2 = thing2.nextInt();

        guitar.setBrand(th1);
        guitar.setRockStarUsesIt(th);
        guitar.setNumOfPickUps(th2);

        guitar.playOrNotAndWhatImFuckingTired();

    }
}
