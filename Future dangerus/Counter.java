import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int contar = 5;
    /**
     * Act - do whatever the Vidas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    
    {
        setImage(new GreenfootImage (""+contar,20,Color.WHITE,Color.BLACK));
        lose();
    }
    public void addCount ()
    {
        contar++;
        setImage(new GreenfootImage(""+contar,20,Color.WHITE,Color.BLACK));
        
    }
    public void restCount ()
    {
        contar--;
        setImage(new GreenfootImage(""+contar,20,Color.WHITE,Color.BLACK));
    }
    public void rest2 (){
        contar = contar - 2;
        setImage(new GreenfootImage(""+contar,20,Color.WHITE,Color.BLACK));
    }
    public void lose (){
        if (contar<=0){
            setImage("Game_over.png");
            Greenfoot.stop();
        }
    }
}
