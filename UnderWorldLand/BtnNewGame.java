import greenfoot.*;


public class BtnNewGame extends Button
{
    
    public BtnNewGame(){
        image = new GreenfootImage("images/btn-red.png");
        image.scale(with,heigth);
        setImage(image);
    }

    public void act() 
    {
       if(Greenfoot.mouseClicked(this))
       {
            image = new GreenfootImage("images/btn-newgame-yellow.png");
            image.scale(with,heigth);
            setImage(image);
            Greenfoot.delay(10);
            
            Greenfoot.setWorld(new GameScreen());
       }
       
    } 


}
