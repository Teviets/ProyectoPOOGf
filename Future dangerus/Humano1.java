import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Humano1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Humano1 extends People
{
    /**
     * Act - do whatever the Humano1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int pause = 2;
    public void act()
    {
        click();
    }
    public void click()
    {
        if (Greenfoot.mouseClicked(this)){
            setImage("blue-draught.png");
            contador();
            
        }
    }
    public void contador(){
        if (Greenfoot.mouseClicked(this)){
            ZoneWar mundo = (ZoneWar) getWorld();
            Counter cont = mundo.getCounter();
            cont.addCount();
        }
    }
}
