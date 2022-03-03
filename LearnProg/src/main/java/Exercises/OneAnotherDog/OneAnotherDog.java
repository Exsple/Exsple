package Exercises.OneAnotherDog;

public class OneAnotherDog {

    private int size;

    public int getSize(){
        return size;
    }
    public void setSize(int s){
        size = s;
    }
    void bark(){
        if (size > 60){
            System.out.println("Woaf woaf!");
        }
        else if (size > 15){
            System.out.println("Bark bark!");
        }
        else{
            System.out.println("Yap yap!");
        }
    }
}
