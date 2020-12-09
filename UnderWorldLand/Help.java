import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Help extends Window
{
    private BtnMainMenu btnMainMenu;
    private final int x = 70;
    private final int y = 30;
    public Help()
    {    
        prepareWindow();
       
    }
    
    public void prepareWindow(){
          showText("Help.txt", 250, 100);
        btnMainMenu = new BtnMainMenu();
        addObject(btnMainMenu,x,y);
    }
}
