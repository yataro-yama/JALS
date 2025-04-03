import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Traktor.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Traktor extends Autos
{
    public Traktor() {
        GreenfootImage image = new GreenfootImage("tractor.png");
        image.scale(90, 50);
        image.rotate(180);
        setImage(image);
        chickenLives = 1;
    }

    /**
     * Act - tut, was auch immer Traktor tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        lookForChicken();
        turnAtEdge();
        move(2);
        setChickenLives(1);
        // Ergänzen Sie Ihren Quelltext hier...
    }    
    public void turnAtEdge() {
        if (isAtEdge()) {
            setLocation(0,205);
        }
    }
}