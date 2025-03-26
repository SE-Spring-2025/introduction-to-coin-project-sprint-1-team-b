public class Dime extends Coin 
{
   
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
    }
    
}
