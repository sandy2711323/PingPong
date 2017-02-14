import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftBat here.
 * 
 * @author (Sandeep Satone) 
 * @version (V 1.0)
 */
public class LeftBat extends Actor
{
    /**
     * Act - do whatever the LeftBat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        addMotion();

    }  
    
    private void addMotion(){
    
       if(Greenfoot.isKeyDown("a")){
        
        setLocation(getX(), getY()-5);
        
        }
         if(Greenfoot.isKeyDown("s")){
        
        setLocation(getX(), getY()+5);
        
        }
    
    }
}
