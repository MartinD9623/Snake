package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    public static final int width = 600, height = 435;
    static JFrame frame;
    static JPanel homeContainer;
    static HomePanel homePanel;
    static GameSetPanel gameSetPanel;
    static BreakPanel breakPanel;
    static CardLayout cardLayout;
    DrawPanel drawPanel;

    public void create(){

        JFrame frame = new JFrame("Snake");

        cardLayout = new CardLayout();
        homeContainer = new JPanel(cardLayout);
        homeContainer.setBackground(Color.BLACK);

        homePanel = new HomePanel();
        gameSetPanel = new GameSetPanel();
        drawPanel = new DrawPanel();
        breakPanel = new BreakPanel();

        frame.add(homeContainer);
        cardLayout.show(homeContainer,"Home");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}