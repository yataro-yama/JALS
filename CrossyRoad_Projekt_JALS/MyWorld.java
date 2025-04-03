import greenfoot.*;

public class MyWorld extends World
{
    private Timer timer;
    private ScoreCounter scoreCounter;
    private int timertrain = 0;
    private boolean trainAdded = false;
    private boolean wagonAdded = false;
    private int collectedCoins = 0;
    public MyWorld()
    {    
        super(1280, 720, 1); 

        // Autos von Beginn an platzieren
        this.addObject(new Normalcar(), 15, 534);
        this.addObject(new Policecar(),1258,595);
        this.addObject(new Ambulance(),3,395);
        this.addObject(new Traktor(), 10,205);

        // Chicken von Beginn an platzieren
        this.addObject(new Chicken(), 606, 656);

        // Zug mit Wagon 
        /*this.addObject(new Train(),0,270);
        this.addObject(new Wagon(), -10, 270);*/
        // Timer anzeigen
        timer = new Timer();
        addObject(timer, 100, 50);

        // ScoreCounter unter dem Timer
        scoreCounter = new ScoreCounter();
        addObject(scoreCounter, 100, 90);

        // 5 Coins zu Beginn spawnen
        for (int i = 0; i < 5; i++) {
            spawnCoin();
        }
        // Coinbasket platzieren
        this.addObject(new Coinbasket(), 1193, 459);
    }

    public void spawnCoin() {
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        addObject(new Coin(), x, y);
    }

    public void addScore(int points) {
        scoreCounter.addScore(points);
        if (points > 0) { // Nur positive Punkte als eingesammelte Coins zählen
            collectedCoins += points;
            
        }
    }
    public int getCollectedCoins()
    {
        return collectedCoins;
    }
    
    public void resetCollectedCoins()
    {
        collectedCoins = 0; // Zurücksetzen, wenn die Münzen abgegeben werden
    }

    public void act() {
        if (!trainAdded) {
            this.addObject(new Train(), 0, 270);
            trainAdded = true;
            timertrain = 0; // Timer zurücksetzen
        }

        // Warte ca. 100 Acts (~2 Sekunden) bevor der Wagon erscheint
        if (trainAdded && !wagonAdded) {
            timertrain++;

            if (timertrain >= 100) { // 100 Acts ≈ 2 Sekunden
                this.addObject(new Wagon(), 0, 270);
                wagonAdded = true; // Damit es nur einmal passiert
            }
        }
    }
}

