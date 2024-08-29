import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w1 extends World
{
 static GreenfootSound music2 = new GreenfootSound("justcantgetenough.mp3");
 
int timer = 60;
    /**
     * Constructor for objects of class w1.
     * 
     */
    public w1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 440, 1); 
	
        
    }
        public void act() {
    
            if (timer>0) {  
                timer++;  
                if(timer == 540) Greenfoot.setWorld(new w2());  
            }
             if ( Greenfoot.mouseClicked(null)) {
                Greenfoot.setWorld(new w2());
               
            }
        }
    }
