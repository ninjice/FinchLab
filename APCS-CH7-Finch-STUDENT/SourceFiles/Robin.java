
/**
 * Write a description of class Robin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robin extends Bird
{

    /**
     * Constructor for objects of class Robin
     */
    public Robin()
    {
        super(); //don't modify this
    }

    public void fly() {
          //This will override the fly method
          saySomething("I'm flying!!");
    }
    
    public  void sing() {
        
    }
    
    public void move() {
         setWheelVelocities(100,100, 500);
    }
    
    public  void turnLeft() {
        
    }
    
    public  void turnRight() {
        
    }
    
    public  void backUp() {
        
    }
    
}
