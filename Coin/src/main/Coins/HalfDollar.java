package coins;

/**
 * Represents a HalfDollar coin.
 * 
 * @author GroupB
 * @version 1.0
 */
public class HalfDollar extends Coin {
    private static final double VALUE = 0.5;
    private static final String COMMON_NAME = "HalfDollar";
    private static final String FRONT_MOTTO = "IN GOD WE TRUST";
    private static final int DEFAULT_YEAR = 1776;
    private static int manufactureYear;
    private static final String FRONT_IMAGE = "J_Kennedy";
    private static final String BACK_IMAGE = "Presidential_Seal";
    private static final String BACK_MOTTO = "E PLURIBUS UNUM";
    private static final String FRONT_LABEL = "LIBERTY";
    private static final String BACK_LABEL = "UNITED STATES OF AMERICA";
    private static final String VALUE_DESCRIPTION = "HALF DOLLAR";
    private static final boolean RIDGED_EDGE = true;
    private static final String METALLURGY = "Cupro-Nickel";

    /**
     * Constructor for the HalfDollar class.
     */
    public HalfDollar() {
        super(VALUE, COMMON_NAME, FRONT_MOTTO, DEFAULT_YEAR,
            FRONT_IMAGE, BACK_IMAGE, BACK_MOTTO, FRONT_LABEL,
            BACK_LABEL, VALUE_DESCRIPTION, RIDGED_EDGE, METALLURGY);
    }

    /**
     * Constructor for the HalfDollar class with a specified year.
     * 
     * @param year year of the coin
     */
    public HalfDollar(int year) {
        super(VALUE, COMMON_NAME, FRONT_MOTTO, year,
            FRONT_IMAGE, BACK_IMAGE, BACK_MOTTO, FRONT_LABEL,
            BACK_LABEL, VALUE_DESCRIPTION, RIDGED_EDGE, METALLURGY);
        HalfDollar.manufactureYear = year;
    }

    /**
     * Gets the coin's value.
     * 
     * @return value of the coin
     */
    public double getValue() {
        return VALUE;
    }

    /**
     * Gets the coin's common name.
     * 
     * @return common name
     */
    public String getCommonName() {
        return COMMON_NAME;
    }

    /**
     * Gets the coin's front motto.
     * 
     * @return front motto
     */
    public String getFrontMotto() {
        return FRONT_MOTTO;
    }

    /**
     * Gets the coin's back motto.
     * 
     * @return back motto
     */
    public String getBackMotto() {
        return BACK_MOTTO;
    }

    /**
     * Gets the year the coin was manufactured.
     * 
     * @return year of manufacture
     */
    public int getYear() {
        return manufactureYear;
    }

    /**
     * Gets the coin's front image.
     * 
     * @return front image
     */
    public String getFrontImage() {
        return FRONT_IMAGE;
    }

    /**
     * Gets the coin's back image.
     * 
     * @return back image
     */
    public String getBackImage() {
        return BACK_IMAGE;
    }

    /**
     * Gets the coin's front label.
     * 
     * @return front label
     */
    public String getFrontLabel() {
        return FRONT_LABEL;
    }

    /**
     * Gets the coin's back label.
     * 
     * @return back label
     */
    public String getBackLabel() {
        return BACK_LABEL;
    }

    /**
     * Gets the description of the coin's value.
     * 
     * @return value description
     */
    public String getValueDescription() {
        return VALUE_DESCRIPTION;
    }

    /**
     * Indicates whether the coin has a ridged edge.
     * 
     * @return true if ridged, false otherwise
     */
    public Boolean getRidgedEdge() {
        return RIDGED_EDGE;
    }

    /**
     * Gets the metallurgy of the coin.
     * 
     * @return metallurgy
     */
    public String getMetallurgy() {
        return METALLURGY;
    }
}
