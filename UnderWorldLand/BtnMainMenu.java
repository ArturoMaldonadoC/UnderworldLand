import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class BtnMainMenu extends Button
{
    private Menu mainMenu;
    public BtnMainMenu(){
     image = new GreenfootImage("images/btn-mainmenu-red.png");
     image.scale(with,heigth);
     setImage(image);   
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
           image = new GreenfootImage("images/btn-mainmenu-yellow.png");
           image.scale(with,heigth);
           setImage(image);
           Greenfoot.delay(10);
            
           mainMenu = new Menu();
           Greenfoot.setWorld(mainMenu);
        }
    }    
}
