package Exercises.Misc;

public class Mix4 {

    int counter = 0;

    public static void main(String[] args) {

        int count = 0;
        int x = 0;

        Mix4[] mix4 = new Mix4[20];

        while (x <19){
            mix4[x] = new Mix4();
            mix4[x].counter = mix4[x].counter+1;
            count = count +1;
            System.out.println(count);
            count = count + mix4[x].maybeNew(x);
            x=x+1;
        }
        System.out.println(count + " " + mix4[1].counter);
    }
    public int maybeNew(int index){
        if (index < 1){
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}

