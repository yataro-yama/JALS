import greenfoot.*;
import greenfoot.Color;

public class ScoreCounter extends Actor
{
    private int score = 0;

    public ScoreCounter() 
    {
        updateImage();
    }
    public void addScore(int amount) 
    {
        score += amount;
        updateImage();
    }
    private void updateImage() 
    {
        setImage(new GreenfootImage("Score: " + score, 24,Color.BLACK,new Color(0, 0, 0, 0)));
    }
}
