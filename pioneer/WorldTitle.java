import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldTitle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldTitle extends World
{

    /**
     * Constructor for objects of class WorldTitle.
     * 
     */
    public WorldTitle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void act()
{
    if( Greenfoot.isKeyDown( "Z" ) ){
        World game = new MyWorld();
        Greenfoot.setWorld( game );
        Greenfoot.playSound("sounds/start.mp3");
    }
}
}
