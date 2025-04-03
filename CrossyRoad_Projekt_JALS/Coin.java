import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Coin extends Actor
{
    //public int eingesammelteMuenze;
    public Coin() {
        GreenfootImage image = new GreenfootImage("coin.png");
        image.scale(60, 50); // Resize by pixels ("X"x"Y")
        setImage(image);
    }

    public void act()
    {
        if (isTouching(Chicken.class)) {
            MyWorld world = (MyWorld) getWorld(); // Vor dem Entfernen speichern
            world.addScore(1);// Score +1
            world.spawnCoin(); // Neues Coin
            world.removeObject(this); // Coin löschen
        }
    }
}