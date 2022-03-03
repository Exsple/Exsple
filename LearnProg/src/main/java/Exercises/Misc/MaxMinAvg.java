package Exercises.Misc;

import java.util.Arrays;

public class MaxMinAvg {
    public static void main(String[] args) {
        int n = 100;
        double[] massive = new double[n];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (Math.random() * (10 - 1) + 1);
        }
        System.out.println(Arrays.toString(massive));

        double max = massive[0];
        double min = massive[0];
        double avg = 0;

        //System.out.println(max);

        for (int i = 0; i < massive.length; i++) {
            if (max < massive[i]) {
                //System.out.println(max);
                max = massive[i];

            }
            if (min > massive[i]) {
                min = massive[i];
                avg += massive[i] / massive.length;
                System.out.println("Массив " + massive[i]);
                System.out.println("Среднее " + avg);
            }
        }
        System.out.println("max= " + max);
        System.out.println("min= " + min);
        System.out.println("avg= " + avg);
    }

}
