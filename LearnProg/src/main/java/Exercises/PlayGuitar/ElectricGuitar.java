package Exercises.PlayGuitar;

public class ElectricGuitar {

    static String brand;
    private int numOfPickUps;
    private boolean rockStarUsesIt;

    String getBrand() {
        return brand;
    }

    void setBrand(String aBrand) {
        brand = aBrand;
    }

    int getNumOfPickUps() {
        return numOfPickUps;
    }

    void setNumOfPickUps(int num) {
        numOfPickUps = num;
    }

    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }

    void playOrNotAndWhatImFuckingTired() {
        if (rockStarUsesIt) {
            System.out.println("Rock Star played guitar " + brand + " " + numOfPickUps + " times");
        }
        else{
            System.out.println("");
        }
    }
}
