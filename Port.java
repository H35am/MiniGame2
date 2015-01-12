import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.List;
/**
 * Write a description of class Port here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Port extends World
{

    /**
     * Constructor for objects of class Port.
     * 
     */
    public Port()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 818, 1); 

        prepare();
//<<<<<<< Updated upstream
        
        //loop die loop for x en y
        int x = 255;
        int y = 206;
        
        for(int i = 0; i<3; i++){
            
            for(int j = 0; j<3; j++){
            spawnContainerDek1(x,y);
            y += 91;
            }
            //reset y 
            y = 206;
            x += 50;
        }
        //reset x
        x = 255;
         for(int i = 0; i<3; i++){
            
            for(int j = 0; j<3; j++){
            spawnContainerDek2(x,y);
            y += 91;
            }
            //reset y 
            y = 206;
            x += 50;
        }
        //reset x
        x = 255;
         for(int i = 0; i<3; i++){
            
            for(int j = 0; j<3; j++){
            spawnContainerDek3(x,y);
            y += 91;
            }
            //reset y 
            y = 206;
            x += 50;
        }
//=======
        setPaintOrder(Kraan.class,Cargo.class,Voertuigen.class);
//>>>>>>> Stashed changes
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    
     public void spawnContainerDek2(int x, int y)
    {   
        Dek2 containerRoodDek2 = new ContainerRoodDek2();
        Dek2 containerGeelDek2 = new ContainerGeelDek2();
        Dek2 containerGroenDek2 = new ContainerGroenDek2();
        Dek2 containerBlauwDek2 = new ContainerBlauwDek2();
        
        //array maken van containers
        Dek2[] containerArray = new Dek2[4];
        
        containerArray[0] = containerRoodDek2;
        containerArray[1] = containerGeelDek2;
        containerArray[2] = containerGroenDek2;
        containerArray[3] = containerBlauwDek2;
        
        //de identifier van de containerArray
        int i;
        
        //procent kans aanmaken
        int precentage = ((int)(Math.random() * 100));
        
        if(precentage >= 0 && precentage < 25){
        // kans tot 25%
            i=0;
        } else if (precentage >= 25 && precentage < 50){
            i=1;
        } else if (precentage >= 50 && precentage < 75){
            i=2;
        } else{
            i=3;
        }
        
        
        addObject(containerArray[i], x,y);
        
    }
    
    
    
     public void spawnContainerDek3(int x, int y)
    {   
        Dek3 containerRoodDek3 = new ContainerRoodDek3();
        Dek3 containerGeelDek3 = new ContainerGeelDek3();
        Dek3 containerGroenDek3 = new ContainerGroenDek3();
        Dek3 containerBlauwDek3 = new ContainerBlauwDek3();
        
        //array maken van containers
        Dek3[] containerArray = new Dek3[4];
        
        containerArray[0] = containerRoodDek3;
        containerArray[1] = containerGeelDek3;
        containerArray[2] = containerGroenDek3;
        containerArray[3] = containerBlauwDek3;
        
        //de identifier van de containerArray
        int i;
        
        //procent kans aanmaken
        int precentage = ((int)(Math.random() * 100));
        
        if(precentage >= 0 && precentage < 25){
        // kans tot 25%
            i=0;
        } else if (precentage >= 25 && precentage < 50){
            i=1;
        } else if (precentage >= 50 && precentage < 75){
            i=2;
        } else{
            i=3;
        }
        
        
        addObject(containerArray[i], x,y);
        
    }
    
    
     public void spawnContainerDek1(int x, int y)
    {   
        Dek1 containerRoodDek1 = new ContainerRoodDek1();
        Dek1 containerGeelDek1 = new ContainerGeelDek1();
        Dek1 containerGroenDek1 = new ContainerGroenDek1();
        Dek1 containerBlauwDek1 = new ContainerBlauwDek1();
        
        //array maken van containers
        Dek1[] containerArray = new Dek1[4];
        
        containerArray[0] = containerRoodDek1;
        containerArray[1] = containerGeelDek1;
        containerArray[2] = containerGroenDek1;
        containerArray[3] = containerBlauwDek1;
        
        //de identifier van de containerArray
        int i;
        
        //procent kans aanmaken
        int precentage = ((int)(Math.random() * 100));
        
        if(precentage >= 0 && precentage < 25){
        // kans tot 25%
            i=0;
        } else if (precentage >= 25 && precentage < 50){
            i=1;
        } else if (precentage >= 50 && precentage < 75){
            i=2;
        } else{
            i=3;
        }
        
        
        addObject(containerArray[i], x,y);
        
    }
    
    
    
    
    private void prepare()
    {
        
        AutowegVanLinks autowegvanlinks = new AutowegVanLinks();
        addObject(autowegvanlinks, 713, 100);
        AutowegVanLinks autowegvanlinks2 = new AutowegVanLinks();
        addObject(autowegvanlinks2, 62, 293);
        AutowegVanLinks autowegvanlinks3 = new AutowegVanLinks();
        addObject(autowegvanlinks3, 67, 672);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.act();
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.setLocation(92, 669);
        autowegvanlinks3.act();
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(91, 673);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.act();
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(101, 796);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.act();
        autowegvanlinks3.act();
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.setLocation(304, 588);
        autowegvanlinks3.act();
        autowegvanlinks3.setLocation(91, 721);
        autowegvanlinks.act();
        autowegvanlinks.act();
        autowegvanlinks.setLocation(734, 157);
        SpoorwegRechtdoor spoorwegrechtdoor = new SpoorwegRechtdoor();
        addObject(spoorwegrechtdoor, 447, 296);
        SpoorwegVanafLinks spoorwegvanaflinks = new SpoorwegVanafLinks();
        addObject(spoorwegvanaflinks, 807, 303);
        spoorwegvanaflinks.act();
        spoorwegvanaflinks.act();
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        spoorwegvanaflinks.setLocation(807, 303);
        removeObject(spoorwegvanaflinks);
        SpoorwegRechtdoor spoorwegrechtdoor2 = new SpoorwegRechtdoor();
        addObject(spoorwegrechtdoor2, 873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        spoorwegrechtdoor2.setLocation(873, 184);
        removeObject(spoorwegrechtdoor2);
        SpoorwegVanafRechts spoorwegvanafrechts = new SpoorwegVanafRechts();
        addObject(spoorwegvanafrechts, 896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        spoorwegvanafrechts.setLocation(896, 69);
        removeObject(spoorwegvanafrechts);
        SpoorwegVanafLinks spoorwegvanaflinks2 = new SpoorwegVanafLinks();
        addObject(spoorwegvanaflinks2, 791, 38);
        spoorwegvanaflinks2.setLocation(791, 39);
        spoorwegvanaflinks2.setLocation(782, 31);
        spoorwegvanaflinks2.setLocation(776, 32);
        AutowegLinkerzijde autoweglinkerzijde = new AutowegLinkerzijde();
        addObject(autoweglinkerzijde, 24, 567);
        removeObject(autoweglinkerzijde);
        removeObject(spoorwegrechtdoor);
        removeObject(autowegvanlinks3);
        removeObject(autowegvanlinks2);
        AutowegLinkerzijde autoweglinkerzijde2 = new AutowegLinkerzijde();
        addObject(autoweglinkerzijde2, 54, 597);
        autoweglinkerzijde2.setLocation(48, 597);
        SpoorwegRechtdoor spoorwegrechtdoor3 = new SpoorwegRechtdoor();
        addObject(spoorwegrechtdoor3, 465, 329);
        spoorwegrechtdoor3.setLocation(463, 314);
        spoorwegrechtdoor3.setLocation(463, 315);
        removeObject(spoorwegrechtdoor3);
        SpoorwegRechtdoor spoorwegrechtdoor4 = new SpoorwegRechtdoor();
        addObject(spoorwegrechtdoor4, 464, 332);
        spoorwegrechtdoor4.setLocation(461, 315);
        VrachtschipLeeg vrachtschipleeg = new VrachtschipLeeg();
        addObject(vrachtschipleeg, 311, 306);
        vrachtschipleeg.setLocation(305, 296);
        VrachtschipLeegCPU vrachtschipleegcpu = new VrachtschipLeegCPU();
        addObject(vrachtschipleegcpu, 572, 230);
        vrachtschipleegcpu.setLocation(567, 221);
        spoorwegrechtdoor4.setLocation(465, 317);
        spoorwegrechtdoor4.setLocation(464, 319);
        spoorwegrechtdoor4.setLocation(461, 326);
        spoorwegrechtdoor4.setLocation(462, 320);
        spoorwegrechtdoor4.setLocation(462, 327);
        spoorwegrechtdoor4.setLocation(462, 321);
        spoorwegrechtdoor4.setLocation(462, 312);
        ContainerBlauw containerblauw = new ContainerBlauw();
        addObject(containerblauw, 696, 815);
        containerblauw.setLocation(687, 815);
        ContainerRood containerrood = new ContainerRood();
        addObject(containerrood, 739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(739, 813);
        containerrood.setLocation(778, 811);
        ContainerGroen containergroen = new ContainerGroen();
        addObject(containergroen, 735, 782);
        containergroen.setLocation(735, 782);
        containergroen.setLocation(733, 816);
        containergroen.setLocation(733, 816);
        containergroen.setLocation(733, 816);
        containerrood.setLocation(687, 728);
        removeObject(containerrood);
        ContainerGroen containergroen2 = new ContainerGroen();
        addObject(containergroen2, 787, 812);
        containergroen2.setLocation(779, 817);
        ContainerRood containerrood2 = new ContainerRood();
        addObject(containerrood2, 695, 749);
        containerrood2.setLocation(684, 738);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(687, 815);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        containerblauw.setLocation(537, 746);
        removeObject(containerblauw);
        containerrood2.setLocation(686, 738);
        containergroen.setLocation(734, 739);
        containergroen2.setLocation(780, 737);
        containergroen2.setLocation(779, 739);
        ContainerBlauw containerblauw2 = new ContainerBlauw();
        addObject(containerblauw2, 691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(691, 814);
        containerblauw2.setLocation(686, 814);
        containergroen.setLocation(843, 648);
        containergroen2.setLocation(789, 599);
        ContainerBlauw containerblauw3 = new ContainerBlauw();
        addObject(containerblauw3, 738, 749);
        containerblauw3.setLocation(733, 739);
        ContainerGeel containergeel = new ContainerGeel();
        addObject(containergeel, 787, 746);
        containergeel.setLocation(779, 739);
        containergroen2.setLocation(789, 599);
        containergroen2.setLocation(789, 599);
        containergroen2.setLocation(789, 599);
        containergroen2.setLocation(789, 599);
        containergroen2.setLocation(789, 599);
        containergroen2.setLocation(789, 599);
        containergroen2.setLocation(789, 599);
        containergroen2.setLocation(789, 599);
        containergroen2.setLocation(789, 599);
        containergroen2.setLocation(789, 599);
        containergroen2.setLocation(789, 599);
        containergroen.setLocation(828, 709);

        TreinRood treinrood = new TreinRood(); //thomas
        addObject (treinrood, 179, 77); //thomas

        
        removeObject(containergroen);
        removeObject(containergroen2);
        ContainerGroen containergroen3 = new ContainerGroen();
        addObject(containergroen3, 737, 815);
        containergroen3.setLocation(732, 814);
        containergroen3.setLocation(732, 814);
        ContainerGroen containergroen4 = new ContainerGroen();
        addObject(containergroen4, 781, 792);
        containergroen4.setLocation(778, 815);
        ContainerBlauw containerblauw4 = new ContainerBlauw();
        addObject(containerblauw4, 525, 114);
        removeObject(containerblauw4);
        removeObject(spoorwegrechtdoor4);
        removeObject(autowegvanlinks);
        SpoorwegLang spoorweglang = new SpoorwegLang();
        addObject(spoorweglang, 183, 141);
        spoorweglang.setLocation(180, 142);
        spoorweglang.setLocation(178, 142);
        AutowegVanLinks autowegvanlinks4 = new AutowegVanLinks();
        addObject(autowegvanlinks4, 725, 151);
        autowegvanlinks4.setLocation(722, 154);
        autowegvanlinks4.setLocation(724, 153);
        removeObject(treinrood);
        TreinRood treinrood2 = new TreinRood();
        addObject(treinrood2, 184, 69);
        treinrood2.setLocation(178, 64);
        spoorweglang.setLocation(183, 203);
        spoorweglang.setLocation(183, 342);
        treinrood2.setLocation(99, 90);
        spoorweglang.setLocation(183, 352);
        spoorweglang.setLocation(178, 385);
        spoorweglang.setLocation(178, 378);
        removeObject(autoweglinkerzijde2);
        removeObject(treinrood2);
        AutowegLang autoweglang = new AutowegLang();
        addObject(autoweglang, 120, 280);
        autoweglang.setLocation(97, 278);
        autoweglang.setLocation(111, 278);
        autoweglang.setLocation(114, 341);
        removeObject(autowegvanlinks4);
        AutowegVanLinks autowegvanlinks5 = new AutowegVanLinks();
        addObject(autowegvanlinks5, 723, 168);
        autowegvanlinks5.setLocation(724, 153);
        autoweglang.setLocation(61, 338);
        spoorweglang.setLocation(103, 384);
        spoorweglang.setLocation(176, 385);
        autoweglang.setLocation(112, 339);
        autowegvanlinks5.setLocation(718, 127);
        autowegvanlinks5.setLocation(715, 127);
        autowegvanlinks5.setLocation(717, 128);
        autowegvanlinks5.setLocation(727, 127);
        autowegvanlinks5.setLocation(838, 148);
        autowegvanlinks5.setLocation(35, 235);
        autowegvanlinks5.setLocation(722, 160);
        autowegvanlinks5.setLocation(722, 157);
        Havenkraan1 havenkraan1 = new Havenkraan1();
        addObject(havenkraan1, 228, 546);
        removeObject(havenkraan1);
//<<<<<<< Updated upstream
        removeObject(autowegvanlinks5);
        
//=======

        TreinRood treinrood3 = new TreinRood(); //thomas
        addObject (treinrood3, 179, 77);

        Havenkraan1 havenkraan = new Havenkraan1(); //thomas
        addObject (havenkraan, 230, 545);//thomas

        

//>>>>>>> Stashed changes
    }

    
}