import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class character extends Actor
{
    double move = 0;
    double gravity = 1;
    double movementvar = -5;
    /**
     * Act - do whatever the character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here
        setLocation (getX(), (int)(getY() + move));
        
        //gameoversssss
        if (getOneIntersectingObject(obstacles.class) != null){ ;
            displayGameOver2();
        }
        
         if (getOneIntersectingObject(obstacles2.class) != null){ ;
            displayGameOver2();
        }
         if (getOneIntersectingObject(obstacles3.class) != null){ ;
            displayGameOver2();
        }
         if (getOneIntersectingObject(obstacles4.class) != null){ ;
            displayGameOver2();
        }
        if (getOneIntersectingObject(megaObstacle.class) != null){ ;
            displayGameOver2();
        }
           
        if (getY() > getWorld().getHeight()){
                
        GameOver fail1 = new GameOver();
        getWorld().addObject(fail1, getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
        w5.music1.stop();
    }    
        
     if (getY() < (0)){
               
        GameOver3 fail2 = new GameOver3();
        getWorld().addObject(fail2, getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
        w5.music1.stop();
    }    
        
    
        if (Greenfoot.isKeyDown("up") == true){
            move = movementvar;
        }
        
    
    move = move + gravity;
}
private void displayGameOver2(){
    GameOver2 fail1 = new GameOver2();
        getWorld().addObject(fail1, getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
        w5.music1.stop();
}
}

