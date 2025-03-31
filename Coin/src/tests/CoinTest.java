<<<<<<< HEAD
package tests;

import java.util.Calendar;

=======
// import java.util.Calendar;
>>>>>>> b114d2fd5c6b3a40c13d84c5ea50c4c05666426c
import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertTrue;
// import static org.junit.jupiter.api.Assertions.fail;
// import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Coins.*;

public class CoinTest {
    private Coin testCoin = new MockCoin();

<<<<<<< HEAD
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
    
    private boolean cmpDoubles(double a, double b) {
	return Math.abs(a-b) < 0.00001;
    }
    private boolean testPenny() {
	Coin c = new Penny(Coin.PENNY_VALUE);
	
	if (! "Penny".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), Coin.PENNY_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "A_Lincoln".equals(c.getFrontImage())) return false;
	if (! "Lincoln_Memorial".equals(c.getBackImage())) return false;
	if (! "ONE CENT".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != false) return false;
	if (! "Copper".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	    
	// make it here then didn't fail!
	return true;
    }
    private boolean testNickel() {
	Coin c = new Nickel(Coin.NICKEL_VALUE);
	
	if (! "Nickel".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), Coin.NICKEL_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "T_Jefferson".equals(c.getFrontImage())) return false;
	if (! "Jefferson_Memorial".equals(c.getBackImage())) return false;
	if (! "FIVE CENTS".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != false) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    private boolean testDime() {
	Coin c = new Dime(Coin.DIME_VALUE);
	
	if (! "Dime".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), Coin.DIME_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "F_Roosevelt".equals(c.getFrontImage())) return false;
	if (! "Torch_Branches".equals(c.getBackImage())) return false;
	if (! "ONE DIME".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != true) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    private boolean testQuarter() {
	Coin c = new Quarter(Coin.QUARTER_VALUE);
	
	if (! "Quarter".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), Coin.QUARTER_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "G_Washington".equals(c.getFrontImage())) return false;
	if (! "Eagle".equals(c.getBackImage())) return false;
	if (! "QUARTER DOLLAR".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != true) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    private boolean testHalfDollar() {
	Coin c = new HalfDollar(Coin.HALFDOLLAR_VALUE);
	
	if (! "HalfDollar".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), Coin.HALFDOLLAR_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "J_Kennedy".equals(c.getFrontImage())) return false;
	if (! "Presidential_Seal".equals(c.getBackImage())) return false;
	if (! "HALF DOLLAR".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != true) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    private boolean testDollar() {
	Coin c = new Dollar(Coin.DOLLAR_VALUE);
	
	if (! "Dollar".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), Coin.DOLLAR_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "S_Anthony".equals(c.getFrontImage())) return false;
	if (! "Moon_Eagle".equals(c.getBackImage())) return false;
	if (! "ONE DOLLAR".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != true) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
=======
	@Test
	public void testGetters() {
		assertEquals(24, testCoin.getValue());
		assertEquals("Mock", testCoin.getCommonName()); 
		assertEquals("frontMotto", testCoin.getFrontMotto());
		assertEquals(1788, testCoin.getManufactureYear()); 
		assertEquals("frontImage", testCoin.getFrontImage()); 
		assertEquals("backImage", testCoin.getBackImage());
		assertEquals("backMotto", testCoin.getBackMotto());
		assertEquals("frontLabel", testCoin.getFrontLabel());
		assertEquals("backLabel", testCoin.getBackLabel());
		assertEquals("twenty-four cents", testCoin.getValueDescription());
		assertEquals(false, testCoin.getRidgedEdge());
		assertEquals("metallurgy", testCoin.getMetallurgy());
	}
>>>>>>> b114d2fd5c6b3a40c13d84c5ea50c4c05666426c
}
    