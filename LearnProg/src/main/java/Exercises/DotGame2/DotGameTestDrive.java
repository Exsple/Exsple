package Exercises.DotGame2;

import java.util.Scanner;

public class DotGameTestDrive {
    public static void main(String[] args) {
        DotGame array = new DotGame();
        Scanner meow = new Scanner(System.in);

        int[] array1 = {2, 3, 5};
        array.setRecord(array1);

        System.out.println("Insert your number: ");
        String record = meow.nextLine();


        meow.close();
        array.check(record);
    }
}
