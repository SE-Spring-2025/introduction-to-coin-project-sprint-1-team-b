import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HalfDollarTest {
 @Test
 public void testConstructors(){
    //Test no arg Constructor
    try {
        HalfDollar d = new HalfDollar();
    }
    catch(Exception e) {
        fail("HalfDollar() constructor caused exception: "+e.getMessage());
    }
    //test arg constructor
    try {
        HalfDollar d = new HalfDollar(2000);
    } catch(Exception e) {
        fail("HalfDollar() constructor caused exception: "+e.getMessage());
    }

    //no fail
    assertTrue(true);
 } 
}
