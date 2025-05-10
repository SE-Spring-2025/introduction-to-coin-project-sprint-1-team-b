package main.coins;

/**
 * Represents a mock coin for testing and demonstration purposes.
 * 
 * @author GroupB
 * @version 1.0
 */
public class MockCoin extends Coin {
    private static final double DEFAULT_VALUE = 24;
    private static final String COMMON_NAME = "Mock";
    private static final String FRONT_MOTTO = "frontMotto";
    private static final int DEFAULT_YEAR = 1788;
    private static int manufactureYear = DEFAULT_YEAR;
    private static final String FRONT_IMAGE = "frontImage";
    private static final String BACK_IMAGE = "backImage";
    private static final String BACK_MOTTO = "backMotto";
    private static final String FRONT_LABEL = "frontLabel";
    private static final String BACK_LABEL = "backLabel";
    private static final String VALUE_DESCRIPTION = "twenty-four cents";
    private static final boolean RIDGED_EDGE = false;
    private static final Metallurgy METALLURGY = new CuproNickel();
    private static double value = DEFAULT_VALUE;

    /**
     * No-argument constructor for MockCoin. Sets default values.
     */
    public MockCoin() {
        super(value, COMMON_NAME, FRONT_MOTTO, DEFAULT_YEAR, FRONT_IMAGE,
            BACK_IMAGE, BACK_MOTTO, FRONT_LABEL, BACK_LABEL,
            VALUE_DESCRIPTION, RIDGED_EDGE, METALLURGY);
    }

    /**
     * Constructor for MockCoin with specified year.
     * 
     * @param year the year the coin was manufactured.
     */
    public MockCoin(int year) {
        super(value, COMMON_NAME, FRONT_MOTTO, year, FRONT_IMAGE,
            BACK_IMAGE, BACK_MOTTO, FRONT_LABEL, BACK_LABEL,
            VALUE_DESCRIPTION, RIDGED_EDGE, METALLURGY);
        MockCoin.manufactureYear = year;
    }

    /**
     * Constructor for MockCoin with specified value.
     * 
     * @param value the value of the coin.
     */
    public MockCoin(double value) {
        super(value, COMMON_NAME, FRONT_MOTTO, manufactureYear, FRONT_IMAGE,
            BACK_IMAGE, BACK_MOTTO, FRONT_LABEL, BACK_LABEL,
            VALUE_DESCRIPTION, RIDGED_EDGE, METALLURGY);
        MockCoin.value = value;
    }

    /**
     * Gets the coin's value.
     * 
     * @return coin value
     */
    public double getValue() {
        return value;
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
     * Checks if the coin has a ridged edge.
     * 
     * @return true if ridged, otherwise false
     */
    public Boolean getRidgedEdge() {
        return RIDGED_EDGE;
    }

    /**
     * Gets the coin's metallurgy.
     * 
     * @return metallurgy
     */
    public String getMetallurgy() {
        return METALLURGY.smelt();
    }
}
