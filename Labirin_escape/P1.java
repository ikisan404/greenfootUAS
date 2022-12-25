import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P1 extends Actor
{
    /**
     * Act - do whatever the P1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World world = getWorld();
    public P1(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()-25,image.getHeight()-25);
    }
    public void act()
    {
        // Add your action code here.
        playerMovement();
        collectCoin();
        isCollideObstacles();
    }
    private void playerMovement() {
        if(Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY()-3);
            if(isTouchWall()) {
                setLocation(getX(), getY()+3);
            }
        }
        if(Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY()+3);
            if(isTouchWall()) {
                setLocation(getX(), getY()-3);
            }
        }
        if(Greenfoot.isKeyDown("a")) {
            setLocation(getX()-3, getY());
            if(isTouchWall()) {
                setLocation(getX()+3, getY());
            }
        }
        if(Greenfoot.isKeyDown("d")) {
            setLocation(getX()+3, getY());
            if(isTouchWall()) {
                setLocation(getX()-3, getY());
            }
        }
    }
    private boolean isTouchWall() {
        if(isTouching(Walls.class)) {
            return true;
        }
        else {
            return false;
        }
    }
    private void collectCoin() {
        if(isTouching(Coin.class)) {
            if(getWorld() instanceof MyWorld) {
                removeTouching(Coin.class);
                MyWorld.scorePlayer++;
            }
            
        }    
    }
    private void isCollideObstacles() {
        if(isTouching(Thorns.class)) {
            if(getWorld() instanceof MyWorld) {
                MyWorld.lives--;
                this.setLocation(70, 570);
            }
        }
    }
}
