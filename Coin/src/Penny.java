public class Penny extends Coin
{
    /**
     * Constructor for objects of class Penny. Sets value of penny to 0.01
     */
    public Penny() 
    {
        super(0.01);
    }

    /**
     * Constructor for the Penny class. Sets the value of a
     * penny to 0.01 and sets the year
     * @param year year of coin.
     */
    public Penny(int year)
    {
        super(0.01);
        this.year = year;
    }
    
}
