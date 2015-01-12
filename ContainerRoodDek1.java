import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContainerRoodDek1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContainerRoodDek1 extends Dek1
{
    /**
     * Act - do whatever the ContainerRoodDek1 wants to do. This method is called whenever
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

        if (isTouching(TreinRood.class)){

            Actor treinrood = ((Actor) getWorld().getObjects(TreinRood.class).get(0));

            int treinroodY = treinrood.getY()+1;
            setLocation(179, 266);
            setLocation (179, treinroodY - 30);
        }
        World world=getWorld();
        if (getY() == 0 || getY() == 774)//getWorld().getHeight()-1)
        {
            getWorld().removeObject(this);

            world.removeObject(this);     
            /*Check if the drag has ended.   uitgezet Thomas 
            if(Greenfoot.mouseDragEnded(this)) {
            if(getOneIntersectingObject(VrachtwagenRood.class) != null) 
            setLocation(113, 386);  
            else { 
            reset();  
            } 
            }*/
        } 
        /**
         * Reset the container to its original location.
         
        private void reset()
        {
            setLocation(originalX, originalY);
        }*/
    }
}

