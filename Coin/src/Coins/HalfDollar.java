package Coins;
public class HalfDollar extends Coin 
{
    static double value = .5;
    static String commonName = "HalfDollar";
    static String frontMotto = "IN GOD WE TRUST";
    static int manufactureYear;
    static String frontImage = "J_Kennedy";
    static String backImage = "Presidential_Seal";
    static String backMotto = "E PLURIBUS ENUM";
    static String frontLabel = "LIBERTY";
    static String backLabel = "UNITED STATES OF AMERICA";
    static String valueDescription = "HALF DOLLAR";
    static boolean ridgedEdge = false;
    static String metallurgy = "Cupro-Nickel";
    /**
     * Constructor for the HalfDollar class. Sets the value of a half dollar to 0.5
     */
    public HalfDollar() 
    {
        super(value, commonName, frontMotto, 1776, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
    }
    
    /**
     * Constructor for the HalfDollar class. Sets the value of a 
     * half dollar to 0.5 and sets the year
     * @param year y
     */
    public HalfDollar(int year)
    {
        super(value, commonName, frontMotto, year, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
        HalfDollar.manufactureYear = year;
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
