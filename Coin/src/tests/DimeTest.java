import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DimeTest {
 @Test
 public void testConstructors(){
    //Test no arg Constructor
    try {
        Dime d = new Dime();
    }
    catch(Exception e) {
        fail("Dime() constructor caused exception: "+e.getMessage());
    }
    //test arg constructor
    try {
        Dime d = new Dime(2000);
    } catch(Exception e) {
        fail("Dime() constructor caused exception: "+e.getMessage());
    }

    //no fail
    assertTrue(true);
 } 
}
