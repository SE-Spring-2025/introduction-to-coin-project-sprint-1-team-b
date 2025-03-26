public class HalfDollar extends Coin 
{
    /**
     * Constructor for the HalfDollar class. Sets the value of a half dollar to 0.5
     */
    public HalfDollar() 
    {
        super(0.5);
    }
    
    /**
     * Constructor for the HalfDollar class. Sets the value of a 
     * half dollar to 0.5 and sets the year
     * @param year y
     */
    public HalfDollar(int year)
    {
        super(0.5);
        this.manufactureYear = year;
    }
}
