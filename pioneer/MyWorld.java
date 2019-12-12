import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


//private ArrayList<PLAYER> usePlayer = new ArrayList<PLAYER>(0);
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Actor player = null;
    String[][] nowWorld = new String[2][2];
    int xW=0;
    int yW=0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject( new enemy(), 500, 200 ); 
        
        player = new PLAYER();
        addObject( player, 300, 200 );
        
        
        GreenfootImage img1 = new GreenfootImage( "images/background1.png" );
        img1.scale(600,435);
        getBackground().drawImage( img1, 0, 0 );

    
    }
    
     public void act() 
    {
            int x = player.getX();
            int y = player.getY();
            
            if(x == 0){
                if(xW !=0){
                 GreenfootImage img = new GreenfootImage( "images/background1.png" );
                 img.scale(600,435);
                 getBackground().drawImage( img, 0, 0 );
                 player.setLocation(598,y);
                 xW--;            
                }              
            }
            if(x == 599){
                if(xW !=1){
                 GreenfootImage img = new GreenfootImage( "images/background2.png" );
                 img.scale(600,435);
                 getBackground().drawImage( img, 0, 0 );
                 player.setLocation(1,y);
                 xW++;
                }              
            }
                 

            showText( ""+x+","+y+","+xW, 100, 50 );
    }    
}
