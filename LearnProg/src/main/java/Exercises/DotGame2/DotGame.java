package Exercises.DotGame2;

public class DotGame {
    int[] array;



    public void setRecord(int[] record1){
        array = record1;
    }

    public String check (String userGuess){
        int guess = Integer.parseInt(userGuess);
        String result = "Fail";
        for (int cell : array){
            if (guess == cell){
                result = "Got it!";
                break;
            }
        }
        System.out.println(result);
        return result;
    }
}
