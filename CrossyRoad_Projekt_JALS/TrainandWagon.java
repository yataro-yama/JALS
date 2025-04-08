import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

public class TrainandWagon extends Actor
{
    public int chickenLives = 1;

    public void act() 
    {
        turnAtEdge();
        lookForChicken();
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
                Greenfoot.playSound("game_over.mp3"); // 🔊 Game Over Sound

                GreenfootImage gameOverImage = new GreenfootImage("Game Over!", 60, Color.RED, new Color(0, 0, 0, 0));
                Actor gameOverText = new Actor() {};
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
        chickenLives = newChickenLives;
    }
}
