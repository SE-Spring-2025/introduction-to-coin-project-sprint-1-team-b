import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DollarTest {
 @Test
 public void testConstructors(){
    //Test no arg Constructor
    try {
        Dollar d = new Dollar();
    }
    catch(Exception e) {
        fail("Dollar() constructor caused exception: "+e.getMessage());
    }
    //test arg constructor
    try {
        Dollar d = new Dollar(2000);
    } catch(Exception e) {
        fail("Dollar() constructor caused exception: "+e.getMessage());
    }

    //no fail
    assertTrue(true);
 } 
}
