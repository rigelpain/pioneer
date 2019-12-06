import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PLAYER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PLAYER extends Actor
{
    
    /**
     * Act - do whatever the PLAYER wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        //getImage().scale( 100, 100 );
        if( Greenfoot.isKeyDown( "right" ) ){
        setLocation( x+3,y );
        }
        if( Greenfoot.isKeyDown( "left" ) ){
            
            setLocation( x-3,y );
        }
        if( Greenfoot.isKeyDown( "up" ) ){
        setLocation( x,y-3 );
        }
        if( Greenfoot.isKeyDown( "down" ) ){
        setLocation( x,y+3 );
        }
    }    
}
