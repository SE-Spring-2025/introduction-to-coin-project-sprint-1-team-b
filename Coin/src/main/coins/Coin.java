package main.coins;

/**
 * Abstract base class for all coin types.
 * Provides shared fields and methods for coin metadata.
 * 
 * @author GroupB
 * @version 1.0
 */
public abstract class Coin {
    private double value;
    private String commonName;
    private String frontMotto;
    private int manufactureYear;
    private String frontImage;
    private String backImage;
    private String backMotto;
    private String frontLabel;
    private String backLabel;
    private String valueDescription;
    private boolean ridgedEdge;
    private String metallurgy;
    private Metallurgy smelter;


    public Coin(double value, String commonName, String frontMotto,
        int manufactureYear, String frontImage, String backImage,
        String backMotto, String frontLabel, String backLabel,
        String valueDescription, boolean ridgedEdge, Metallurgy smelter) {
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
        this.smelter = smelter;
        this.smelt();
    }

    @Override
    public String toString() {
        this.smelt();
        String s = String.format(
            "[%s,%.2f,%d,'%s','%s','%s','%s','%s','%s','%s',",
            commonName, value, manufactureYear, frontMotto, backMotto,
            frontImage, backImage, frontLabel, backLabel, valueDescription
        );
        s += ridgedEdge
            ? String.format("ridges,'%s']", metallurgy)
            : String.format("no ridges,'%s']", metallurgy);
        return s;
    }

    public void smelt() {
        this.metallurgy = smelter.smelt();
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
