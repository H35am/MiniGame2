import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContainerRoodDek2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContainerRoodDek2 extends Dek2
{
    /**
     * Act - do whatever the ContainerRoodDek2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
    // The initial location of the container
     private int originalX;
     private int originalY;
     
      /**
     * Will store the initial location of the container.
     */
     public void addedToWorld(World world) {
        originalX = getX();
        originalY = getY();
    }
    public void act() 
    {
        // Drag the Container
        if(Greenfoot.mouseDragged(this)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());             
        }
              
        // Check if the drag has ended.    
        if(Greenfoot.mouseDragEnded(this)) {
           if(getOneIntersectingObject(VrachtwagenRood.class) != null) 
                setLocation(113, 386);  
           else { 
                reset();  
                } 
            }
    } 
    /**
     * Reset the container to its original location.
     */
    private void reset()
    {
        setLocation(originalX -6, originalY -4);
    }
}  

