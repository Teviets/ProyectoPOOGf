import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot1_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot1_1 extends Robot1
{
    /**
     * Act - do whatever the Robot1_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        click();
    }
    public void click()
    {
        if (Greenfoot.mouseClicked(this)){
            setImage("yellow-draught.png");
            pausayborron();
            
            }
    }
    public void pausayborron()
    {
        if (pause>0)
        {
            pause--;
        }
        if (pause == 0)
        {
            World mundo = getWorld();
            mundo.removeObject(this);
        }
    }
}
