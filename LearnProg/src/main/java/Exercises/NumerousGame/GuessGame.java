package Exercises.NumerousGame;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm guessing the number from 0 to 9");

        while (true) {
            System.out.println("Number that you have to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("First player guesses that it is " + guessp1);
            guessp2 = p2.number;
            System.out.println("Second player guesses that it is " + guessp2);
            guessp3 = p3.number;
            System.out.println("Third player guesses that it is " + guessp3);

            if (guessp1 == targetNumber) {
                p1IsRight = true;
            }
            if (guessp2 == targetNumber) {
                p2IsRight = true;
            }
            if (guessp3 == targetNumber) {
                p3IsRight = true;
            }
            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("We have the winner!");
                System.out.println("Did the first player guess? " + p1IsRight);
                System.out.println("Did the second player guess? " + p2IsRight);
                System.out.println("Did the third player guess? " + p3IsRight);
                System.out.println("End of the game");
                break;
            } else {
                System.out.println("Nobody guess the number. What a shame. We will try again until you win");
            }
        }

    }

}
