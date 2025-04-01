import greenfoot.*;

public class MyWorld extends World
{
    private Timer timer;
    private ScoreCounter scoreCounter;

    public MyWorld()
    {    
        super(1280, 720, 1); 
        
        // Auto 
        this.addObject(new Normalcar(), 15, 534);

        // Chicken
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
