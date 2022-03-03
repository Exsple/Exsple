package Exercises.Misc;

public class PhrasesGenerator {
    public static void main(String[] args){
    String[] wordListOne = {"cool", "smart", "3000-ultra", "good-like", "mega", "ultra", "super" };
    String[] wordListTwo = {"hard", "firmed", "common","standard", "furious"};
    String[] wordListThree = {"talant", "portal", "TV", "process", "structure", "gadget"};
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;
    int rand1 = (int)(Math.random()*oneLength);
    int rand2 = (int)(Math.random()*twoLength);
    int rand3 = (int)(Math.random()*threeLength);
        //System.out.println(rand1);
    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("All that you need is " + phrase);
        //int x = (int) 24.6;
        //System.out.println(x);
    }
}


