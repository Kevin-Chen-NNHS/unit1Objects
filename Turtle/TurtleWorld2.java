import java.awt.Color;
import java.util.Random;


public class TurtleWorld2
{
    public static void main(String args[])
    {
        World turtleWorld = new World(1000,1000);
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        turtle.setPenColor(Color.CYAN);
        turtle2.setPenColor(Color.GREEN);
        turtle3.setPenColor(Color.BLUE);
        int yay = 1000;
        int nay = 1000;
        int kay = 1000;
        
       
        while (kay > 0)
        {   
         turtle3.penDown();
         turtle3.forward(100);
         turtle3.turn(45);
         turtle3.forward(20);
         turtle3.turn(90);
         turtle3.forward(20);
         turtle3.turn(45);
         turtle3.forward(100);
         turtle3.turn(-90);
         turtle3.forward(5);
         
         
         
         
         kay = kay - 1;
        
    }
            
        
        

   }
}
