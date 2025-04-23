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
    private static final Metallurgy METALLURGY = new CuproNickel();

    /**
     * Constructor for objects of class Nickel.
     */
    public Nickel() {
        super(VALUE, COMMON_NAME, METALLURGY);
    }

    /**
     * Constructor for the Nickel class that sets the year.
     * 
     * @param year year of coin
     */
    public Nickel(int year) {
        super(VALUE, COMMON_NAME, METALLURGY);
        Nickel.manufactureYear = year;
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
