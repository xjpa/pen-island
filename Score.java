import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
   public Score(){
       
       GreenfootImage sI = new GreenfootImage(200,200);
       setImage(sI);
       
    }
    
    public void setScore(int scorez){
        int fontsize = 20;
        GreenfootImage sI = getImage();
        sI.setFont(new java.awt.Font("Helvetica", java.awt.Font.PLAIN, 20));  
        sI.clear();
        sI.drawString("" + scorez, 100, 100);
        setImage(sI);
    }
}
