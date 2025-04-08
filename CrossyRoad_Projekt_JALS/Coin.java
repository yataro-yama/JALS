import greenfoot.*;

public class Coin extends Actor
{
    public Coin() 
    {
        GreenfootImage image = new GreenfootImage("coin.png");
        image.scale(60, 50); // Resize
        setImage(image);
    }
    public void act()
    {
        if (isTouching(Chicken.class)) 
        {
            Greenfoot.playSound("coin_collect.mp3");    // MP3-Sound abspielen
            MyWorld world = (MyWorld) getWorld();       // Welt referenzieren
            world.addScore(1);                          // +1 Punkt zum Score
            world.spawnCoin();                          // Neue Coin spawnen
            world.removeObject(this);                   // Aktuelle Coin entfernen
        }
    }
}
