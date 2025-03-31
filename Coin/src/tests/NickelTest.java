import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NickelTest {
 @Test
 public void testConstructors(){
    //Test no arg Constructor
    try {
        Nickel d = new Nickel();
    }
    catch(Exception e) {
        fail("Nickel() constructor caused exception: "+e.getMessage());
    }
    //test arg constructor
    try {
        Nickel d = new Nickel(2000);
    } catch(Exception e) {
        fail("Nickel() constructor caused exception: "+e.getMessage());
    }

    //no fail
    assertTrue(true);
 } 
}
