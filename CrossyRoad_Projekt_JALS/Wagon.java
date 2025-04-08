import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Wagon.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wagon extends TrainandWagon
{
        public Wagon() {
        GreenfootImage image = new GreenfootImage("wagon.png");
        image.scale(350, 90);
        setImage(image);
    }
    /**
     * Act - tut, was auch immer Wagon tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
      move(2); 
      turnAtEdge();
      lookForChicken();
    }    
}