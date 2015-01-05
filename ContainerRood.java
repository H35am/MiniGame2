import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContainerRood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContainerRood extends Cargo
{
    /**
     * Act - do whatever the ContainerRood wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
        { 
        // Drag the ContainerRood
        if(Greenfoot.mouseDragged(this)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());             
        }
         
        // Check if the drag has ended.
        if(Greenfoot.mouseDragEnded(this)) {
            if(getOneIntersectingObject(VrachtwagenRood.class) != null) {
                setLocation(117, 297);
            } 
            else { 
                setLocation(255, 389);
            }
        }        
    }   
}    

