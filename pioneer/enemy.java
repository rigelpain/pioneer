import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count=0;
    
    public void act() 
    { 
        int x = getX();
        int y = getY();
     
        if(count<6)setLocation( x,y+3 );
        else if(count<12)setLocation( x,y-3 );
        else if(count<18)setLocation( x-3,y );
        else if(count<24)setLocation( x-3,y );
        count++;
        if(count==24) count=1;
      
           
    }    
}
