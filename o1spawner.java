import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class o1spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class o1spawner extends Actor
{
    /**
     * Act - do whatever the o1spawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        spawn();
    }    
    public void spawn(){
    if (Greenfoot.getRandomNumber(2) == 1){
        getWorld().addObject(new obstacles(), 400, 200);
}
}
}