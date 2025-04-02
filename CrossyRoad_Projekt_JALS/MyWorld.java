import greenfoot.*;

public class MyWorld extends World
{
    private Timer timer;
    private ScoreCounter scoreCounter;

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
    }

    public void spawnCoin() {
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        addObject(new Coin(), x, y);
    }
    
        public void addScore(int points) {
        scoreCounter.addScore(points);
    }
    }

