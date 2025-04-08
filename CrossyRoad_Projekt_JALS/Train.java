import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Train.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Train extends TrainandWagon
{
        public Train() {
        GreenfootImage image = new GreenfootImage("train_new.png");
        image.scale(200, 150);
        setImage(image);
    }
    /**
     * Act - tut, was auch immer Train tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        move(2);
        turnAtEdge();
        lookForChicken();
    }    
}