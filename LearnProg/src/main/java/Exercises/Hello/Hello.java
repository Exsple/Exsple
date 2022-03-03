package Exercises.Hello;

import java.util.Scanner;

public class Hello {

    String name;
    Scanner name1 = new Scanner(System.in);
    boolean bol = true;

    public void helloByName(){
     while (bol){
         System.out.println("Insert your name: ");
         String name2 = name1.nextLine();
         System.out.println("Hello, " + name2 + "," + " my dear friend!");
         bol = false;
     }
    }
}
