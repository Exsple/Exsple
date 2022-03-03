package Exercises.Misc;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int userNum;
        boolean intNum = true;

        while (intNum) {
            System.out.println("Insert number of month: ");
            userNum = num.nextInt();

            if (userNum == 0 | userNum > 12) {
                System.out.println("Print another number!");
            }
            if (userNum > 0 & userNum <= 12) {
                switch (userNum) {
                    case 1:
                        System.out.println("January");
                        intNum = false;
                        break;
                    case 2:
                        System.out.println("February");
                        intNum = false;
                        break;
                    case 3:
                        System.out.println("March");
                        intNum = false;
                        break;
                    case 4:
                        System.out.println("April");
                        intNum = false;
                        break;
                    case 5:
                        System.out.println("May");
                        intNum = false;
                        break;
                    case 6:
                        System.out.println("June");
                        intNum = false;
                        break;
                    case 7:
                        System.out.println("Julie");
                        intNum = false;
                        break;
                    case 8:
                        System.out.println("August");
                        intNum = false;
                        break;
                    case 9:
                        System.out.println("September");
                        intNum = false;
                        break;
                    case 10:
                        System.out.println("October");
                        intNum = false;
                        break;
                    case 11:
                        System.out.println("November");
                        intNum = false;
                        break;
                    case 12:
                        System.out.println("December");
                        intNum = false;
                        break;
                }
            }

        }
    }
}