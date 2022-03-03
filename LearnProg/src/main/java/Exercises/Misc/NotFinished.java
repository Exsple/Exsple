package Exercises.Misc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotFinished {
    private JTextField a;
    private JTextField b;

    public NotFinished() {
        a = new JTextField(30);
        b = new JTextField(30);
        JButton button = new JButton("Count!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String s = a.getText();
                a.setText(b.getText());
                b.setText(s);
            }
        });

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(a);
        panel.add(b);
        panel.add(button);

        JFrame frame = new JFrame("Count this bitches up");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}

