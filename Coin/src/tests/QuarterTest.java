import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuarterTest {
 @Test
 public void testConstructors(){
    //Test no arg Constructor
    try {
        Quarter d = new Quarter();
    }
    catch(Exception e) {
        fail("Quarter() constructor caused exception: "+e.getMessage());
    }
    //test arg constructor
    try {
        Quarter d = new Quarter(2000);
    } catch(Exception e) {
        fail("Quarter() constructor caused exception: "+e.getMessage());
    }

    //no fail
    assertTrue(true);
 } 
}
