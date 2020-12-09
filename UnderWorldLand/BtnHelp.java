import greenfoot.*;


public class BtnHelp extends Button 
{
    private Help help;
    public BtnHelp()
    {
        image = new GreenfootImage("images/btn-ayuda-red.png");
        image.scale(with,heigth);
        setImage(image);
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(this)){
           image = new GreenfootImage("images/btn-ayuda-yellow.png");
           image.scale(with,heigth);
           setImage(image);
           Greenfoot.delay(10);
            
           help = new Help();
           Greenfoot.setWorld(help);
        }
    }
}
