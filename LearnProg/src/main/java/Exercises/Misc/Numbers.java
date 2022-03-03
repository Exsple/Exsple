package Exercises.Misc;

import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {

        int arrayOfNumbers[] = new int[12];

        for(int i = 0; i < arrayOfNumbers.length; i++){
            arrayOfNumbers[i] = (int) Math.round(Math.random() * 12);
        }
        System.out.println(Arrays.toString(arrayOfNumbers));
    }
}
