import java.util.Random;

public class Die_Simulator
{
    public static void main( String[] args )
    {
        //Option A
        Random generator = new Random();
        int dieValue = generator.nextInt(6); //returns number between 0 and 5, inclusive
        dieValue += 1;
        System.out.println( dieValue );
        
        
        //option B
        double dieValue2 = Math.random(); //returns a double (float) between 0 and 1 (0 inclusive 1 exclusive)
        dieValue2 *=6;
        dieValue2 += 1;
        System.out.println( (int) dieValue2 ); //prints 1, 2, 3, 4, 5, 6
    }
}