public class Coin
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

    public Coin()
    {
        this.value = 0.0;
    }

    public Coin(double value)
    {
        this.value = value;
    }

    public Coin(double value, int year)
    {
        this.value = value;
    }

    public String toString()
    {
        return ":)";
    }

}