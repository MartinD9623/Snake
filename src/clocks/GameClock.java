package clocks;

import actions.Collision;
import game.Snake;

public class GameClock extends Thread{

    public static boolean running = true;
    public static int speed = 200;

    public void run(){

            while(running){
                try{
                    sleep(speed);//200
                Snake.move();
                Snake.waitToMove = false;
                Collision.collidePickUp();
                if(Collision.collideSelf()){
                    Snake.tails.clear();
                    //Score
                }
                if(Collision.collideWall()){
                    if(Snake.head.getX() > 19){
                        Snake.head.setX(0);
                    }if(Snake.head.getX() < 0){
                        Snake.head.setX(19);
                    }if(Snake.head.getY() > 19){
                        Snake.head.setY(0);
                    }if(Snake.head.getY() < 0){
                        Snake.head.setY(19);
                    }

                    /*Snake.tails.clear();
                    Snake.head.setX(7);
                    Snake.head.setY(7);*/
                    //Score
                }
                }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
