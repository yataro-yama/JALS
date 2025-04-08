import greenfoot.*;

public class Policecar extends Autos
{
    public Policecar() 
    {
        GreenfootImage image = new GreenfootImage("police-car.png");
        image.scale(90, 50);
        setImage(image);
        chickenLives = 1;
    }
    public void act() 
    {
        turnAtEdge();
        move(-5);
        lookForChicken();
        setChickenLives(1);
    }    
    public void turnAtEdge() 
    {
        if (isAtEdge()) 
        {
            setLocation(1280,595);
        }
    }
}