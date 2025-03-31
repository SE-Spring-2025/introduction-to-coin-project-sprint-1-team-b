public class Penny extends Coin 
{
   
    /**
    * Constructor for objects of class Dime. Sets value of dime to 0.1
     */
    public Penny() 
    {
        this(0);
    }
    
    /**
     * Constructor for the Dime class. Sets the value of a 
     * dime to 0.1 and sets the year
     * @param year year of coin.
     */
    public Penny(int year)
    {
        super(0.01,"Penny","IN GOD WE TRUST", year, "A_Lincoln", "Lincoln_Memorial", "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", "ONE CENT", false, "Copper");
    }
    
}