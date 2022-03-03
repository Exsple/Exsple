package Exercises.Hobbits;

public class Hobbit {
    public static void main(String[] args) {
        HobbitName[] hobs = new HobbitName[3];

        int z = -1;

        while (z < 2){
            z = z + 1;
            hobs[z] = new HobbitName();
            hobs[z].name = "Frodo";

            if (z == 1){
                hobs[z].name = "Bilbo";
            }
            if (z == 2){
                hobs[z].name = "Sam";
            }
            System.out.println(hobs[z].name + " is name for goodie hobbit");
        }
    }
}
