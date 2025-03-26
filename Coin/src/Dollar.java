public class Dollar extends Coin 
{
<<<<<<< HEAD
    /**
     * Constructor for the Dollar class. Sets the value of a dollar to 1.0
     */
    public Dollar() 
    {
        super(1.0);
    }

    /**
     * Constructor for the Dollar class. Sets the value of a 
     * dollar to 1.0 and sets the year
     * @param year year of coin.
     */
    public Dollar(int year)
    {
        super(1.0);
        this.year = year;
=======
    
        /**
         * Constructor for the Dollar class. Sets the value of a dollar to 1.0
         */
        public Dollar() 
        {
            super(1.0);
        }
    
        /**
         * Constructor for the Dollar class. Sets the value of a 
         * dollar to 1.0 and sets the year
         * @param year year of coin.
         */
        public Dollar(int year)
        {
            super(1.0);
            this.manufactureYear = year;
>>>>>>> 5d48e7b2f41891b2e85b2c800e4eae911b373f26
    }
    
}
