import greenfoot.*;

public class Traktor extends Autos
{
    public Traktor() 
    {
        GreenfootImage image = new GreenfootImage("tractor.png");
        image.scale(90, 50);
        image.rotate(180);
        setImage(image);
        chickenLives = 1;
    }
    public void act() 
    {
        lookForChicken();
        turnAtEdge();
        move(1);
        setChickenLives(1);
        // Ergänzen Sie Ihren Quelltext hier...
    }    
    public void turnAtEdge() 
    {
        if (isAtEdge()) 
        {
            setLocation(0,205);
        }
    }
}