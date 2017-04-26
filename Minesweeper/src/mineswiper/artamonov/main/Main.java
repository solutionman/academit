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
                    buttons[i] = new JButton(String.valueOf(i));
                    //c.gridy = i;
                    //c.gridy = i;
                    //panel.add(buttons[i], c);
                }

                int k = 0;
                for (int i = 0; i < 3; ++i) {
                    for (int j = 0; j < 2; ++i) {
                        c.gridx = i;
                        c.gridy = j;
                        panel.add(buttons[k]);
                        ++k;
                    }
                }

                Button testButton = new Button("testButton", 3, 4);
                Button testButton2 = new Button("testButton2", 3, 5);

                /*
                JButton button1 = new JButton("1");
                c.gridx = 0;
                c.gridy = 0;
                panel.add(button1, c);

                JButton button2 = new JButton("2");
                c.gridx = 1;
                c.gridy = 0;
                panel.add(button2, c);

                JButton button3 = new JButton("3");
                c.gridx = 2;
                c.gridy = 0;
                panel.add(button3, c);

                JButton button4 = new JButton("4");
                c.gridx = 3;
                c.gridy = 0;
                panel.add(button4, c);

                JButton button5 = new JButton("5");
                c.gridx = 4;
                c.gridy = 0;
                panel.add(button5, c);

                JButton button6 = new JButton("6");
                c.gridx = 0;
                c.gridy = 1;
                panel.add(button6, c);

                JButton button7 = new JButton("7");
                c.gridx = 0;
                c.gridy = 2;
                panel.add(button7, c);
                */
            }
        });

    }
}

