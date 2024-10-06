package actions;

import game.Dir;
import game.Snake;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Action{
    public static class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(!(Snake.head.getDir() == Dir.DOWN) && !Snake.waitToMove){
                Snake.head.setDir(Dir.UP);
                Snake.waitToMove = true;
            }
        }
    }
    public static class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(!(Snake.head.getDir() == Dir.UP) && !Snake.waitToMove){
                Snake.head.setDir(Dir.DOWN);
                Snake.waitToMove = true;
            }

        }
    }
    public static class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(!(Snake.head.getDir() == Dir.RIGHT) && !Snake.waitToMove){
                Snake.head.setDir(Dir.LEFT);
                Snake.waitToMove = true;
            }

        }
    }
    public static class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(!(Snake.head.getDir() == Dir.LEFT) && !Snake.waitToMove){
                Snake.head.setDir(Dir.RIGHT);
                Snake.waitToMove = true;
            }
        }
    }
}