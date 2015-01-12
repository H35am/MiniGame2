import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
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

        //Add your action code here.
        //if (!isTouching(Havenkraan1.class)){
        move(0);

        int x = getX();
        int y = getY();
        int ny = getY()+1;

        World world=getWorld();// new
        setLocation (x, ny);
        if(getY() == 328) {
           
          setLocation(getX(), getY() - 1);
          
        }
        if (isTouching(ContainerRoodDek3.class) || isTouching (ContainerRoodDek2.class) || isTouching(ContainerRoodDek1.class)){
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
    //spawn();

    /*List objectslookingfor = getWorld().getObjects(TreinRood.class);
    if(objectslookingfor.size() < 1)
    {
    getWorld().addObject(new TreinRood(), 179, 77);

    } 

    //Actor barrel;
    //barrel = this.getOneObjectAtOffset(1, 1, barrel.class);

    //if(barrel != null)
    //{
    //    getWorld().removeObject(barrel);
    //    return;
    //} 
    }

    //public void ifAtWorldEdge()  
    //{  
    //    if (atWorldEdge())  
    //    {  
    //         getWorld().removeObject(this);  
    //    }  
    }  

    /*if (isTouching(ContainerRood.class)){
    move(0);

    int x = getX();
    int y = getY();
    int ny = getY()+1;

    setLocation (x, ny);
    } 
     */

}