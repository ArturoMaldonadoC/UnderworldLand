import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Record extends Window
{

    private BtnMainMenu btnMainMenu;
    private final int x = 70;
    private final int y = 30;
    
    public Record()
    {    
        prepareWindow();
    }
    
    public void prepareWindow(){
          showText("record.txt", 250, 100);
          
        btnMainMenu = new BtnMainMenu();
        addObject(btnMainMenu,x,y);
    }
}
