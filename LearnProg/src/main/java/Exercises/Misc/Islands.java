package Exercises.Misc;

public class Islands {
    public static void main(String[] args) {

        int y = 0;
        int ref;
        int [] index = new int[4];
        String [] island = new String[4];
        ref = index[y];

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        island[0] = "Bermuds";
        island[1] = "Fiji";
        island[2] = "Azorian Islands";
        island[3] = "Kosumel";

        while (y< 4){
            System.out.println("Islands are: ");
            System.out.println(island[ref]);
            y = y + 1;

        }
    }
}
