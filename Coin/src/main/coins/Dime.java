package coins;

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
        super(VALUE, COMMON_NAME, METALLURGY);
    }

    /**
     * Constructor for the Dime class with a specified year.
     * 
     * @param year year of the coin
     */
    public Dime(int year) {
        super(VALUE, COMMON_NAME, METALLURGY);
        Dime.manufactureYear = year;
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
