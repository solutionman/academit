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
                JFrame frame = new JFrame("Minesweeper");
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

                    int spaces = 0;  // amount of spaces on start of the game
                    int[] buttonsCondition = new int[100];
                    for (int i = 0; i < 100; ++i) {
                        buttonsCondition[i] = ThreadLocalRandom.current().nextInt(0, 2);
                        System.out.printf("Button %d = %d", i, buttonsCondition[i]);
                        System.out.println();
                        if(buttonsCondition[i] == 0){
                            ++spaces;
                        }
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

                    JTextField bombsCount = new JTextField();
                    c.gridx = 10;
                    c.gridy = 11;
                    c.anchor = GridBagConstraints.CENTER;
                    bombsCount.setEditable(false);
                    panel.add(bombsCount, c);
                    bombsCount.setText("spots left: " + Integer.toString(spaces));

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

                                // guess was wrong - bomb blows
                                if (buttonsCondition[j] == 1) {
                                    for (int i = 0; i < 100; ++i) {
                                        buttons[i].setEnabled(false);
                                        if (buttonsCondition[i] == 1) {
                                            buttons[i].setIcon(bomb);
                                        }


                                    }
                                    buttons[j].setIcon(blowed);
                                    JOptionPane.showMessageDialog(frame, "Game Over");

                                // guess was right - continue game
                                } else {
                                    buttons[j].setEnabled(false);


                                    //  0 10 20 30  .. 90
                                    //  1 11 21 31  .. 91
                                    //  2 12 22 32  .. 92
                                    //  3 13 23 33  .. 93
                                    //  4 14 24 34  .. 94
                                    //  .................
                                    //  9 19 29 39  .. 99


                                    //   -11  -1    +9
                                    //   -10 button +10
                                    //   -9   +1    +11


                                    //   0    +10
                                    //  +1    +11
                                    if (buttonsCondition[j] == 0) {
                                        int count = 0;

                                        if (j == 0) {
                                            if (buttonsCondition[j + 10] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 11] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 1] == 1) {
                                                ++count;
                                            }

                                            //  -11  -1
                                            //  -10   99
                                        } else if (j == 99) {
                                            if (buttonsCondition[j - 1] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j - 11] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j - 10] == 1) {
                                                ++count;
                                            }

                                            //  -10  90
                                            //  -9   +1
                                        } else if (j == 90) {
                                            if (buttonsCondition[j - 10] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j - 9] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 1] == 1) {
                                                ++count;
                                            }

                                            //  -1   +9
                                            //   9   +10
                                        } else if (j == 9) {
                                            if (buttonsCondition[j - 1] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 9] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 10] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 11] == 1) {
                                                ++count;
                                            }

                                            //  10 20 30 40 50 60 70 80

                                            //     -10 button +10
                                            //     -9   +1    +11
                                        } else if (j == 10 || j == 20 || j == 30 || j == 40 || j == 50 || j == 60 || j == 70 || j == 80) {
                                            if (buttonsCondition[j - 10] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j - 9] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 1] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 10] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 11] == 1) {
                                                ++count;
                                            }

                                            //  19 29 39 49 59 69 79 89

                                            //     -11  -1    +9
                                            //     -10 button +10
                                        } else if (j == 19 || j == 29 || j == 39 || j == 49 || j == 59 || j == 69 || j == 79 || j == 89) {
                                            if (buttonsCondition[j - 11] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j - 10] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j - 1] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 9] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 10] == 1) {
                                                ++count;
                                            }

                                            //  1 2 3 4 5 6 7 8

                                            //     -1    +9
                                            //   button +10
                                            //     +1    +11
                                        } else if (j == 1 || j == 2 || j == 3 || j == 4 || j == 5 || j == 6 || j == 7 || j == 8) {
                                            if (buttonsCondition[j - 1] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 9] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 10] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 11] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 1] == 1) {
                                                ++count;
                                            }

                                            //  91 92 93 94 95 96 97 98

                                            //      -11  -1
                                            //      -10 button
                                            //      -9   +1
                                        } else if (j == 91 || j == 92 || j == 93 || j == 94 || j == 95 || j == 96 || j == 97 || j == 98) {
                                            if (buttonsCondition[j - 1] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j - 11] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j - 10] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j - 9] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 1] == 1) {
                                                ++count;
                                            }


                                           //    -11  -1    +9
                                           //    -10 button +10
                                           //    -9   +1    +11
                                        } else {
                                            if (buttonsCondition[j - 1] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 1] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 10] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j - 10] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 9] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j - 11] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j + 11] == 1) {
                                                ++count;
                                            }
                                            if (buttonsCondition[j - 9] == 1) {
                                                ++count;
                                            }
                                        }


                                        if (count == 1) {
                                            buttons[j].setIcon(one);
                                        } else if (count == 2) {
                                            buttons[j].setIcon(two);
                                        } else if (count == 3) {
                                            buttons[j].setIcon(three);
                                        } else if (count == 4) {
                                            buttons[j].setIcon(four);
                                        } else if (count == 5) {
                                            buttons[j].setIcon(five);
                                        } else if (count == 6) {
                                            buttons[j].setIcon(six);
                                        } else if (count == 7) {
                                            buttons[j].setIcon(seven);
                                        } else if (count == 8) {
                                            buttons[j].setIcon(eight);
                                        } else {
                                            buttons[j].setIcon(empty);
                                        }

                                        // Check is you win the game
                                        int freeSpots = 0;
                                        int pressedButtons = 0;
                                        int spotsLeft;
                                        for(int k = 0; k < 100; ++k){
                                            if(buttonsCondition[k] == 0){
                                                ++freeSpots;
                                            }
                                            if(buttonsCondition[k] == 0 && !buttons[k].isEnabled()){
                                                ++pressedButtons;
                                            }

                                        }

                                        // counting free spots
                                        spotsLeft = freeSpots - pressedButtons;
                                        System.out.println("spots left: " + spotsLeft);
                                        // TODO have to find out, why it works only after another new game
                                        bombsCount.setText("spots left: " + Integer.toString(spotsLeft));

                                        if(freeSpots == pressedButtons){
                                            JOptionPane.showMessageDialog(frame, "You Win !!!");
                                            for(int m = 0; m < 100; ++m){
                                                if (buttonsCondition[m] == 1){
                                                    buttons[m].setIcon(bomb);
                                                }
                                                buttons[m].setEnabled(false);
                                            }
                                        }

                                    }
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

