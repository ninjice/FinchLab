import edu.cmu.ri.createlab.terk.robot.finch.Finch;
/**
 * Write a description of class modifiedFinch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Bird extends Finch
{

    /**
     * Constructor for objects of class ModifiedFinch
     */
    public Bird()
    {
        super(); //don't modify this
    }
    
    public void fly() {
          System.out.println("flap flap");
    }
    
    public abstract void sing();
    
    public void move() {
         setWheelVelocities(100,100, 500);
    }
    
    public abstract void turnLeft();
    
    public abstract void turnRight();
    
    public abstract void backUp();
    
}
