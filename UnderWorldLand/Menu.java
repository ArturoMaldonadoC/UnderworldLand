import greenfoot.*;


public class Menu extends Window
{
    private BtnNewGame newGame;
    private BtnRecord record;
    private BtnHelp help;
    private BtnExit exit;

    private static final GreenfootImage fondoMenu = new GreenfootImage("images/main-menu.jpg");

    public Menu()
    {
       // super(with,height, 1); 
        fondoMenu.scale(with,height);
        setBackground(fondoMenu);
        
        prepareButtons();
        
    }
   
    
    private void prepareButtons(){
        newGame = new BtnNewGame();
        addObject(newGame,BtnX,BtnY);
       
        record = new BtnRecord();
        addObject(record,BtnX,BtnY + buttonGap);
        
        help = new BtnHelp();
        addObject(help,BtnX,BtnY + buttonGap*2);
        
        exit = new BtnExit();
        addObject(exit,BtnX,BtnY + buttonGap*3);
        
        showText("UnderWorld Land", 250, 100);
        
    }
    
    
   
}
