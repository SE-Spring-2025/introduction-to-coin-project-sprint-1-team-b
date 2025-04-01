package Coins;
public abstract class Coin
{
    double value;
    String commonName;
    String frontMotto;
    int manufactureYear;
    String frontImage;
    String backImage;
    String backMotto;
    String frontLabel;
    String backLabel;
    String valueDescription;
    boolean ridgedEdge;
    String metallurgy;

    public Coin(double value, String commonName, String frontMotto,
        int manufactureYear, String frontImage, String backImage, String backMotto,
        String frontLabel, String backLabel, String valueDescription, 
        boolean ridgedEdge, String metallurgy)
    {
        this.value = value;
        this.commonName = commonName;
        this.frontMotto = frontMotto;
        this.manufactureYear = manufactureYear;
        this.frontImage = frontImage;
        this.backImage = backImage;
        this.backMotto = backMotto;
        this.frontLabel = frontLabel;
        this.backLabel = backLabel;
        this.valueDescription = valueDescription;
        this.ridgedEdge = ridgedEdge;
        this.metallurgy = metallurgy;
    }

    public String toString()
    {
        String s = String.format("[%s,%.2f,%d,'%s','%s','%s','%s','%s','%s','%s',", 
            commonName, value, manufactureYear, frontMotto,  backMotto, frontImage, backImage, frontLabel, backLabel, valueDescription);
        if (ridgedEdge == true)
        {
            s += String.format("ridges,'%s']", metallurgy);
        }
        else
        {
            s += String.format("no ridges,'%s']", metallurgy);
        }

        return s;
    }

    public abstract double getValue();

    public abstract String getCommonName();

    public abstract String getFrontMotto();

    public abstract String getBackMotto();

    public abstract int getYear();

    public abstract String getFrontImage();

    public abstract String getBackImage();

    public abstract String getFrontLabel();

    public abstract String getBackLabel();

    public abstract String getValueDescription();

    public abstract Boolean getRidgedEdge();

    public abstract String getMetallurgy();
}
