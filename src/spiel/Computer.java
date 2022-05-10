package spiel;

import java.util.Random;

public class Computer extends User {    
    public Computer() {
        super();
    }
    
    public void choose() { //randomly choose a "weapon"
        //randomize 5 times for higher randomness
        for(int i=0; i<5; i++)
            status = new Random().nextInt(3);
        paint(getGraphics());   
    }
}
