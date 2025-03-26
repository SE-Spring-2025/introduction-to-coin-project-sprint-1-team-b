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
<<<<<<< HEAD
        this.year = year;
=======
        this.manufactureYear = year;
>>>>>>> 5d48e7b2f41891b2e85b2c800e4eae911b373f26
    }
}
