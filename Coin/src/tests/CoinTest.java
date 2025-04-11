package tests;

/**
 * Unit tests for all coin subclasses to verify correctness of data and behavior.
 * Tests constructors, getter methods, and the toString method.
 * 
 * @author GroupB
 * @version 1.0
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

import main.coins.*;

public class CoinTest {
    private Coin testCoin = new MockCoin();
	private int currYear = 2025;

    /**
     * Tests that the constructors for various coins do not throw exceptions.
     */
    @Test
    public void testConstructors() {
	// Basically just make sure they don't blow up
	// parameterless constructor
	try {
	    Coin c = new MockCoin();
	}
	catch (Exception e) {
	    fail("Coin() constructor caused exception: "+e.getMessage());
	}

	// value arg constructor
	try {
	    Coin c = new Nickel();
	}
	catch (Exception e) {
	    fail("Coin() constructor caused exception: "+e.getMessage());
	}

	// value and year args constructor
	try {
	    Coin c = new Dime(2020);
	}
	catch (Exception e) {
	    fail("Coin() constructor caused exception: "+e.getMessage());
	}

	// make it here then didn't fail!
	assertTrue(true);
    }

    /**
     * Tests all getter methods for each coin subclass to verify expected values.
     */
    @Test
    public void testGetters() {
	if (! testPenny()) fail("penny getters failed");
	if (! testNickel()) fail("nickel getters failed");
	if (! testDime()) fail("dime getters failed");
	if (! testQuarter()) fail("quarter getters failed");
	if (! testHalfDollar()) fail("half dollar getters failed");
	if (! testDollar()) fail("dollar getters failed");
	
	// make it here then didn't fail!
	assertTrue(true);
    }

    /**
     * Tests the toString method of a coin to ensure formatting is correct.
     */
    @Test
    public void testToString() {
	Coin c = new HalfDollar(1999);
	String expectedOutput =
	    "[HalfDollar,0.50,1999,'IN GOD WE TRUST','E PLURIBUS UNUM'"
	    + ",'J_Kennedy','Presidential_Seal','LIBERTY'"
	    + ",'UNITED STATES OF AMERICA','HALF DOLLAR',ridges"
	    + ",'Cupro-Nickel']";
	assertEquals(expectedOutput, c.toString());
    }

    //---------------------------------------------------------
    // private helper methods
    //---------------------------------------------------------
    
    /**
     * Compares two doubles for near-equality.
     * 
     * @param a first double
     * @param b second double
     * @return true if nearly equal, false otherwise
     */
    private boolean cmpDoubles(double a, double b) {
	return Math.abs(a-b) < 0.00001;
    }
    
    /**
     * Verifies the getter values of the Penny class.
     * 
     * @return true if all values match expected, false otherwise
     */
    private boolean testPenny() {
	Coin c = new Penny(currYear);
	
	if (! "Penny".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), .01)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "A_Lincoln".equals(c.getFrontImage())) return false;
	if (! "Lincoln_Memorial".equals(c.getBackImage())) return false;
	if (! "ONE CENT".equals(c.getValueDescription())) return false;
	if (Boolean.TRUE.equals(c.getRidgedEdge())) return false;
	if (! "Copper".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	    
	// make it here then didn't fail!
	return true;
    }
    
    /**
     * Verifies the getter values of the Nickel class.
     * 
     * @return true if all values match expected, false otherwise
     */
    private boolean testNickel() {
	Coin c = new Nickel(currYear);
	
	if (! "Nickel".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), .05)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "T_Jefferson".equals(c.getFrontImage())) return false;
	if (! "Jefferson_Memorial".equals(c.getBackImage())) return false;
	if (! "FIVE CENTS".equals(c.getValueDescription())) return false;
	if (Boolean.TRUE.equals(c.getRidgedEdge())) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    
    /**
     * Verifies the getter values of the Dime class.
     * 
     * @return true if all values match expected, false otherwise
     */
    private boolean testDime() {
	Coin c = new Dime(currYear);
	
	if (! "Dime".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), .1)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "F_Roosevelt".equals(c.getFrontImage())) return false;
	if (! "Torch_Branches".equals(c.getBackImage())) return false;
	if (! "ONE DIME".equals(c.getValueDescription())) return false;
	if (Boolean.FALSE.equals(c.getRidgedEdge())) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    
    /**
     * Verifies the getter values of the Quarter class.
     * 
     * @return true if all values match expected, false otherwise
     */
    private boolean testQuarter() {
	Coin c = new Quarter(currYear);
	
	if (! "Quarter".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), .25)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "G_Washington".equals(c.getFrontImage())) return false;
	if (! "Eagle".equals(c.getBackImage())) return false;
	if (! "QUARTER DOLLAR".equals(c.getValueDescription())) return false;
	if (Boolean.FALSE.equals(c.getRidgedEdge())) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    
    /**
     * Verifies the getter values of the HalfDollar class.
     * 
     * @return true if all values match expected, false otherwise
     */
    private boolean testHalfDollar() {
	Coin c = new HalfDollar(currYear);
	
	if (! "HalfDollar".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), .5)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "J_Kennedy".equals(c.getFrontImage())) return false;
	if (! "Presidential_Seal".equals(c.getBackImage())) return false;
	if (! "HALF DOLLAR".equals(c.getValueDescription())) return false;
	if (Boolean.FALSE.equals(c.getRidgedEdge())) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    
    /**
     * Verifies the getter values of the Dollar class.
     * 
     * @return true if all values match expected, false otherwise
     */
    private boolean testDollar() {
	Coin c = new Dollar(currYear);
	
	if (! "Dollar".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), 1.00)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "S_Anthony".equals(c.getFrontImage())) return false;
	if (! "Moon_Eagle".equals(c.getBackImage())) return false;
	if (! "ONE DOLLAR".equals(c.getValueDescription())) return false;
	if (Boolean.FALSE.equals(c.getRidgedEdge())) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
	
    /**
     * Tests the getter methods of the MockCoin specifically.
     */
	@Test
	public void testCoinGetters() {
		assertEquals(24, testCoin.getValue());
		assertEquals("Mock", testCoin.getCommonName()); 
		assertEquals("frontMotto", testCoin.getFrontMotto());
		assertEquals(1788, testCoin.getYear()); 
		assertEquals("frontImage", testCoin.getFrontImage()); 
		assertEquals("backImage", testCoin.getBackImage());
		assertEquals("backMotto", testCoin.getBackMotto());
		assertEquals("frontLabel", testCoin.getFrontLabel());
		assertEquals("backLabel", testCoin.getBackLabel());
		assertEquals("twenty-four cents", testCoin.getValueDescription());
		assertEquals(false, testCoin.getRidgedEdge());
		assertEquals("Cupro-Nickel", testCoin.getMetallurgy());
	}

	/**
	 * Test the concrete Metallurgy implementations of the interface. (The interface does not
     * need a test because it has no executable code.)
	 */
	public void testSmelt() {
	Metallurgy copper = new Copper();
	Metallurgy cuproNickel = new CuproNickel();

	Coin copperCoin = new MockCoin();
	copperCoin.smelt();
	assertEquals("Copper", copperCoin.getMetallurgy());

	Coin cuproNickelCoin = new MockCoin();
	cuproNickelCoin.smelt();
	assertEquals("Cupro-Nickel", cuproNickelCoin.getMetallurgy());
	}
}
