import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class ZoneWar extends World
{
    Counter cont = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     */
    public ZoneWar()
    {
        super(600, 400, 1);
        prepare();
    }
    public Counter getCounter()
    {
        return cont;
    }
    
    public void prepare()
    {
        addObject(cont, 200,100);
        //removeObject(counter);
        People people = new People();
        addObject(people,286,273);
        People people2 = new People();
        addObject(people2,406,74);
        Robot1 robot1 = new Robot1();
        addObject(robot1,306,175);
        Robot1 robot12 = new Robot1();
        addObject(robot12,470,171);
        Robot1 robot13 = new Robot1();
        addObject(robot13,108,212);
        Robot2 robot2 = new Robot2();
        addObject(robot2,129,329);
        Robot2 robot22 = new Robot2();
        addObject(robot22,416,278);
        Robot2 robot23 = new Robot2();
        addObject(robot23,210,84);
        Counter counter=getCounter();
        removeObject(counter);
    }
}

