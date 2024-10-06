package gui;

import javax.swing.*;
import java.awt.*;

public class GameSetDraw extends JLabel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(DrawPanel.colorBlueR,DrawPanel.colorBlueG,DrawPanel.colorBlueB));
        g.fillRect(275,100,50,50);

        switch(DrawPanel.colorChange){
            case 0: g.setColor(new Color(DrawPanel.colorBlueR,DrawPanel.colorBlueG,DrawPanel.colorBlueB));
                break;
            case 1: g.setColor(new Color(DrawPanel.colorRedR,DrawPanel.colorRedG,DrawPanel.colorRedB));
                break;
            case 2: g.setColor(new Color(DrawPanel.colorGreenR,DrawPanel.colorGreenG,DrawPanel.colorGreenB));
                break;
        }
        g.fillRect(275,100,50,50);

        repaint();
    }
}
