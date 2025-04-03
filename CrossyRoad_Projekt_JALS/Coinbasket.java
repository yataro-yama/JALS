import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Coinbasket.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Coinbasket extends Actor
{
        public Coinbasket() {
        GreenfootImage image = new GreenfootImage("basket.png");
        image.scale(60, 50); // Resize by pixels ("X"x"Y")
        setImage(image);
    }
    /**
     * Act - tut, was auch immer Coinbasket tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        CoinAbgabe();
        // Ergänzen Sie Ihren Quelltext hier...
    }  
    
    public void CoinAbgabe ()
    {
     if (isTouching(Chicken.class)) {
            MyWorld world = (MyWorld) getWorld();
            if (world != null) {
                int coinsToDeduct = world.getCollectedCoins();
                
                if (coinsToDeduct > 0) { // Nur abziehen, wenn Coins vorhanden sind
                    world.addScore(-coinsToDeduct);
                    getWorld().showText("Du hast "+coinsToDeduct+" Münzen abgegeben!",600,300);
                    world.resetCollectedCoins(); // Münzen auf 0 setzen
                }
            }
        }
    }
}