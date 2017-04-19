package mineswiper.artamonov.main;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Mineswiper");
                frame.setSize(500, 600);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);

                JPanel top = new JPanel();
                frame.add(top, BorderLayout.CENTER );

                JPanel field = new JPanel();
                frame.add(field, BorderLayout.CENTER);

                JButton newGame = new JButton("New Game");
                top.add(newGame);

                JButton button = new JButton("Click me");
                field.add(button);

            }
        });

    }
}

