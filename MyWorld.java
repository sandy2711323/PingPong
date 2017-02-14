import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class MyWorld here.
 * 
 * @author (Sandeep Satone) 
 * @version (V 1.0)
 */
public class MyWorld extends World
{

    private static final int WIDTH= 600;
    private static final int HEIGHT= 400;
    private static final int SCORE_RIGHT = 0;
    private static final int SCORE_LIGHT = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WIDTH, HEIGHT, 1); 
        prepare();
        showText("Controls A and S", 100, HEIGHT-50);
        showText("Controls UP and DOWN", WIDTH-150, HEIGHT-50);
       // showText("SCORE : "+SCORE_RIGHT, 100, HEIGHT-350);
      //  showText("SCORE : "+SCORE_LIGHT, WIDTH-150, HEIGHT-350);
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LeftBat leftbat = new LeftBat();
        addObject(leftbat,0,217);
        RightBat rightbat = new RightBat();
        addObject(rightbat,WIDTH,217);
        Ball ball = new Ball();
        addObject(ball,WIDTH/2,HEIGHT/2);
        drawLine();


    }
    
    private void drawLine(){
     GreenfootImage img = new GreenfootImage(2, 10);
        img.setColor(Color.CYAN);
        img.fill();
        setBackground(img);
        getBackground().drawLine(WIDTH/2,0,WIDTH/2,HEIGHT);
    }
    
    
}
