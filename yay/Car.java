  

/**
 * Write a description of class Car here.
 * 
 * @author (Kevin   ) 
 * @version (10 September 2015)
 */
public class Car
{
    /** the fuel efficienct for the car measured in units of miles / gallon (mpg)) */
    private double fuelEfficiency;
    
    /** the amount of fuel in the tank of the car measured in units of gallons */
    private double fuelInTank;
    

    /**
     * Constructor for objects of class Car
     */
    public Car(double fuelEfficiency)
    {
        fuelEfficiency = fuelEfficiency;
        
        fuelEfficiency = 0;
    }

    /**
     * This method simulates driving the car for the specified distance and reduces the 
     * amount of gas in the fuel tank.
     *
     * @pre        The specified distance will not consume more than the availible gas
     * @post   
     * @param   Distance    the specified distance to drive in units of miles
     * @return    FuelEfficiency
     */
    public void drive(double distance)
    {
        fuelInTank -= distance / fuelEfficiency;
 
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  Returns the number of gallon of gas in the car's tank
     *
     * @pre      Returns the number of gallons in the tank
     * @return   Returns the number of gallons in the tank
     */
    public double getGasInTank()
    {
        return 0.0;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     gallons of gas need to be a (+) digit
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   gallonOfGas    amount of gas to add the car's tank
     * @return  description of the return value
     */
    public void addGas(double gallonsOfGas)
    {
        gallonsOfGas = gallonsOfGas + fuelInTank;
        
    }



}
