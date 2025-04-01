package Coins;
public class Dollar extends Coin 
{
    static double value = 1.00;
    static String commonName = "Dollar";
    static String frontMotto = "IN GOD WE TRUST";
    static int manufactureYear;
    static String frontImage = "S_Anthony";
    static String backImage = "Moon_Eagle";
    static String backMotto = "E PLURIBUS UNUM";
    static String frontLabel = "LIBERTY";
    static String backLabel = "UNITED STATES OF AMERICA";
    static String valueDescription = "ONE DOLLAR";
    static boolean ridgedEdge = true;
    static String metallurgy = "Cupro-Nickel";
        /**
         * Constructor for the Dollar class. Sets the value of a dollar to 1.0
         */
        public Dollar() 
        {
            super(value, commonName, frontMotto, 1776, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
        }
    
        /**
         * Constructor for the Dollar class. Sets the value of a 
         * dollar to 1.0 and sets the year
         * @param year year of coin.
         */
        public Dollar(int year)
        {
            super(value, commonName, frontMotto, year, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
            Dollar.manufactureYear = year;
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
