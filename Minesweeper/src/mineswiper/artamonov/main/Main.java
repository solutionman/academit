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

                JPanel panel = new JPanel(new GridBagLayout());
                frame.getContentPane().add(panel);
                GridBagConstraints c = new GridBagConstraints();

                JButton[] buttons = new JButton[100];
                for (int i = 0; i < 100; ++i) {
                    buttons[i] = new JButton(" ");
                }

                int k = 0;
                for (int i = 0; i < 10; ++i) {
                    for (int j = 0; j < 10; ++j) {
                        c.gridx = i;
                        c.gridy = j;
                        panel.add(buttons[k], c);
                        ++k;
                    }
                }

            }
        });

    }
}

