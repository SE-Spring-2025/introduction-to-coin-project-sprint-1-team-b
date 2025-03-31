package Coins;
public class Penny extends Coin
{
    static double value = .01;
    static String commonName = "Penny";
    static String frontMotto = "IN GOD WE TRUST";
    static int manufactureYear;
    static String frontImage = "A_Lincoln";
    static String backImage = "Lincoln_Memorial";
    static String backMotto = "E PLURIBUS ENUM";
    static String frontLabel = "LIBERTY";
    static String backLabel = "UNITED STATES OF AMERICA";
    static String valueDescription = "ONE CENT";
    static boolean ridgedEdge = false;
    static String metallurgy = "Copper";
    /**
     * Constructor for objects of class Penny. Sets value of penny to 0.01
     */
    public Penny() 
    {
        super(value, commonName, frontMotto, 1776, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
    }
    /**
     * Constructor for the Penny class. Sets the value of a
     * penny to 0.01 and sets the year
     * @param year year of coin.
     */
    public Penny(int year)
    {
        super(value, commonName, frontMotto, year, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
        Penny.manufactureYear = year;
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
