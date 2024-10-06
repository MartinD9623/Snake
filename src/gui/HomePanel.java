package gui;

import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel{

    JPanel homePanel;
    JButton buttonStart, buttonExit;
    JLabel label;
    Icon snake;
    JLabel labelSnake;

    public HomePanel(){

        homePanel = new JPanel();
        homePanel.setBackground(new Color(80, 115, 70));

        homePanel.setLayout(null);
        homePanel.setBounds(0,0,MainFrame.width,MainFrame.height);

        label = new JLabel("SNAKE");
        label.setBounds(50,50,100,200);
        label.setFont(new Font("Dialog",50,50));
        homePanel.add(label);


        buttonStart = new JButton("START");
        buttonStart.setBounds(200,100,200,50);
        homePanel.add(buttonStart);

        buttonExit = new JButton("EXIT");
        buttonExit.setBounds(200,250,200,50);
        homePanel.add(buttonExit);

        snake = new ImageIcon(getClass().getResource("snake.jpeg"));
        labelSnake = new JLabel(snake);
        labelSnake.setBounds(0,0,MainFrame.width,MainFrame.height);
        homePanel.add(labelSnake);

        homePanel.setVisible(true);

        MainFrame.homeContainer.add(homePanel,"Home");

        buttonStart.addActionListener(e -> MainFrame.cardLayout.show(MainFrame.homeContainer, "Set Game"));
        buttonExit.addActionListener(e -> System.exit(0));
    }
}
