import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Normalcar.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Normalcar extends Actor {
    private int chickenLives;

    public Normalcar() {
        GreenfootImage image = new GreenfootImage("redcar.png");
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
            chickenLives--;

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

    public void act() {
        turnAtEdge();
        move(15);
        lookForChicken();
    }    

    public void turnAtEdge() {
        if (isAtEdge()) {
            turn(180);
        }
    }
}