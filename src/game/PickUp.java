package game;

import java.util.concurrent.ThreadLocalRandom;

public class PickUp {

    int x,y;

    public PickUp(){
        this.x = ThreadLocalRandom.current().nextInt(0,20);
        this.y = ThreadLocalRandom.current().nextInt(0,20);
    }

    public void reset(){
        this.x = ThreadLocalRandom.current().nextInt(0,20);
        this.y = ThreadLocalRandom.current().nextInt(0,20);
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

}
