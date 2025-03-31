package Coins;
public class Quarter extends Coin 
{
    static double value = .25;
    static String commonName = "Quarter";
    static String frontMotto = "IN GOD WE TRUST";
    static int manufactureYear;
    static String frontImage = "G_Washington";
    static String backImage = "Eagle";
    static String backMotto = "E PLURIBUS UNUM";
    static String frontLabel = "LIBERTY";
    static String backLabel = "UNITED STATES OF AMERICA";
    static String valueDescription = "QUARTER DOLLAR";
    static boolean ridgedEdge = true;
    static String metallurgy = "Cupro-Nickel";
    /**
     * Constructor for objects of class Quarter. Sets value of quarter to 0.25
     */
    public Quarter() 
    {
        super(value, commonName, frontMotto, 1776, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
    }

    /**
     * Constructor for the Quarter class. Sets the value of a
     * quarter to 0.25 and sets the year
     * @param year year of coin.
     */
    public Quarter(int year)
    {
        super(value, commonName, frontMotto, year, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
        Quarter.manufactureYear = year;
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
