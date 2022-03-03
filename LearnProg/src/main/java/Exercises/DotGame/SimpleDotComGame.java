package Exercises.DotGame;
import java.util.Scanner;

public class SimpleDotComGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        SimpleDotCom dot = new SimpleDotCom();

        int size = input.nextInt();

        int locations[] = new int[size];

        System.out.println("Insert elements: ");

        for (int i = 0; i < size; i++){
            locations[i] = input.nextInt();
        }
        input.close();

        dot.setLocationCells(locations);

        System.out.println("Enter the number of cell: ");
        String userGuess = sc.nextLine();
        sc.close();
        String result = dot.checkYourself(userGuess);

    }
}
