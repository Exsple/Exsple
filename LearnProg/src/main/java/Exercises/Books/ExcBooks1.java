package Exercises.Books;

public class ExcBooks1 {
    public static void main(String[] args) {
        ExcBooks[] Books = new ExcBooks[2];

        int x = 0;

        Books[0] = new ExcBooks();
        Books[1] = new ExcBooks();

        Books[0].Name = "We";
        Books[1].Name = "Peace and War";

        Books[0].Author = "Zamyatin";
        Books[1].Author = "Tolstoy";

        for (int i = 0; i < Books.length; i++) {
            System.out.println('"' + Books[x].Name + '"' + ", " + Books[x].Author );
            x = x + 1;
        }
    }
}

