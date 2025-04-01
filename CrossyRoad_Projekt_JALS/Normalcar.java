import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Normalcar.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Normalcar extends Actor
{
    public Normalcar()
    {
        GreenfootImage image = new GreenfootImage("redcar.png");
        image.scale(90, 50);
        image.rotate(180);
        setImage (image);
    }
    /**
     * Act - tut, was auch immer Normalcar tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        turnAtEdge();
        move(15);
    }    
        public void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(180);
        }
    }
}
    