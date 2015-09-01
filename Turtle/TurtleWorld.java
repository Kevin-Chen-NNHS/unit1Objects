import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle.setPenColor(Color.CYAN);
        turtle2.setPenColor(Color.CYAN);
        int yay = 9000;
        int nay = 360;
        int kay = 420;
        while (yay > 0)
        { turtle.penDown();
            turtle.forward(100);
            turtle.turn(30);
            yay = yay - 1;
            
         
        }
       
            
        

   }
}
