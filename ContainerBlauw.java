import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContainerBlauw here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContainerBlauw extends Cargo
{
    /**
     * Act - do whatever the ContainerBlauw wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {// Drag the ContainerRood
        if(Greenfoot.mouseDragged(this)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());             
        }

        // Check if the drag has ended.
        /*if(Greenfoot.mouseDragEnded(this)) {
        if(getOneIntersectingObject(TreinBlauw.class) != null) {
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

        if (isTouching(TreinBlauw.class)){
            Actor treinblauw = ((Actor) getWorld().getObjects(TreinBlauw.class).get(0));
       
            int treinblauwY = treinblauw.getY()+1;
            setLocation(179, 266);
            setLocation (179, treinblauwY-30);
        }
        
       //Actor treinblauw = ((Actor) getWorld().getObjects(TreinBlauw.class).get(1));
       
        
        /*int treinblauwY = treinblauw.getY()+1; 
        int x = getX();
        int y = getY();
        int ny = getY()+1;

        if (isTouching(TreinBlauw.class)){
            setLocation(179, 266);
            setLocation (179, ny);
        }
*/
        // Add your action code here.
    }    
}
