package Exercises.Tasks;

import java.util.*;


public class Sorting {
        int num = 0;
        int anotherNum;
        int counter2 = 0;
        Scanner insertNum = new Scanner(System.in);
        Scanner insertAnotherNum = new Scanner(System.in);
        int differentDigitsCount = 0;

        public void setInsertNum(){
        //quantity
        System.out.println("Insert quantity");
        num = insertNum.nextInt();
        ArrayList array = new ArrayList();


        //fill array
        for (int i = 0; i < num; i++) {
            System.out.println("Insert number");
            anotherNum = insertAnotherNum.nextInt();
            array.add(anotherNum);
        }

        //max and min length
        var max = Collections.max(array).toString();
        var min = Collections.min(array).toString();

        int maxLength = max.length();
        int minLength = min.length();

        System.out.println("The max number is: " + max + " and its length is " + maxLength);
        System.out.println("The min number is: " + min + " and its length is " + minLength);

        //length and sorting
        int arraySize = array.size();
        String arrayString = array.toString();
        int lengthOfArray = arrayString.length();
        int avgArray = lengthOfArray / arraySize;

        Collections.sort(array);
        System.out.println("Increasing order: ");
        for (var counter : array) {
            System.out.println(counter + "'s" + " length is " + counter.toString().length() + " ");
        }

        Collections.sort(array, Collections.reverseOrder());
        System.out.println("Decreasing order: ");
        for (var counter1 : array) {
            System.out.println(counter1 + "'s" + " length is " + counter1.toString().length() + " ");
        }

        for (var counter : array) {
            //System.out.println(counterLength);
            if (counter.toString().length() <= avgArray) {
                System.out.println("Number that length less than avg is " + counter + " and its length is " + counter.toString().length());
            }
        }
        for (var counter : array) {
            if (counter.toString().length() >= avgArray) {
                System.out.println("Number that length more than avg is " + counter + " and its length is " + counter.toString().length());
            }
        }
    }
}



