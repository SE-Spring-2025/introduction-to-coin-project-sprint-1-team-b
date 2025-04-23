package coins;

/**
 * Represents a Quarter coin.
 * 
 * @author GroupB
 * @version 1.0
 */
public class Quarter extends Coin {
    private static final double VALUE = 0.25;
    private static final String COMMON_NAME = "Quarter";
    private static final String FRONT_MOTTO = "IN GOD WE TRUST";
    private static final int DEFAULT_YEAR = 1776;
    private static int manufactureYear;
    private static final String FRONT_IMAGE = "G_Washington";
    private static final String BACK_IMAGE = "Eagle";
    private static final String BACK_MOTTO = "E PLURIBUS UNUM";
    private static final String FRONT_LABEL = "LIBERTY";
    private static final String BACK_LABEL = "UNITED STATES OF AMERICA";
    private static final String VALUE_DESCRIPTION = "QUARTER DOLLAR";
    private static final boolean RIDGED_EDGE = true;
    private static final Metallurgy METALLURGY = new CuproNickel();

    /**
     * Constructor for objects of class Quarter. Sets value of quarter to 0.25.
     * Increments the quarter count in the CoinCounter.
     */
    public Quarter() {
        super(VALUE, COMMON_NAME, METALLURGY);
        coinCounter.incrementQuarter();
    }

    /**
     * Constructor for the Quarter class. Sets the value of a
     * quarter to 0.25 and sets the year.
     * Increments the quarter count in the CoinCounter.
     * 
     * @param year year of coin
     */
    public Quarter(int year) {
        super(VALUE, COMMON_NAME, METALLURGY);
        Quarter.manufactureYear = year;
        coinCounter.incrementQuarter();
    }

    /**
     * Manufacture Methods
     */

     protected Coin imprintFront(Coin c) {
        c.frontImage=FRONT_IMAGE;
        return c;
     }

     protected Coin ridgeEdge(Coin c) {
        c.ridgedEdge=RIDGED_EDGE;
        return c;
     }
     
     protected Coin printFront(Coin c) {
        c.frontMotto=FRONT_MOTTO;
        c.frontLabel=FRONT_LABEL;
        if(c.manufactureYear == 0) {
            c.manufactureYear=DEFAULT_YEAR;
        } else c.manufactureYear=DEFAULT_YEAR;
        return c;
     }

     protected Coin printBackImage(Coin c) {
        c.backImage=BACK_IMAGE;
        return c;
     }

     protected Coin printBack(Coin c) {
        c.backLabel=BACK_LABEL;
        c.backMotto=BACK_MOTTO;
        c.valueDescription=VALUE_DESCRIPTION;
        return c;
     }
}
