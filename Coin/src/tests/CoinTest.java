// import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertTrue;
// import static org.junit.jupiter.api.Assertions.fail;
// import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CoinTest {
    private Coin testCoin = new MockCoin();

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
}
    