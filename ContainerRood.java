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
        /*if(Greenfoot.mouseDragEnded(this)) {
        if(getOneIntersectingObject(TreinRood.class) != null) {
        setLocation(179, 266);//117, 297
        } 
        else { 
        setLocation(255, 389);
        }
        } 
         */
        

        //Actor treinrood = ((Actor) getWorld().getObjects(TreinRood.class).get(0));
        
        //int treinroodY = treinrood.getY()+1; 
        int x = getX();
        int y = getY();
        int ny = getY()+1;

        if (isTouching(TreinRood.class)){
            
            Actor treinrood = ((Actor) getWorld().getObjects(TreinRood.class).get(0));
            
            int treinroodY = treinrood.getY()+1;
            setLocation(179, 266);
            setLocation (179, treinroodY - 30);
        }
    }   
}    

