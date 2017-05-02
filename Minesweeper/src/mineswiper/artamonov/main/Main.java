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

                try {
                    Icon blowed = new ImageIcon("blowed.jpg");
                    Icon bomb = new ImageIcon("bomb.jpg");

                for(int i = 0; i < 100; ++i) {
                    final Integer j = i;
                    buttons[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            //JOptionPane.showMessageDialog(frame, "you press me");
                            //Integer j = i;
                            System.out.printf("button %d pressed, condition: ", j);
                            System.out.println(buttonsCondition[j]);
                            //++j;
                            if(buttonsCondition[j] == 1){
                                for(int i = 0; i < 100; ++i){
                                    buttons[i].setEnabled(false);
                                }
                                buttons[j].setIcon(blowed);
                                JOptionPane.showMessageDialog(frame, "Game Over");

                            } else {
                                buttons[j].setEnabled(false);
                            }
                        }
                    });
                }

                } catch(Exception e){
                    System.out.println("No image");
                }

                JButton newGame = new JButton("New Game");
                c.ipady  = 0;
                c.gridx = 10;
                c.gridy = 10;
                //c.weighty = 0.3;
                c.anchor = GridBagConstraints.NORTH;
                panel.add(newGame, c);

                newGame.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        for(int i = 0; i < 100 ; ++i){
                            buttons[i].setEnabled(true);
                        }
                        for(int i = 0; i < 100; ++i){
                            buttonsCondition[i] = ThreadLocalRandom.current().nextInt(0, 2);
                            System.out.printf("Button %d = %d", i, buttonsCondition[i]);
                            System.out.println();
                        }
                    }
                });
            }
        });

    }
}

