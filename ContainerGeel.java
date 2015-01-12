import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContainerGeel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContainerGeel extends Cargo
{
    /**
     * Act - do whatever the ContainerGeel wants to do. This method is called whenever
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
        int x = getX();
        int y = getY();
        int ny = getY()+1;

        //int dockX = ((TreinRood) getWorld().getObjects(TreinRood.class).get(0)).getX();//

        if (isTouching(TreinGeel.class)){
            Actor treingeel = ((Actor) getWorld().getObjects(TreinGeel.class).get(0));
            int treingeelY = treingeel.getY()+1;
            
            setLocation(179, 266);
            setLocation (179, treingeelY-30);
        }
        /*Actor treingeel = ((Actor) getWorld().getObjects(TreinGeel.class).get(0));
        
        int treingeelY = treingeel.getY()+1; 
        int x = getX();
        int y = getY();
        int ny = getY()+1;

        if (isTouching(TreinGeel.class)){
            setLocation(179, 266);
            setLocation (179, treingeelY-30);
        }*/

        // Add your action code here.
    }    
}
