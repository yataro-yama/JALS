import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Ambulance.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ambulance extends Autos {
    public Ambulance() {

        GreenfootImage image = new GreenfootImage("ambulance.png");
        image.scale(90, 50);
        image.rotate(180);
        setImage(image);
        chickenLives = 1;
    }
    public void turnAtEdge() {
        if (isAtEdge()) {
            //turn(180);
            setLocation(0,395);
        }
    }
    /**
     * Act - tut, was auch immer Ambulance tun will. Diese Methode wird aufgerufen,
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden.
     */
    public void act() {
        lookForChicken();
        turnAtEdge();
        move(10);
        setChickenLives(1);
        // Ergänzen Sie Ihren Quelltext hier...
    }
}