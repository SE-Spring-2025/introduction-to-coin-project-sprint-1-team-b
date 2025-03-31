package Coins;

public class MockCoin extends Coin
{
    static double value = 24;
    static String commonName = "Mock";
    static String frontMotto = "frontMotto";
    static int manufactureYear = 1788;
    static String frontImage = "frontImage";
    static String backImage = "backImage";
    static String backMotto = "backMotto";
    static String frontLabel = "frontLabel";
    static String backLabel = "backLabel";
    static String valueDescription = "twenty-four cents";
    static boolean ridgedEdge = false;
    static String metallurgy = "metallurgy";
    /**
     * Constructor for objects of class Penny. Sets value of penny to 0.01
     */
    public MockCoin() 
    {
        super(value, commonName, frontMotto, 1788, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
    }
    /**
     * Constructor for the Penny class. Sets the value of a
     * penny to 0.01 and sets the year
     * @param year year of coin.
     */
    public MockCoin(int year)
    {
        super(value, commonName, frontMotto, year, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
        MockCoin.manufactureYear = year;
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
