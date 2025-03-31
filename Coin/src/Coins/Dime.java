package Coins;
public class Dime extends Coin 
{
    static double value = .1;
    static String commonName = "Dime";
    static String frontMotto = "IN GOD WE TRUST";
    static int manufactureYear;
    static String frontImage = "F_Roosevelt";
    static String backImage = "Torch_Branches";
    static String backMotto = "E PLURIBUS ENUM";
    static String frontLabel = "LIBERTY";
    static String backLabel = "UNITED STATES OF AMERICA";
    static String valueDescription = "ONE DIME";
    static boolean ridgedEdge = true;
    static String metallurgy = "Cupro-Nickel";
        /**
         * Constructor for objects of class Dime. Sets value of dime to 0.1
         */
        public Dime() 
        {
            super(value, commonName, frontMotto, 1776, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
        }
    
        /**
         * Constructor for the Dime class. Sets the value of a 
         * dime to 0.1 and sets the year
         * @param year year of coin.
         */
        public Dime(int year)
        {
            super(value, commonName, frontMotto, year, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
            Dime.manufactureYear = year;
    }
    
    public double getValue()
    {
        return value;
    }

    public String getCommonName()
    {
        return commonName;
    }

    public String getFrontMotto()
    {
        return frontMotto;
    }

    public String getBackMotto()
    {
        return backMotto;
    }

    public int getYear()
    {
        return manufactureYear;
    }

    public String getFrontImage()
    {
        return frontImage;
    }

    public String getBackImage()
    {
        return backImage;
    }

    public String getFrontLabel()
    {
        return frontLabel;
    }

    public String getBackLabel()
    {
        return backLabel;
    }

    public String getValueDescription()
    {
        return valueDescription;
    }

    public Boolean getRidgedEdge()
    {
        return ridgedEdge;
    }

    public String getMetallurgy()
    {
        return metallurgy;
    }
}
