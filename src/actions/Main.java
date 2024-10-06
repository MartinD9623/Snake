package actions;

import clocks.GameClock;
import gui.MainFrame;

public class Main {
    public static void main(String[] args) {

        MainFrame mainFrame = new MainFrame();
        GameClock gc = new GameClock();

        mainFrame.create();
        gc.start();




    }
}