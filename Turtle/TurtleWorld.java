import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        int yay = 100;
        while (yay > 0);
            turtle.penDown();
            turtle.forward(50);
            turtle.turn(30);
            yay = yay - 1;
            
        

   }
}
