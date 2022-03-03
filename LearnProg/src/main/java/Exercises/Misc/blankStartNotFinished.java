package Exercises.Misc;

import javax.swing.*;

public class blankStartNotFinished {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NotFinished();
            }
        });
    }
}