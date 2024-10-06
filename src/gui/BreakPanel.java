package gui;

import javax.swing.*;
import java.awt.*;

public class BreakPanel extends JPanel {

    JButton buttonContinue, buttonMenu,buttonSet,buttonExit;

    public BreakPanel(){

        this.setBounds(0,0,MainFrame.width,MainFrame.height);
        this.setBackground(new Color(5,55,5));


        buttonContinue = new JButton("Continue");
        buttonContinue.setBounds(200,100,100,50);
        buttonContinue.setVisible(true);

        buttonMenu = new JButton("Menu");
        buttonMenu.setBounds(200,175,100,50);
        buttonMenu.setVisible(true);

        buttonSet = new JButton("Settings");
        buttonSet.setBounds(200,250,100,50);
        buttonSet.setVisible(true);

        buttonExit = new JButton("Exit");
        buttonExit.setBounds(200,325,100,50);
        buttonExit.setVisible(true);


        this.add(buttonContinue);
        this.add(buttonMenu);
        this.add(buttonSet);
        this.add(buttonExit);

        this.setVisible(true);

        buttonContinue.addActionListener(e -> MainFrame.cardLayout.show(MainFrame.homeContainer,"Game"));
        buttonMenu.addActionListener(e -> MainFrame.cardLayout.show(MainFrame.homeContainer,"Home"));
        buttonSet.addActionListener(e -> MainFrame.cardLayout.show(MainFrame.homeContainer,"Set Game"));
        buttonExit.addActionListener(e -> System.exit(0));


        MainFrame.homeContainer.add(this,"Break Panel");

    }
}
