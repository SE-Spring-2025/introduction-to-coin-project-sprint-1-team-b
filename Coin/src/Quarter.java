public class Quarter extends Coin 
{
    /**
     * Constructor for objects of class Quarter. Sets value of quarter to 0.25
     */
    public Quarter() 
    {
        super(0.25);
    }

    /**
     * Constructor for the Quarter class. Sets the value of a
     * quarter to 0.25 and sets the year
     * @param year year of coin.
     */
    public Quarter(int year)
    {
        super(0.25);
        this.manufactureYear = year;
    }
    
}
