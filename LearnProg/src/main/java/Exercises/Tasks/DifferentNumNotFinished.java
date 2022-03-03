package Exercises.Tasks;

import java.util.*;

public class DifferentNumNotFinished {



    int differentDigitsCount = 0;
    Scanner scanner = new Scanner(System.in);
    Scanner scr = new Scanner(System.in);
    Sorting stat = new Sorting();
    int n;
    int array[] = new int[n];
    int num = 0;

    public void difNums() {
        System.out.println("Insert quantity");
        var n = scr.nextInt();
        System.out.println(n);
        for(int i = 0; i < n; i++){
            System.out.println("Insert numbers");
            num = scanner.nextInt();
            array[i] = num;
            while (array[i] != 0) {
                array[(int) (array[i] % 10)]++;
                array[i] /= 10;
                i++;
            }
            for (int i1 = 0; i1 < n; i1++) {
                if (array[i1] > 0) differentDigitsCount++;
            }
        }
        System.out.println(differentDigitsCount);
    }
}
