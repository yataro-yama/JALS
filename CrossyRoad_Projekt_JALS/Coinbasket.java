import greenfoot.*;

public class Coinbasket extends Actor
{
    private int textRemoveTime = -1; // Zeit, wann der Text wieder entfernt werden soll

    public Coinbasket() 
    {
        GreenfootImage image = new GreenfootImage("basket.png");
        image.scale(60, 50); // Resize
        setImage(image);
    }
    public void act() 
    {
        CoinAbgabe();
        checkTextClear();
    }  
    public void CoinAbgabe ()
    {
        if (isTouching(Chicken.class)) 
        {
            MyWorld world = (MyWorld) getWorld();
            if (world != null) {
                int coinsToDeduct = world.getCollectedCoins();
                
                if (coinsToDeduct > 0) 
                { // Nur abziehen, wenn Coins vorhanden sind
                    getWorld().showText("Du hast " + coinsToDeduct + " Münzen abgegeben!", 700, 30);
                    world.resetCollectedCoins();

                    // Zeitpunkt merken, wann Text verschwinden soll (jetzt + 5 Sek.)
                    Timer timer = world.getTimer(); // getTimer() muss in MyWorld existieren
                    if (timer != null) 
                    {
                        textRemoveTime = timer.getElapsedSeconds() + 5;
                    }
                }
            }
        }
    }
    private void checkTextClear() 
    {
        MyWorld world = (MyWorld) getWorld();
        if (textRemoveTime != -1 && world != null) 
        {
            Timer timer = world.getTimer();
            if (timer != null && timer.getElapsedSeconds() >= textRemoveTime) 
            {
                getWorld().showText(" ", 700, 30); // Text löschen
                textRemoveTime = -1; // zurücksetzen
            }
        }
    }
}
