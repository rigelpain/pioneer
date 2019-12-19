import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy_1 extends Actor
{
    GifImage myGif = new GifImage("enemy_1.gif");
    int count=0,count2=1;
    /**
     * Act - do whatever the enemy_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage( myGif.getCurrentImage() );
        
        int x = getX();
        int y = getY();
<<<<<<< HEAD
        setLocation( x-2,y );
            
  
=======
        
        setLocation( x-3,y );
        
>>>>>>> f6ebe6b8530f8ad55ecafd7a44a457719dccde7c
    }    
}
