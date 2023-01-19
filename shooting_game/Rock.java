import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rock extends Actor
{
    /**
     * This is the constructor of the Rock class.
     */
    public Rock()
    {
        super();
    
        // Randomly turn the rock
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Move the rock
        move(4);
        
        // Remove the rock if it is out of the world
        World world = getWorld();
        if (getX() < 0 || getX() >= world.getWidth() ||
            getY() < 0 || getY() >= world.getHeight()) {
            world.removeObject(this);
        }        
    }    
}
