package main.coins;

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
     */
    public Quarter() {
        super(VALUE, COMMON_NAME, FRONT_MOTTO, DEFAULT_YEAR,
            FRONT_IMAGE, BACK_IMAGE, BACK_MOTTO, FRONT_LABEL,
            BACK_LABEL, VALUE_DESCRIPTION, RIDGED_EDGE, METALLURGY);
    }

    /**
     * Constructor for the Quarter class. Sets the value of a
     * quarter to 0.25 and sets the year.
     * @param year year of coin
     */
    public Quarter(int year) {
        super(VALUE, COMMON_NAME, FRONT_MOTTO, year,
            FRONT_IMAGE, BACK_IMAGE, BACK_MOTTO, FRONT_LABEL,
            BACK_LABEL, VALUE_DESCRIPTION, RIDGED_EDGE, METALLURGY);
        Quarter.manufactureYear = year;
    }

    /**
     * Gets the monetary value of the Quarter.
     * @return value of the coin
     */
    public double getValue() {
        return VALUE;
    }

    /**
     * Gets the common name of the Quarter.
     * @return common name
     */
    public String getCommonName() {
        return COMMON_NAME;
    }

    /**
     * Gets the front motto of the Quarter.
     * @return front motto
     */
    public String getFrontMotto() {
        return FRONT_MOTTO;
    }

    /**
     * Gets the back motto of the Quarter.
     * @return back motto
     */
    public String getBackMotto() {
        return BACK_MOTTO;
    }

    /**
     * Gets the year of manufacture of the Quarter.
     * @return manufacture year
     */
    public int getYear() {
        return manufactureYear;
    }

    /**
     * Gets the front image of the Quarter.
     * @return front image
     */
    public String getFrontImage() {
        return FRONT_IMAGE;
    }

    /**
     * Gets the back image of the Quarter.
     * @return back image
     */
    public String getBackImage() {
        return BACK_IMAGE;
    }

    /**
     * Gets the front label of the Quarter.
     * @return front label
     */
    public String getFrontLabel() {
        return FRONT_LABEL;
    }

    /**
     * Gets the back label of the Quarter.
     * @return back label
     */
    public String getBackLabel() {
        return BACK_LABEL;
    }

    /**
     * Gets the value description of the Quarter.
     * @return value description
     */
    public String getValueDescription() {
        return VALUE_DESCRIPTION;
    }

    /**
     * Returns true if the Quarter has a ridged edge.
     * @return true if ridged edge
     */
    public Boolean getRidgedEdge() {
        return RIDGED_EDGE;
    }

    /**
     * Gets the metallurgy composition of the Quarter.
     * @return metallurgy
     */
    public String getMetallurgy() {
        return METALLURGY.smelt();
    }
}
