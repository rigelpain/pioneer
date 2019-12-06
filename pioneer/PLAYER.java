import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PLAYER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PLAYER extends Actor
{
    int count=0;
    private  GreenfootImage img_right1 = null;
    private  GreenfootImage img_right2 = null;
    private  GreenfootImage img_right3 = null;
    private  GreenfootImage img_hidari1 = null;
    private  GreenfootImage img_hidari2 = null;
    private  GreenfootImage img_hidari3 = null;
    private  GreenfootImage img_back1 = null;
    private  GreenfootImage img_back2 = null;
    private  GreenfootImage img_back3 = null;
    private  GreenfootImage img_kousin1 = null;
    private  GreenfootImage img_kousin2 = null;
    private  GreenfootImage img_kousin3 = null;
    
    public PLAYER()
    {
         img_right1 =  new GreenfootImage( "images/right1.png" );
         img_right2 =  new GreenfootImage( "images/right2.png" );
         img_right3 =  new GreenfootImage( "images/right3.png" );
         img_hidari1 =  new GreenfootImage( "images/hidari1.png" );
         img_hidari2 =  new GreenfootImage( "images/hidari2.png" );
         img_hidari3 =  new GreenfootImage( "images/hidari3.png" );
         img_back1 =  new GreenfootImage( "images/back1.png" );
         img_back2 =  new GreenfootImage( "images/back2.png" );
         img_back3 =  new GreenfootImage( "images/back3.png" );
         img_kousin1 =  new GreenfootImage( "images/kousin1.png" );
         img_kousin2 =  new GreenfootImage( "images/kousin2.png" );
         img_kousin3 =  new GreenfootImage( "images/kousin3.png" );
    }
    
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
            if(count<12)setImage(img_right1);
            
            if(count<18)setImage(img_right2);
            
            if(count<24)setImage(img_right3);           
        }
        if( Greenfoot.isKeyDown( "left" ) ){
            setLocation( x-3,y );
            if(count<12)setImage(img_hidari1);
            if(count<18)setImage(img_hidari2);
            if(count<24)setImage(img_hidari3);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setLocation( x,y-3 );
            if(count<12)setImage(img_back1);
            if(count<18)setImage(img_back2);
            if(count<24)setImage(img_back3);
            
        }
        if( Greenfoot.isKeyDown( "down" ) ){
        setLocation( x,y+3 );
            if(count<12)setImage(img_kousin1);
            if(count<18)setImage(img_kousin2);
            if(count<24)setImage(img_kousin3);
        }
        Actor actor = getOneObjectAtOffset( 0, 0, enemy.class );
        if( actor != null ){
            getWorld().showText( "HOGE", 100, 50 );
        }  
        count++;
        if(count==24)count=1;
    }    
}
