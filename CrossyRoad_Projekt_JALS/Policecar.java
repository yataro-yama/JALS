import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Policecar.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Policecar extends Actor
{
    private int chickenLives;

    public Policecar() {
        GreenfootImage image = new GreenfootImage("blue-car.png");
        image.scale(90, 50);
        //image.rotate(90);
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
     * Act - tut, was auch immer Policecar tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        turnAtEdge();
        move(-5);
        lookForChicken();
        // Ergänzen Sie Ihren Quelltext hier...
    }    
    public void turnAtEdge() {
        if (isAtEdge()) {
            turn(180);
        }
    }
}