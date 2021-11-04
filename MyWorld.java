import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600,400,1);
        /*addObject(new emoji(5, "booga", 10), 200, 200);
        addObject(new emoji(5, "booga", 20), 300, 150);
        addObject(new seal(20, "ooga", 100), 250, 250);
        addObject(new seal(15, "ooga", 50), 250, 250);*/
        addObject(new seal(75, 20, "oog"),0,0);
        addObject(new seal(70, 20, "oog"),200,100);
        
    }
}
