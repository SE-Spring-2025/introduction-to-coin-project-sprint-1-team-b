package coins;

/**
 * Represents a Nickel coin.
 * 
 * @author GroupB
 * @version 1.0
 */
public class Nickel extends Coin {
    private static final double VALUE = 0.05;
    private static final String COMMON_NAME = "Nickel";
    private static final String FRONT_MOTTO = "IN GOD WE TRUST";
    private static final int DEFAULT_YEAR = 1776;
    private static int manufactureYear;
    private static final String FRONT_IMAGE = "T_Jefferson";
    private static final String BACK_IMAGE = "Jefferson_Memorial";
    private static final String BACK_MOTTO = "E PLURIBUS UNUM";
    private static final String FRONT_LABEL = "LIBERTY";
    private static final String BACK_LABEL = "UNITED STATES OF AMERICA";
    private static final String VALUE_DESCRIPTION = "FIVE CENTS";
    private static final boolean RIDGED_EDGE = false;
    private static final String METALLURGY = "Cupro-Nickel";

    /**
     * Constructor for objects of class Nickel.
     */
    public Nickel() {
        super(VALUE, COMMON_NAME, FRONT_MOTTO, DEFAULT_YEAR,
            FRONT_IMAGE, BACK_IMAGE, BACK_MOTTO, FRONT_LABEL,
            BACK_LABEL, VALUE_DESCRIPTION, RIDGED_EDGE, METALLURGY);
    }

    /**
     * Constructor for the Nickel class that sets the year.
     * 
     * @param year year of coin
     */
    public Nickel(int year) {
        super(VALUE, COMMON_NAME, FRONT_MOTTO, year,
            FRONT_IMAGE, BACK_IMAGE, BACK_MOTTO, FRONT_LABEL,
            BACK_LABEL, VALUE_DESCRIPTION, RIDGED_EDGE, METALLURGY);
        Nickel.manufactureYear = year;
    }

    /**
     * Gets the value of the Nickel.
     * 
     * @return coin value
     */
    public double getValue() {
        return VALUE;
    }

    /**
     * Gets the common name of the Nickel.
     * 
     * @return common name
     */
    public String getCommonName() {
        return COMMON_NAME;
    }

    /**
     * Gets the front motto.
     * 
     * @return front motto
     */
    public String getFrontMotto() {
        return FRONT_MOTTO;
    }

    /**
     * Gets the back motto.
     * 
     * @return back motto
     */
    public String getBackMotto() {
        return BACK_MOTTO;
    }

    /**
     * Gets the year of manufacture.
     * 
     * @return year of coin
     */
    public int getYear() {
        return manufactureYear;
    }

    /**
     * Gets the front image label.
     * 
     * @return front image
     */
    public String getFrontImage() {
        return FRONT_IMAGE;
    }

    /**
     * Gets the back image label.
     * 
     * @return back image
     */
    public String getBackImage() {
        return BACK_IMAGE;
    }

    /**
     * Gets the front label.
     * 
     * @return front label
     */
    public String getFrontLabel() {
        return FRONT_LABEL;
    }

    /**
     * Gets the back label.
     * 
     * @return back label
     */
    public String getBackLabel() {
        return BACK_LABEL;
    }

    /**
     * Gets the value description text.
     * 
     * @return value description
     */
    public String getValueDescription() {
        return VALUE_DESCRIPTION;
    }

    /**
     * Returns true if the Nickel has a ridged edge.
     * 
     * @return true if ridged edge
     */
    public Boolean getRidgedEdge() {
        return RIDGED_EDGE;
    }

    /**
     * Gets the metallurgy of the Nickel.
     * 
     * @return metallurgy
     */
    public String getMetallurgy() {
        return METALLURGY;
    }
}
