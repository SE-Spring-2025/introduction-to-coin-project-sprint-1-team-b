public class Dime extends Coin 
{
<<<<<<< HEAD
    /**
     * Constructor for objects of class Dime. Sets value of dime to 0.1
     */
    public Dime() 
    {
        super(0.1);
    }

    /**
     * Constructor for the Dime class. Sets the value of a 
     * dime to 0.1 and sets the year
     * @param year year of coin.
     */
    public Dime(int year)
    {
        super(0.1);
        this.year = year;
=======
   
        /**
         * Constructor for objects of class Dime. Sets value of dime to 0.1
         */
        public Dime() 
        {
            super(0.1);
        }
    
        /**
         * Constructor for the Dime class. Sets the value of a 
         * dime to 0.1 and sets the year
         * @param year year of coin.
         */
        public Dime(int year)
        {
            super(0.1);
            this.manufactureYear = year;
>>>>>>> 5d48e7b2f41891b2e85b2c800e4eae911b373f26
    }
    
}
