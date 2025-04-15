package coins;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract base class for all coin types.
 * Provides shared fields and methods for coin metadata.
 * Includes a static CoinCounter to track the count of each coin type.
 * 
 * @author GroupB
 * @version 1.0
 */
public abstract class Coin {
    // Fields
    protected static CoinCounter coinCounter = new CoinCounter();

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

    /**
     * Constructor for the Coin class.
     * 
     * @param value           The monetary value of the coin.
     * @param commonName      The common name of the coin.
     * @param frontMotto      The motto on the front of the coin.
     * @param manufactureYear The year the coin was manufactured.
     * @param frontImage      The image on the front of the coin.
     * @param backImage       The image on the back of the coin.
     * @param backMotto       The motto on the back of the coin.
     * @param frontLabel      The label on the front of the coin.
     * @param backLabel       The label on the back of the coin.
     * @param valueDescription The description of the coin's value.
     * @param ridgedEdge      Whether the coin has a ridged edge.
     * @param smelter         The metallurgy composition of the coin.
     */
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

    /**
     * Public getter for the CoinCounter.
     * Allows external classes to access the CoinCounter instance.
     *
     * @return the CoinCounter instance
     */
    public static CoinCounter getCoinCounter() {
        return coinCounter;
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

    /**
     * Static inner class to track the count of each 
     * coin type and notify observers.
     */
    protected static class CoinCounter {
        private int pennyCount = 0;
        private int nickelCount = 0;
        private int dimeCount = 0;
        private int quarterCount = 0;
        private int totalCoins = 0;

        private List<Observer> observers = new ArrayList<>();

        public void incrementPenny() {
            pennyCount++;
            totalCoins++;
            notifyObservers();
        }

        public void incrementNickel() {
            nickelCount++;
            totalCoins++;
            notifyObservers();
        }

        public void incrementDime() {
            dimeCount++;
            totalCoins++;
            notifyObservers();
        }

        public void incrementQuarter() {
            quarterCount++;
            totalCoins++;
            notifyObservers();
        }

        public int getPennyCount() {
            return pennyCount;
        }

        public int getNickelCount() {
            return nickelCount;
        }

        public int getDimeCount() {
            return dimeCount;
        }

        public int getQuarterCount() {
            return quarterCount;
        }

        public int getTotalCoins() {
            return totalCoins;
        }

        public void addObserver(Observer observer) {
            observers.add(observer);
        }

        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }

        private void notifyObservers() {
            for (Observer observer : observers) {
                observer.update();
            }
        }
    }
}
