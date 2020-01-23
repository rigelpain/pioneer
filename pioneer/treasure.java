import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class treasure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class treasure extends Actor
{
    /**
     * Act - do whatever the treasure wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor actor = getOneObjectAtOffset( 0, 0, PLAYER.class );
        if( actor != null ){
            World game2 = new GAME_CLEAR();
            Greenfoot.setWorld( game2 );
            //getWorld().showText( "GAME OVER", 300, 300 );
            Greenfoot.stop();
        }
    }    
}
