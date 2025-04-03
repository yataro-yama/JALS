//import java.awt.Color;
import greenfoot.Color;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Timer extends Actor
{
    private long startTime;
    
    public Timer() {
        startTime = System.currentTimeMillis();
        updateImage(0);
    }

    public void act()
    {
        long currentTime = System.currentTimeMillis();
        int elapsedSeconds = (int)((currentTime - startTime) / 1000);
        updateImage(elapsedSeconds);
    }

    private void updateImage(int seconds) {
        GreenfootImage image = new GreenfootImage("Time: " + seconds + "s", 24, Color.BLACK, new Color(0,0,0,0));
        setImage(image);
    }

    public void reset() {
        startTime = System.currentTimeMillis();
    }
}
