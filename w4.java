import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w4 extends World
{

    /**
     * Constructor for objects of class w4.
     * 
     */
    public w4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 440, 1); 
    }
    
    public void act() {
    if ( Greenfoot.mouseClicked(null)) {
            Greenfoot.setWorld(new w5());
            w1.music2.stop();
        }
    }
}
