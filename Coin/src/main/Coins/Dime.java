package main.Coins;

/**
 * Represents a Dime coin.
 * 
 * @author GroupB
 * @version 1.0
 */
public class Dime extends Coin {
    private static final double VALUE = 0.1;
    private static final String COMMON_NAME = "Dime";
    private static final String FRONT_MOTTO = "IN GOD WE TRUST";
    private static final int DEFAULT_YEAR = 1776;
    private static int manufactureYear;
    private static final String FRONT_IMAGE = "F_Roosevelt";
    private static final String BACK_IMAGE = "Torch_Branches";
    private static final String BACK_MOTTO = "E PLURIBUS UNUM";
    private static final String FRONT_LABEL = "LIBERTY";
    private static final String BACK_LABEL = "UNITED STATES OF AMERICA";
    private static final String VALUE_DESCRIPTION = "ONE DIME";
    private static final boolean RIDGED_EDGE = true;
    private static final Metallurgy METALLURGY = new CuproNickel();

    /**
     * Constructor for the Dime class.
     */
    public Dime() {
        super(VALUE, COMMON_NAME, FRONT_MOTTO, DEFAULT_YEAR,
            FRONT_IMAGE, BACK_IMAGE, BACK_MOTTO, FRONT_LABEL,
            BACK_LABEL, VALUE_DESCRIPTION, RIDGED_EDGE, METALLURGY);
    }

    /**
     * Constructor for the Dime class with a specified year.
     * 
     * @param year year of the coin
     */
    public Dime(int year) {
        super(VALUE, COMMON_NAME, FRONT_MOTTO, year,
            FRONT_IMAGE, BACK_IMAGE, BACK_MOTTO, FRONT_LABEL,
            BACK_LABEL, VALUE_DESCRIPTION, RIDGED_EDGE, METALLURGY);
        Dime.manufactureYear = year;
    }

    /**
     * Gets the value of the Dime.
     * 
     * @return coin value
     */
    public double getValue() {
        return VALUE;
    }

    /**
     * Gets the common name of the Dime.
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
     * Gets the year the coin was manufactured.
     * 
     * @return manufacture year
     */
    public int getYear() {
        return manufactureYear;
    }

    /**
     * Gets the front image.
     * 
     * @return front image
     */
    public String getFrontImage() {
        return FRONT_IMAGE;
    }

    /**
     * Gets the back image.
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
     * Gets the value description.
     * 
     * @return value description
     */
    public String getValueDescription() {
        return VALUE_DESCRIPTION;
    }

    /**
     * Returns true if the Dime has a ridged edge.
     * 
     * @return true if ridged
     */
    public Boolean getRidgedEdge() {
        return RIDGED_EDGE;
    }

    /**
     * Gets the metallurgy of the Dime.
     * 
     * @return metallurgy
     */
    public String getMetallurgy() {
        return METALLURGY.smelt();
    }
}
