import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class seal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class seal extends Actor
{
    private int speed=0;
    private String name="";
    private int battery=0;
    private int counter=0;
    
    public seal(int speed, int battery, String name){
        this.speed=speed;
        this.name=name;
        this.battery=battery;
        
    }
    
    public void act(){
        if(battery>0){
             if(getX()==599&&getY()==399){
                turnTowards(599, 0);
                move(this.speed);
                this.counter++;
                if(counter%3==0){
                    this.battery--;
                }
            }
            else if(getX()==599&&getY()==0){
                turnTowards(0, 0);
                move(this.speed);
                this.counter++;
                if(counter%3==0){
                    this.battery--;
                }
            }
            else if(getX()==0&&getY()==0){
                turnTowards(0, 399);
                move(this.speed);
                this.counter++;
                if(counter%3==0){
                    this.battery--;
                }
            }
            else if(getX()==0&&getY()==399){
                turnTowards(599, 399);
                move(this.speed);
                this.counter++;
                if(counter%3==0){
                    this.battery--;
                }
            }
            move(this.speed);
            this.counter++;
            if(counter%3==0){
                this.battery--;
            }
        
            if(battery==1){
                System.out.println(toString());
            }
            if(counter%3==0){
                this.battery--;
            }
            
        }
    }
    public String toString(){
        return("Name: " + this.name + "\nspeed: " + this.speed + "\nbattery: "+ this.battery);
    }
}


    
    
   /* private int speed = 0;
    private String name ="null";
    private int turnAmount = 0;
    private int collision;
    public seal(){
        this.collision=0;
    }
    public seal(int speed, String name, int turn){
        this.speed=speed;
        this.name=name;
        this.turnAmount=turn;
        
    }
    public void act() 
    {
        move(this.speed);
        if(isAtEdge()){
            turn(this.turnAmount);
        }
        if(isTouching(emoji.class)){
            collision++;
            System.out.println("collision!" + this.collision);
            turn(90);
        }
        getWorld().showText((toString()), getWorld().getWidth()/2, getWorld().getHeight()/5);
    }
    public String toString(){
        return("Name: " + this.name + "\nX: " + getX() + "\nY: "+ getY());
    }*/
    
    
