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
        return String.format("Value: %f Value: %s Value: %s Value: %d Value: %s Value: %s Value: %s Value: %s Value: %s Value: %b Value: %s", 
            value, commonName, frontMotto, manufactureYear, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
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
