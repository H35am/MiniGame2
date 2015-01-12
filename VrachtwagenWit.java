import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VrachtwagenWit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VrachtwagenWit extends Vrachtwagens
{
    /**
     * Act - do whatever the VrachtwagenWit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

  
    public void act() 
    {  
        
        move(); 
        if(getY() == 297) {
           
          setLocation(getX(), getY() - 1);
          
        }
       
    }    
    
     public void move()
    {
       setLocation(getX(), getY() + 1);
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
        {
          createnewVrachtwagenWit();
           getWorld().removeObject(this);
           
                              
        }       
    }
  
       public void createnewVrachtwagenWit()
    {
        VrachtwagenWit newVrachtwagenWit;        
        newVrachtwagenWit = new VrachtwagenWit();   
        World world;
        world = getWorld();
        world.addObject(newVrachtwagenWit, 699, 4);
    }
}