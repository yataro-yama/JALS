import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Klasse TrainandWagon, die sich über die Welt bewegt und das Chicken erkennt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TrainandWagon extends Actor
{
    public int chickenLives;
    protected static int ChickenLives = 1; 
    
    public void act() 
    {
        
    }    
    
    public void turnAtEdge() {
        if (isAtEdge()) {
            setLocation(0, 265);
        }
    }

    public void lookForChicken() {
        if (isTouching(Chicken.class)) {
            removeTouching(Chicken.class);
            chickenLives--;

            if (chickenLives <= 0) {
                GreenfootImage gameOverImage = new GreenfootImage("Game Over!", 60, Color.RED, new Color(0,0,0,0));
                Actor gameOverText = new Actor() {}; // Leerer Actor für den Text
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
