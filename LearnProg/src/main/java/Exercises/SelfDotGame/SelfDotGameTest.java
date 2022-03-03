package Exercises.SelfDotGame;

import java.util.Arrays;
import java.util.Scanner;

public class SelfDotGameTest {
    public static void main(String[] args) {

        int numOfGuesses = 0;
        int[] array;
        boolean isActive = true;


        SelfDotGame dot = new SelfDotGame();
        Scanner num = new Scanner(System.in);

        double cValue = (5 * Math.random());
        int value = (int) cValue;

        array = new int[3];
        for (int i = 0; i < array.length; i++, value++) {
            array[i] = value;

        }
        System.out.println(Arrays.toString(array));
        dot.setLoc(array);
        while (isActive == true) {
            System.out.println("Insert your number");
            String record = num.nextLine();
            String result = dot.check(record);
            numOfGuesses++;
            if (result.equals("Finished him!")) {
                isActive = false;
                System.out.println("You've needed " + numOfGuesses + " guesses");
            }

        }
    }
}
