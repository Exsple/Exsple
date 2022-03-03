package Exercises.PlaySong;

public class Play {
    public static void main(String[] args) {

        Song t2 = new Song();
        Song s2 = new Song();

        t2.title = "My Way";
        t2.artist = "Frank Sinatra";

        s2.title = "You make me sick";
        s2.artist = "Of mice & men";

        s2.play();

    }
}

