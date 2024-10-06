package gui;

import clocks.GameClock;

import javax.swing.*;
import java.awt.*;

public class GameSetPanel extends JPanel {

    JPanel gameSetPanel;
    JButton buttonBth, buttonCtg;
    JButton buttonNext, buttonBack, buttonNext2, buttonBack2;
    JLabel labelHeadline, labelDifficulty;
    int square = 50;
    GameSetDraw draw;

    public GameSetPanel(){

        gameSetPanel = new JPanel();
        gameSetPanel.setBackground(new Color(22, 45, 15));
        gameSetPanel.setLayout(null);
        gameSetPanel.setBounds(0,0,MainFrame.width,MainFrame.height);

        labelHeadline = new JLabel("Settings");
        labelHeadline.setBounds(200,50,200,50);
        labelHeadline.setFont(new Font("Dialog",50,50));
        gameSetPanel.add(labelHeadline);

        // Change the color

        buttonBack = new JButton("<");
        buttonBack.setBounds(200,100,square,square);
        gameSetPanel.add(buttonBack);

        draw = new GameSetDraw();
        draw.setBounds(0,0,MainFrame.width,MainFrame.height);
        draw.setVisible(true);

        gameSetPanel.add(draw);

        buttonNext = new JButton(">");
        buttonNext.setBounds(350,100,square,square);
        gameSetPanel.add(buttonNext);

        buttonBack.addActionListener(e -> {
            if(!(DrawPanel.colorChange == 0)) {
                DrawPanel.colorChange--;
            }else{
                DrawPanel.colorChange = 2;
            }
        });

        buttonNext.addActionListener(e -> {
            if(!(DrawPanel.colorChange == DrawPanel.snakeColors.length - 1)) {
                DrawPanel.colorChange++;
            }else{
                DrawPanel.colorChange = 0;
            }
        });

        // Change the difficulty

        buttonBack2 = new JButton("<");
        buttonBack2.setBounds(150,200,square,square);
        gameSetPanel.add(buttonBack2);

        labelDifficulty = new JLabel();
        labelDifficulty.setBounds(225,200,150,50);
        labelDifficulty.setFont(new Font("Arial",50,30));
        labelDifficulty.setText("Well Done");
        labelDifficulty.setHorizontalAlignment(SwingConstants.CENTER);
        gameSetPanel.add(labelDifficulty);

        buttonNext2 = new JButton(">");
        buttonNext2.setBounds(400,200,square,square);
        gameSetPanel.add(buttonNext2);

        buttonBack2.addActionListener(e ->
        {if(!(GameClock.speed == 200)){
            GameClock.speed = GameClock.speed + 50;
        }else{
            GameClock.speed = 50;
        }
            switch(GameClock.speed){
                case 200: labelDifficulty.setText("Well Done");
                    break;
                case 150: labelDifficulty.setText("Medium");
                    break;
                case 100: labelDifficulty.setText("Rare");
                    break;
                case 50: labelDifficulty.setText("Bleu");
                    break;
            }
        });

        buttonNext2.addActionListener(e ->
            {if(!(GameClock.speed == 50)){
                GameClock.speed = GameClock.speed - 50;
            }else{
                GameClock.speed = 200;
            }
                switch(GameClock.speed){
                    case 200: labelDifficulty.setText("Well Done");
                        break;
                    case 150: labelDifficulty.setText("Medium");
                        break;
                    case 100: labelDifficulty.setText("Rare");
                        break;
                    case 50: labelDifficulty.setText("Bleu");
                        break;
                }
            });

        // Back-Continue Button
        buttonBth = new JButton("BACK");
        buttonBth.setBounds(50,300,100,50);
        gameSetPanel.add(buttonBth);

        buttonCtg = new JButton("CONTINUE");
        buttonCtg.setBounds(450,300,100,50);
        gameSetPanel.add(buttonCtg);

        buttonBth.addActionListener(e -> MainFrame.cardLayout.show(MainFrame.homeContainer,"Home"));
        buttonCtg.addActionListener(e -> MainFrame.cardLayout.show(MainFrame.homeContainer,"Game"));

        //

        gameSetPanel.setVisible(true);

        MainFrame.homeContainer.add(gameSetPanel,"Set Game");

    }
}
