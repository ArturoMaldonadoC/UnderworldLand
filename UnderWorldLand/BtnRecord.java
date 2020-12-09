import greenfoot.*;

public class BtnRecord extends Button  
{
    private Record record;
    public BtnRecord()
    {
        image = new GreenfootImage("images/btn-record-red.png");
        image.scale(with,heigth);
        setImage(image);
    }

    public void act(){
     if(Greenfoot.mouseClicked(this)){
           image = new GreenfootImage("images/btn-record-yellow.png");
           image.scale(with,heigth);
           setImage(image);
           Greenfoot.delay(10);
            
           record = new Record();
           Greenfoot.setWorld(record);
        }
    }
}
