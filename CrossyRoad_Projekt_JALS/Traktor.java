import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Traktor.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Traktor extends Actor
{
    private int chickenLives;

    public Traktor() {


        GreenfootImage image = new GreenfootImage("tractor.png");
        image.scale(90, 50);
        image.rotate(180);
        setImage(image);
        
        
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
     * Act - tut, was auch immer Traktor tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        lookForChicken();
        turnAtEdge();
        move(1);

        // Ergänzen Sie Ihren Quelltext hier...
    }    
    public void turnAtEdge() {
        if (isAtEdge()) {
            //turn(180);
            setLocation(0,205);
        }
    }
}