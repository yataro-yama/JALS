import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Policecar.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Policecar extends Autos
{
    public Policecar() {
        GreenfootImage image = new GreenfootImage("police-car.png");
        image.scale(90, 50);
        //image.rotate(90);
        setImage(image);
        chickenLives = 1;
    }
    /**
     * Act - tut, was auch immer Policecar tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        turnAtEdge();
        move(-5);
        lookForChicken();
        setChickenLives(1);
        // Ergänzen Sie Ihren Quelltext hier...
    }    
    public void turnAtEdge() {
        if (isAtEdge()) {
            //turn(180);
            setLocation(1280,595);
        }
    }
}