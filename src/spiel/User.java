package spiel;

import java.awt.Graphics;
import javax.swing.JComponent;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Random;
import java.net.URL;

public class User extends JComponent {
    protected int point, status;      //0=blank, 1=schere, 2=stein, 3=papier
    private final Image schere, stone, paper, blank;
    private String[]  options = {"schere","stone","paper","random"};
         
    private final String
            FILEPATH = "data/",
            SCHERE_FILE = "schere_left.jpg",
            STONE_FILE = "stone_left.jpg",
            PAPER_FILE = "paper_left.jpg",
            BLANK_FILE = "questions.jpg";
    
    private Image readImage(String path) {
        URL url = this.getClass().getClassLoader().getResource(path);
        return Toolkit.getDefaultToolkit().getImage(url);
    }
    
    public User()   {
        //initialize images
        schere = readImage(FILEPATH + SCHERE_FILE);
        stone = readImage(FILEPATH + STONE_FILE);
        paper = readImage(FILEPATH + PAPER_FILE);
        blank = readImage(FILEPATH + BLANK_FILE);
        point = 0;
        status = 3;
    }
    
    @Override
    public synchronized void paint(Graphics g) { //draw the image
        this.repaint(0L,0,0,256,192);
        super.paint(g);

        Image toPaint = blank;
        switch (status) {
            case 0:
                toPaint = schere;
                break;
            case 1:
                toPaint = stone;
                break;
            case 2:
                toPaint = paper;
                break;
            default:
                break;
        }
        
        g.drawImage(toPaint,0,0,null);  //draw
    }
    
    public void choose(String weapon) {
        status = Arrays.asList(options).indexOf(weapon);
        
        if (status == 3)    // "random"
            status = new Random().nextInt(3);
        
        paint(getGraphics());
    }
   
    public void reset() {
        point = 0;
        status = 3;     
        paint(getGraphics()); //show the image
    }
    
    public void incScore() {
        point++;
    }
    
    public int getScore() {
        return point;
    }
    
    public int getStatus() {
        return status;
    }
}
