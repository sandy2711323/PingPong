import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RightBat here.
 * 
 * @author (Sandeep Satone) 
 * @version (V 1.0)
 */
public class RightBat extends Actor
{
    /**
     * Act - do whatever the RightBat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        addMotion();
    }   
    
    private void addMotion(){
    
       if(Greenfoot.isKeyDown("up")){
        
        setLocation(getX(), getY()-5);
        
        }
         if(Greenfoot.isKeyDown("down")){
        
        setLocation(getX(), getY()+5);
        
        }
    
    }
}
