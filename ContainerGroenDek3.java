import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContainerGroenDek3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContainerGroenDek3 extends Dek3
{
    /**
     * Act - do whatever the ContainerGroenDek3 wants to do. This method is called whenever
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
        int x = getX();
        int y = getY();
        int ny = getY()+1;

        if (isTouching(TreinGroen.class)){

            Actor treingroen = ((Actor) getWorld().getObjects(TreinGroen.class).get(0));

            int treingroenY = treingroen.getY()+1;
            setLocation(179, 266);
            setLocation (179, treingroenY - 30);
        }
        World world=getWorld();
        if (getY() == 0 || getY() == 774)//getWorld().getHeight()-1)
        {
            getWorld().removeObject(this);

            world.removeObject(this);

            /* Check if the drag has ended.    
            if(Greenfoot.mouseDragEnded(this)) {
            if(getOneIntersectingObject(VrachtwagenGeel.class) != null) 
            setLocation(113, 386);  
            else { 
            reset();  
            } 
            }*/
        } 
        /**
         * Reset the container to its original location.
         *
        private void reset()
        {
        setLocation(originalX, originalY);
        }
         */}
} 

