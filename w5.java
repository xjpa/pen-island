import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w5 extends World
{
static GreenfootSound music1 = new GreenfootSound("justcantgetenough.mp3");
    int spawnvar1 = 0;
    int spawnvar2 = 0;
    int spawnvar3 = 0;
    int spawnvar4 = 2;
    int spawnvar5 = 0;
    int counter = 1;
    int stage = 0;
    Score scorez = null;
    
    /**
     * Constructor for objects of class w4.
     * 
     */
    public w5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 440, 1, false);
        character x = new character();
        addObject(x, 20, getHeight()/2);
        music1.playLoop();
        
        //scoring
        scorez = new Score();
        addObject(scorez, 100, 400);
        scorez.setScore(0);

        
    }
    
    public void act(){
        
        counter++;
        spawnvar1++;
        spawnvar2++;
        spawnvar3++;
        spawnvar5++;
        stage++;
       
       
       scorez.setScore(counter);
        if (spawnvar1 == 100){
            obstacles o1 = new obstacles();
            addObject(o1, 800+ Greenfoot.getRandomNumber(100), 44 + Greenfoot.getRandomNumber(500));
            spawnvar1 = 0;
        }

         if (spawnvar2 == 5000){
            obstacles2 o2 = new obstacles2();
            addObject(o2, 800+ Greenfoot.getRandomNumber(100), 44 + Greenfoot.getRandomNumber(500));
            spawnvar2 = 0;
        }

        if (spawnvar3 == 10000){
            obstacles3 o3 = new obstacles3();
            addObject(o3, 800+ Greenfoot.getRandomNumber(100), 44 + Greenfoot.getRandomNumber(500));
            spawnvar3 = 0;
        }
        
         if (spawnvar4 == Greenfoot.getRandomNumber(100)){
             obstacles4 o4 = new obstacles4();
             addObject(o4, 800+ Greenfoot.getRandomNumber(100), 44 + Greenfoot.getRandomNumber(500));
            spawnvar4 = 0;
        }
        
        if(stage == 10000){
            megaObstacle mO = new megaObstacle();
            addObject(mO, 800+ Greenfoot.getRandomNumber(100), 44 + Greenfoot.getRandomNumber(500));
            stage = 9900;
           
        }
       
    }
}

        

