package Exercises.DotGame;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHints = 0;

    public void setLocationCells(int[] loc) {
        locationCells = loc;

    }

    public String checkYourself(String userGuess){

        int guess = Integer.parseInt(userGuess);
        String result = "Fail";

        for (int cell : locationCells){
            if (guess == cell){
                result = "Got it!";
                numOfHints++;
                continue;
            }
        }
        if (numOfHints == locationCells.length){
            result = "It's dead";
        }
        System.out.println(result);
        return result;
    }

}






