package Exercises.Dog;
public class Dog {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();
        dog.name = "Coolies";
        dog.bark();

        Dog[] dogge = new Dog[4];

        dogge[0] = new Dog();
        dogge[1] = new Dog();
        dogge[2] = dog;
        dogge[3] = new Dog();

        dogge[0].name = "Killer";
        dogge[1].name = "Zeus";
        dogge[3].name = "Wolfgang";

        System.out.println("Name of the last dog - " +dogge[3].name);

        int x = 0;
        while (0 < dogge.length){
            dogge[x].bark();
            x = x + 1;
        }

    }
    public void bark() {
        System.out.println(name + " said woaf-woaf!");
    }
    String name;
}
