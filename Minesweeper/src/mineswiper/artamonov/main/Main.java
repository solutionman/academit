package mineswiper.artamonov.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

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

                JButton newGame = new JButton("New Game");
                c.ipady  = 0;
                c.gridx = 10;
                c.gridy = 10;
                //c.weighty = 0.3;
                c.anchor = GridBagConstraints.NORTH;
                panel.add(newGame, c);

                JButton[] buttons = new JButton[100];
                for (int i = 0; i < 100; ++i) {
                    buttons[i] = new JButton(" ");
                }

                int[] buttonsCondition = new int[100];
                for(int i = 0; i < 100; ++i){
                    buttonsCondition[i] = ThreadLocalRandom.current().nextInt(0, 2);
                    System.out.printf("Button %d = %d", i, buttonsCondition[i]);
                    System.out.println();
                }

                int k = 0;
                for (int i = 0; i < 10; ++i) {
                    for (int j = 0; j < 10; ++j) {
                        c.gridx = i;
                        c.gridy = j;
                        c.anchor = GridBagConstraints.CENTER;
                        //c.weighty = 1;
                        panel.add(buttons[k], c);
                        ++k;
                    }
                }

                for(int i = 0; i < 100; ++i) {
                    buttons[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            //JOptionPane.showMessageDialog(frame, "you press me");
                            System.out.println("button pressed");
                            //System.out.println(buttonsCondition[i]);
                        }
                    });
                }
            }
        });

    }
}

