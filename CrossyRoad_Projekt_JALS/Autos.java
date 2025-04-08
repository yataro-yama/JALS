import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Autos.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Autos extends Actor
{
    public int chickenLives;
    protected static int ChickenLives = 1; 
    /**
     * Act - tut, was auch immer Autos tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        
    }    
    
    public void lookForChicken() {
        if (isTouching(Chicken.class)) {
            removeTouching(Chicken.class);
            chickenLives = chickenLives - 1;

            if (chickenLives == 0) {
                GreenfootImage gameOverImage = new GreenfootImage("Game Over!", 60, Color.RED, new Color(0,0,0,0));
                Actor gameOverText = new Actor() {}; // Leerer Actor für Text
                gameOverText.setImage(gameOverImage);
                getWorld().addObject(gameOverText, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                Greenfoot.delay(300);
                Greenfoot.stop();
                Greenfoot.setWorld(new MyWorld());
                getWorld().showText("", 600, 300);
            }

        }
    }
    public void setChickenLives(int newChickenLives) {
        ChickenLives = newChickenLives;
    }
}