package Exercises.MuchSeriousDog;

public class Dog {
    double size;
    String name;

    void Bark(int numOfBarks) {
        if (size >= 30) {
            while (numOfBarks > 0) {
                System.out.println("Woaf woaf!");
                numOfBarks = numOfBarks - 1;
            }
        } else if (size >= 20) {
            while (numOfBarks > 0) {
                System.out.println("Bark bark!");
                numOfBarks--;
            }
        } else {
            while (numOfBarks > 0) {
                System.out.println("Yap yap!");
                numOfBarks--;
            }
        }
    }
}
