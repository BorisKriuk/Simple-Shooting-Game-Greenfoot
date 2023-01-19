import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Spaceship extends Actor
{
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Rotate the spaceship based on the key pressed
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        else if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
    
        // Move the spaceship based on the key pressed
        if (Greenfoot.isKeyDown("up")) {
            move(4);
        }
        
        /*int rot = 0; 
        rot = getRotation();
        System.out.print(rot);*/
        
        if (Greenfoot.isKeyDown("space")) {
            if (getWorld().getObjects(Bullet.class).isEmpty()) {
                Bullet bullet = new Bullet();
                getWorld().addObject(bullet, getX(), getY());
                bullet.setRotation(getRotation());
            }
        }       

        
        /**
         * Task 2 - Shoot the bullet
         */
        
        // If the player presses the spacebar key
        //    if there is currently no bullet in the game
        //        add a bullet

    
        // Check if a rock hits the spaceship
        if (!getObjectsInRange(60, Rock.class).isEmpty()) {
            // Add an explosion at the spaceship position
            Explosion explosion = new Explosion();
            getWorld().addObject(explosion, getX(), getY());

            // Remove the spaceship from the world
            getWorld().removeObject(this);
            
            // Stop the game
            Greenfoot.stop();
        }
    }
}
