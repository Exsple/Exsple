package Exercises.Tasks;

import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        int array = 0;

        System.out.println("Insert numbers for the matrix: ");
        var insertNum = a.nextInt();
        var insertNum1 = b.nextInt();
        System.out.println("Insert number for the matrix's cells: ");
        var insertNum2 = c.nextInt();
        int size = insertNum2;


        int matrix[][] = new int[insertNum][insertNum1];
        ArrayList matrixButArray = new ArrayList();

        for (int i = 0; i < insertNum1; i++) {
            for (int t = 0; t < insertNum; t++) {
                double number = Math.random() * insertNum2;
                int num = (int) number;
                matrix[t][i] = (num);
                System.out.print(matrix[t][i] + " ");
                //System.out.print("Array is: ");
                //System.out.println(array);
            }
            System.out.println();
        }
        System.out.print("Array is: ");
        for (int i = 0; i < insertNum1; i++) {
            for (int t = 0; t < insertNum; t++) {
                matrixButArray.add(matrix[t][i]);
                System.out.print(matrix[t][i]+ " ");
            }
        }
        System.out.println();
        System.out.print("Sorted: ");
        Collections.sort(matrixButArray);
        for (var counter : matrixButArray.toArray()){
            System.out.print(counter );
        }
        System.out.println();
        System.out.print("Sorted: ");
        Collections.sort(matrixButArray, Collections.reverseOrder());
        for (var counter : matrixButArray.toArray()){
            System.out.print(counter );
        }

    }
}
