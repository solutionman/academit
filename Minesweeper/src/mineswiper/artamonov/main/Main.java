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
                frame.setSize(800, 500);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);

                JPanel panel = new JPanel(new GridBagLayout());
                frame.getContentPane().add(panel);
                GridBagConstraints c = new GridBagConstraints();


                try {
                    Icon blowed = new ImageIcon("blowed.jpg");
                    Icon bomb = new ImageIcon("bomb.jpg");
                    Icon empty = new ImageIcon("empty.jpg");
                    Icon one = new ImageIcon("one.jpg");
                    Icon two = new ImageIcon("two.jpg");
                    Icon three = new ImageIcon("three.jpg");
                    Icon four = new ImageIcon("four.jpg");
                    Icon five = new ImageIcon("five.jpg");
                    Icon six = new ImageIcon("six.jpg");
                    Icon seven = new ImageIcon("seven.jpg");
                    Icon eight = new ImageIcon("eight.jpg");

                    JButton[] buttons = new JButton[100];
                    for (int i = 0; i < 100; ++i) {
                        buttons[i] = new JButton();
                        buttons[i].setIcon(empty);
                    }

                    int[] buttonsCondition = new int[100];
                    for (int i = 0; i < 100; ++i) {
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


                    for (int i = 0; i < 100; ++i) {
                        final Integer j = i;
                        buttons[i].addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                //JOptionPane.showMessageDialog(frame, "you press me");
                                //Integer j = i;
                                System.out.printf("button %d pressed, condition: ", j);
                                System.out.println(buttonsCondition[j]);
                                //++j;
                                if (buttonsCondition[j] == 1) {
                                    for (int i = 0; i < 100; ++i) {
                                        buttons[i].setEnabled(false);
                                        if (buttonsCondition[i] == 1) {
                                            buttons[i].setIcon(bomb);
                                        }

                                        //   -11  -1    +9
                                        //   -10 button +10
                                        //   -9   +1    +11

                                        if (buttonsCondition[i] == 0) {
                                            int count = 0;
                                            if (buttonsCondition[i - 1] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[i + 1] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[i + 10] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[i - 10] == 1){
                                                ++count;
                                            }
                                            if (buttonsCondition[i + 9] == 1){
                                                ++count;
                                            }
                                            if (buttonsCondition[i - 11] == 1){
                                                ++count;
                                            }
                                            if (buttonsCondition[i + 11] == 1){
                                                ++count;
                                            }
                                            if (buttonsCondition[i - 9] == 1){
                                                ++count;
                                            }

                                            if(count == 1){
                                                buttons[i].setIcon(one);
                                            } else if (count == 2){
                                                buttons[i].setIcon(two);
                                            } else if (count == 3){
                                                buttons[i].setIcon(three);
                                            } else if (count == 4){
                                                buttons[i].setIcon(four);
                                            } else if (count == 5){
                                                buttons[i].setIcon(five);
                                            } else if (count == 6){
                                                buttons[i].setIcon(six);
                                            } else if (count == 7){
                                                buttons[i].setIcon(seven);
                                            } else if (count ==8){
                                                buttons[i].setIcon(eight);
                                            } else {
                                                buttons[i].setIcon(empty);
                                            }
                                            
                                        }
                                    }
                                    buttons[j].setIcon(blowed);
                                    JOptionPane.showMessageDialog(frame, "Game Over");

                                } else {
                                    buttons[j].setEnabled(false);
                                }
                            }
                        });
                    }


                    JButton newGame = new JButton("New Game");
                    c.ipady = 0;
                    c.gridx = 10;
                    c.gridy = 10;
                    //c.weighty = 0.3;
                    c.anchor = GridBagConstraints.NORTH;
                    panel.add(newGame, c);

                    newGame.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            for (int i = 0; i < 100; ++i) {
                                buttons[i].setEnabled(true);
                                buttons[i].setIcon(empty);
                            }
                            for (int i = 0; i < 100; ++i) {
                                buttonsCondition[i] = ThreadLocalRandom.current().nextInt(0, 2);
                                System.out.printf("Button %d = %d", i, buttonsCondition[i]);

                                System.out.println();
                            }
                        }
                    });

                } catch (Exception e) {
                    System.out.println("No image");
                }

            }
        });

    }
}

