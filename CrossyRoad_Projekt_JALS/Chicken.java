import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Chicken.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Chicken extends Actor
{
    public Chicken() {

        GreenfootImage image = new GreenfootImage("chicken_new.png");
        image.scale(50, 35);
        //image.rotate(180);
        setImage(image);
    }
    /**
     * Act - tut, was auch immer Chicken tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */

     public void checkKeyPress()
     {
    if(Greenfoot.isKeyDown("left"))
    {
        setLocation(getX()-2, getY());
    }

    if(Greenfoot.isKeyDown("right"))
    {
        setLocation(getX()+2, getY());
    }
   
    if (Greenfoot.isKeyDown("up"))
    {
        setLocation(getX(), getY()-2);
    }
        if (Greenfoot.isKeyDown("down"))
    {
        setLocation(getX(), getY()+2);
    }
     }

    public void act() 
    {
        checkKeyPress();
        // Ergänzen Sie Ihren Quelltext hier...
    }    
}