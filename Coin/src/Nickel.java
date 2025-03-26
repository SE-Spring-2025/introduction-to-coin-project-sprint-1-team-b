public class Nickel extends Coin 
{
    /**
     * Constructor for objects of class Nickel. Sets value of nickel to 0.05
     */
    public Nickel() 
    {
        super(0.05);
    }

    /**
     * Constructor for the Nickel class. Sets the value of a
     * nickel to 0.05 and sets the year
     * @param year year of coin.
     */
    public Nickel(int year)
    {
        super(0.05);
        this.year = year;
    }
    
}
