package Coins;
public class Nickel extends Coin 
{
    static double value = .05;
    static String commonName = "Nickel";
    static String frontMotto = "IN GOD WE TRUST";
    static int manufactureYear;
    static String frontImage = "T_Jefferson";
    static String backImage = "Jefferson_Memorial";
    static String backMotto = "E PLURIBUS ENUM";
    static String frontLabel = "LIBERTY";
    static String backLabel = "UNITED STATES OF AMERICA";
    static String valueDescription = "FIVE CENTS";
    static boolean ridgedEdge = false;
    static String metallurgy = "Cupro-Nickel";
    /**
     * Constructor for objects of class Nickel. Sets value of nickel to 0.05
     */
    public Nickel() 
    {
        super(value, commonName, frontMotto, 1776, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
    }

    /**
     * Constructor for the Nickel class. Sets the value of a
     * nickel to 0.05 and sets the year
     * @param year year of coin.
     */
    public Nickel(int year)
    {
        super(value, commonName, frontMotto, year, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
        Nickel.manufactureYear = year;
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
