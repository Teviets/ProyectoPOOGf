import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot2_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot2_1 extends Robot2
{
    /**
     * Act - do whatever the Robot2_1 wants to do. This method is called whenever
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
            setImage("red-draught.png");
            contador();
            
        }
    }
    public void contador(){
        if (Greenfoot.mouseClicked(this)){
            ZoneWar mundo = (ZoneWar) getWorld();
            Counter cont = mundo.getCounter();
            cont.rest2();
        }
    }
}
