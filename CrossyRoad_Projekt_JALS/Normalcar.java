import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Normalcar.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Normalcar extends Actor
{
    private int chickenLives;

    public Normalcar() {
        chickenLives = 1;
    }

    public void setChickenLives(int newChickenLives) {
        chickenLives = newChickenLives;
    }

    public void lookForChicken() {
        if (isTouching(Chicken.class)) {
            removeTouching(Chicken.class);
            chickenLives = chickenLives - 1;

            getWorld().showText("Erwischt! Sie haben noch " + chickenLives + " Leben!", 280, 280);
            if (chickenLives == 0) {
                getWorld().showText("Game Over!", 280, 280);
                Greenfoot.delay(300);
                Greenfoot.stop();
                Greenfoot.setWorld(new MyWorld());
                getWorld().showText("", 280, 280);
            }

        }
    }
    /**
     * Act - tut, was auch immer Normalcar tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        lookForChicken();
        // Ergänzen Sie Ihren Quelltext hier...
    }    
}