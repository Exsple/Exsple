package Exercises.SelfDotGame;

public class SelfDotGame {
    int[] setLoc;
    int numberOfHits;

    public void setLoc(int[] loc) {
        setLoc = loc;
    }

    public String check(String record) {
        int rec = Integer.parseInt(record);
        String result = "Fail";
        for (int cell : setLoc) {
                if (rec == cell) {
                    result = "Hit it!";
                    numberOfHits++;
                }
                if (numberOfHits == setLoc.length) {
                    result = "Finished him!";
                    System.out.println(result);
                }
            }
            System.out.println(result);
            return result;
        }
    }
