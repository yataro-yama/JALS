import greenfoot.*;

public class Wagon extends TrainandWagon
{
    public Wagon() 
    {
       GreenfootImage image = new GreenfootImage("wagon.png");
       image.scale(350, 90);
       setImage(image);
    }
    public void act() 
    {
      move(2); 
      turnAtEdge();
      lookForChicken();
    }    
}