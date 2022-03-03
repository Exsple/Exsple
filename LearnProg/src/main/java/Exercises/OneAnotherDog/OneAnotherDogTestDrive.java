package Exercises.OneAnotherDog;

public class OneAnotherDogTestDrive {
    public static void main(String[] args) {

        OneAnotherDog d1 = new OneAnotherDog();
        OneAnotherDog d2 = new OneAnotherDog();

        d1.setSize(10);
        d2.setSize(90);

        System.out.println("First dog weight " + d1.getSize());
        System.out.println("Second dog weight " + d2.getSize());

        d1.bark();
        d2.bark();

    }
}
