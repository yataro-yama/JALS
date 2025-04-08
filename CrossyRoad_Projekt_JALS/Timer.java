import greenfoot.Color;
import greenfoot.*;

public class Timer extends Actor
{
    private long startTime;

    public Timer() 
    {
        startTime = System.currentTimeMillis();
        updateImage(0);
    }
    public void act()
    {
        long currentTime = System.currentTimeMillis();
        int elapsedSeconds = (int)((currentTime - startTime) / 1000);
        updateImage(elapsedSeconds);
    }
    private void updateImage(int seconds) 
    {
        GreenfootImage image = new GreenfootImage("Time: " + seconds + "s", 24, Color.BLACK, new Color(0,0,0,0));
        setImage(image);
    }
    public void reset() 
    {
        startTime = System.currentTimeMillis();
    }
    public int getElapsedSeconds() // Gibt die vergangenen Sekunden zurück
    {
        long currentTime = System.currentTimeMillis();
        return (int)((currentTime - startTime) / 1000);
    }
}
