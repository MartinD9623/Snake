package gui;

import actions.Action;
import game.Snake;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel{
    Point p;
    //public static boolean clock = true;
    public static int xoff = 100, yoff = 0, pgSize = 400;
    public static int colorBlueR = 0, colorBlueG = 0, colorBlueB = 255;
    public static int colorRedR = 255, colorRedG = 0, colorRedB = 0;
    public static int colorGreenR = 0, colorGreenG = 255, colorGreenB = 0;
    public static int[][] snakeColors;
    public static int colorChange = 0;

    public DrawPanel(){

        //Array for snakeColors
        snakeColors = new int[3][3];

        snakeColors[0][0] = colorBlueR;
        snakeColors[0][1] = colorBlueG;
        snakeColors[0][2] = colorBlueB;

        snakeColors[1][0] = colorRedR;
        snakeColors[1][1] = colorRedG;
        snakeColors[1][2] = colorRedB;

        snakeColors[2][0] = colorGreenR;
        snakeColors[2][1] = colorGreenG;
        snakeColors[2][2] = colorGreenB;

        //

        this.setBounds(0,0,MainFrame.width,MainFrame.height);
        this.setVisible(true);
        MainFrame.homeContainer.add(this,"Game");

        Action.UpAction upAction = new Action.UpAction();
        Action.DownAction downAction = new Action.DownAction();
        Action.LeftAction leftAction = new Action.LeftAction();
        Action.RightAction rightAction = new Action.RightAction();

        this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("W"),"upAction");
        this.getActionMap().put("upAction",upAction);

        this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("S"),"downAction");
        this.getActionMap().put("downAction",downAction);

        this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("A"),"leftAction");
        this.getActionMap().put("leftAction",leftAction);

        this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("D"),"rightAction");
        this.getActionMap().put("rightAction",rightAction);

        JButton button = new JButton("Test");
        button.setBounds(50,50,60,60);
        button.setVisible(true);
        button.addActionListener(e -> {
            MainFrame.cardLayout.show(MainFrame.homeContainer,"Break Panel");

        });


        this.add(button);

    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        // Draw

        // Draw Background
        g.setColor(new Color(0x34000008,true));
        g.fillRect(0,0,MainFrame.width,MainFrame.height);

        // Draw playground
        g.setColor(new Color(0x6000000,true));
        g.fillRect(xoff,yoff,pgSize,pgSize);

        // Draw Snake Tails
        for(int i = 0; i < Snake.tails.size(); i++){
            p = Snake.ptc(Snake.tails.get(i).getX(),Snake.tails.get(i).getY());
            switch(colorChange){
                case 0: g.setColor(new Color(snakeColors[colorChange][0]+5*i, snakeColors[colorChange][1]+5*i, snakeColors[colorChange][2]));
                break;
                case 1: g.setColor(new Color(snakeColors[colorChange][0], snakeColors[colorChange][1]+5*i, snakeColors[colorChange][2]+5*i));
                break;
                case 2: g.setColor(new Color(snakeColors[colorChange][0]+5*i, snakeColors[colorChange][1], snakeColors[colorChange][2]+5*i));
                break;
            }
            g.fillRect(p.x,p.y,20,20);

        }

        // Draw Snake Head
        g.setColor(new Color(snakeColors[colorChange][0],snakeColors[colorChange][1],snakeColors[colorChange][2]));
        p = Snake.ptc(Snake.head.getX(),Snake.head.getY());
        g.fillRect(p.x,p.y,20,20);

        // Draw PickUp
        g.setColor(new Color(255, 136, 0));
        p = Snake.ptc(Snake.pickUp.getX(),Snake.pickUp.getY());
        g.fillRect(p.x,p.y,20,20);

        // Draw Grid
        g.setColor(Color.WHITE);
        for (int x = 0; x < 20; x++){
            for (int y = 0; y < 20; y++){
                g.drawRect(xoff + 20*x,yoff + 20*y,20,20);
            }
        }
        repaint();
    }


}
