import greenfoot.*;

public class Chicken extends Actor
{
    private GreenfootImage originalImage;

    public Chicken() 
    {
        originalImage = new GreenfootImage("chicken_new.png");
        originalImage.scale(40, 40);
        setImage(originalImage);
    }
    public void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            GreenfootImage flipped = new GreenfootImage(originalImage);
            flipped.mirrorHorizontally(); // always flip left
            setImage(flipped);

            setLocation(getX() - 20, getY());
            sleepFor(10);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setImage(new GreenfootImage(originalImage)); // Original zurücksetzen
            setLocation(getX()+20, getY());
            sleepFor(10);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-20);
            sleepFor(10);
        }

        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+20);
            sleepFor(10);
        }
    }
    public void act() 
    {
        checkKeyPress();
    }
}
