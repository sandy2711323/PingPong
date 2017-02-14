import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (Sandeep Satone) 
 * @version (V 1.0)
 */
public class Ball extends Actor
{
    private int XSPEED = 5;
    private int YSPEED = 5;
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        collisionDetectRIGHT(XSPEED);
        move();
        topWall();
        sideWall();
        
    } 
    private void move(){setLocation(getX()+XSPEED, getY()+YSPEED);} 
    
    public void topWall(){
        if(getY()> getWorld().getHeight() - getImage().getHeight()/2){
            YSPEED = YSPEED * -1;
     }
        if(getY() <= getImage().getHeight()/2) {
            YSPEED = YSPEED * -1;
     }   
    }
    
    public void sideWall(){
        GameOver gameover = new GameOver();
        if(getX()> getWorld().getWidth() - getImage().getHeight()/2){
           // YSPEED = YSPEED * -1;
          
           getWorld().showText("Player Right LOOSE", getWorld().getWidth()/2, getWorld().getHeight()/8);
           getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2);
         //   Greenfoot.playSound("gameover.wav");
           Greenfoot.stop();
     }
        if(getX() <= getImage().getWidth()/2) {
           // YSPEED = YSPEED * -1;
           getWorld().showText("Player Left LOOSE", getWorld().getWidth()/2, getWorld().getHeight()/8);
           getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2);
        //    Greenfoot.playSound("gameover.wav");
           Greenfoot.stop();
     }   
    }

    
    private int collisionDetectRIGHT(int SPEED){

        Actor ball_1 = getOneIntersectingObject(RightBat.class);
        Actor ball_2 = getOneIntersectingObject(LeftBat.class);
        if(ball_1 != null || ball_2 != null ){
            XSPEED = XSPEED * (-1);
            Greenfoot.playSound("sound.wav");
        }
        
        return XSPEED;
    }
}
