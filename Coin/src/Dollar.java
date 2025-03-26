public class Dollar extends Coin 
{
    
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
    }
    
}
