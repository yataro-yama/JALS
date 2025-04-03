import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse TrainandWagon.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TrainandWagon extends Actor
{
    /**
     * Act - tut, was auch immer TrainandWagon tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        // Ergänzen Sie Ihren Quelltext hier...
    }    
    public void turnAtEdge() {
        if (isAtEdge()) {
            //turn(180);
            setLocation(0,265);
        }
    }
}