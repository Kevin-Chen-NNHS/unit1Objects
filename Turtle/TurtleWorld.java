import java.awt.Color;
import java.util.Random;


public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        turtle.setPenColor(Color.CYAN);
        turtle2.setPenColor(Color.GREEN);
        turtle3.setPenColor(Color.BLUE);
        int yay = 1000;
        int nay = 1000;
        int kay = 1000;
        
        turtle2.moveTo (turtle.getXPos(),turtle.getYPos() );
        
        while (yay > 0)
        { turtle.penDown();
            turtle.forward(100);
            turtle.turn(30);
            yay = yay - 1;
            
         
        }
        while (nay > 0)
        {   
         turtle2.penDown();
         turtle2.forward(100);
         turtle2.turn(60);
         nay = nay - 1;
        
        }
        while (kay > 0)
        {   
         turtle3.penDown();
         turtle3.forward(100);
         turtle3.turn(45);
         turtle3.forward(20);
         turtle3.turn(90);
         turtle3.forward(20);
         turtle3.turn(45);
         turtle3.turn(-60);
         
         
         kay = kay - 1;
        
    }
            
        
        

   }
}
