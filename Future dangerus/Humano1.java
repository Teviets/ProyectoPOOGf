import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Humano1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Humano1 extends People
{
    public int contwin = 0;
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
            contwin++;
            if (contwin == 2){
                World mundito = getWorld();
                Win win = new Win();
                Corazon cora = new Corazon();
                mundito.removeObject(cora);
                mundito.addObject(win,300,200);
                Greenfoot.stop();
            }
            ZoneWar mundo = (ZoneWar) getWorld();
            Counter cont = mundo.getCounter();
            cont.addCount();
        }
    }
}
