import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * import greenfoot.*;
 */
public class People extends Actor
{
    public int pause = 50;
    public int pause1 = 200;
    public void act()
    {
        if (pause>0)
        {
            
            pause--;
        }
        if (pause == 0)
        {
            movimiento(10);
            cambioimagen();
        }
        replacement();
    }
    /**
     * El humano seleccion correcta
     */
    public void movimiento(int x)
    {
        move(x);
        
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn (Greenfoot.getRandomNumber(90));
        }
    }
    /**
       Cambia la imagen png
       */
    public void cambioimagen()
    {
        for (int i = 0;i<=50;i++){
            if (i==3){
                setImage("Escondidos.png");
            }
        }
    }
    /**
       Sirve para pasar este objeto a la subclase
       */
    public void replacement()
    {
        if (pause1>0)
        {
            pause1--;
        }
        if (pause1 == 0)
        {
            int x = getX();
            int y = getY();
            Humano1 Humano1=new Humano1();
            World mundo = getWorld();
            mundo.removeObject(this);
            mundo.addObject(Humano1,x,y);
        }
    }

}


