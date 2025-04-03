import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Normalcar.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Normalcar extends Autos {
    public Normalcar() {
        GreenfootImage image = new GreenfootImage("redcar.png");
        image.scale(90, 50);
        image.rotate(180);
        setImage(image);
        chickenLives = 1;
    }

    public void act() {
        turnAtEdge();
        move(15);
        lookForChicken();
        setChickenLives(1);
    }    

    public void turnAtEdge() {
        if (isAtEdge()) {
           setLocation(0,534);
        }
    }
}