import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TreinBlauw here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreinBlauw extends Treinen
{
    /**
     * Act - do whatever the TreinBlauw wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(0);

        int x = getX();
        int y = getY();
        int ny = getY()+1;

        World world=getWorld();// new
        setLocation (x, ny);
        if(getY() == 297) {
            setLocation(getX(), getY() - 1);
        }
        if (isTouching(ContainerBlauwDek3.class) || isTouching (ContainerBlauwDek2.class) || isTouching(ContainerBlauwDek1.class)){
            //int x = getX();
            //  int y = getY();
            //int ny = getY()+1;
            setLocation (x, ny);
        }
         if (Greenfoot.isKeyDown("down")){
            setLocation(x, ny);
            }

        if (getX() <= 5 || getX() >= getWorld() . getWidth() -5)
        {
            getWorld().removeObject(this);

        }
        if (getY() <= 5 || getY() >= getWorld() . getHeight() -5)
        {
            getWorld().removeObject(this);

            world.removeObject(this);//new

            int count = Greenfoot.getRandomNumber(4);
            if (count == 3){ world.addObject(new TreinRood(), 179, 77);}
            else if (count == 2) {world.addObject(new TreinBlauw(),179, 77);}
            else if (count == 1) {world.addObject(new TreinGroen(),179, 77);}
            else {world.addObject(new TreinGeel(), 179, 77);};//new
        }
    }    
}
