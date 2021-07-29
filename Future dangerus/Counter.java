import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int contar = 0;
    /**
     * Act - do whatever the Vidas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    
    {
        setImage(new GreenfootImage ("0",20,Color.WHITE,Color.BLACK));
    }
    public void addCount ()
    {
        contar++;
        
    }
    public void restCount ()
    {
        contar--;
    }
    
}
