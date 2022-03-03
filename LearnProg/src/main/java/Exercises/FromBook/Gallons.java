package Exercises.FromBook;

public class Gallons {
    public static void main(String[] args) {

        double meters;
        double inches;
        int counter = 0;

        for (meters = 1; meters <= 100; meters++){
            inches = meters * 39.37;
            System.out.println(meters + " meters equal " + inches + " inches" );
            counter++;
            if (counter == 12 || counter == 24 || counter == 36 || counter == 48 || counter == 60|| counter == 72 || counter == 84 || counter == 96 || counter == 108       ){
                System.out.println();
            }
        }

    }
}
