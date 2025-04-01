import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse MyWorld.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MyWorld extends World
{
    private Timer timer;

    /**
     * Konstruktor für Objekte der Klasse MyWorld
     */
    public MyWorld()
    {    
        // Erstellt eine neue Welt mit 1280x720 Zellen und einer Zell-Größe von 1x1 Pixeln.
        super(1280, 720, 1); 

        // Timer erstellen und zur Welt hinzufügen
        timer = new Timer();
        addObject(timer, 100, 50);  // Position: x=100, y=50
        
        this.addObject(new Normalcar(), 15, 534);
    }
}
