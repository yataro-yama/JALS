import greenfoot.*;

public class Ambulance extends Autos 
{
    public Ambulance() 
    {
        GreenfootImage image = new GreenfootImage("ambulance.png");
        image.scale(90, 50);
        image.rotate(180);
        setImage(image);
        chickenLives = 1;
    }
    public void turnAtEdge() 
    {
        if (isAtEdge()) {
            setLocation(0,395);
        }
    }
    public void act() 
    {
        lookForChicken();
        turnAtEdge();
        move(10);
        setChickenLives(1);
    }
}