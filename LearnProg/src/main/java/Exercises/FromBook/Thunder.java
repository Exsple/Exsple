package Exercises.FromBook;

import java.util.Scanner;

public class Thunder {
    public static void main(String[] args) {
        Scanner newNum = new Scanner(System.in);

        double dif = 0;
        double secondsOfSeeing = 0;
        int speed = 1100;

        System.out.print("Insert seconds of echo reaching: ");
        dif = newNum.nextDouble();
        //System.out.print("Insert seconds after seeing: ");
        //secondsOfSeeing = newNum.nextDouble();

        System.out.println("Distance for thunder is: " + (dif) / 2);



    }
    }

