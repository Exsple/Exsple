package Exercises.MuchSeriousDog;

public class DogBarking {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.size = (Math.random() * 30);
        Dog d2 = new Dog();
        d2.size = (Math.random() * 30);
        Dog d3 = new Dog();
        d1.size = (Math.random() * 30);

        d1.Bark(3);
        d2.Bark(1);
        d3.Bark(1);
    }
}
