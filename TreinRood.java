import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TreinRood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreinRood extends Treinen
{
    /**
     * Act - do whatever the TreinRood wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       if (!isTouching(Havenkraan1.class) || isTouching(ContainerRood.class)){
        move(0);
        
        int x = getX();
        int y = getY();
        int ny = getY()+1;

        setLocation (x, ny);
    }
        
        if (isTouching(ContainerRood.class)){
            move(0);
        
        int x = getX();
        int y = getY();
        int ny = getY()+1;

        setLocation (x, ny);
    }    
    }    
}
