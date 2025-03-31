import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PennyTest {
 @Test
 public void testConstructors(){
    //Test no arg Constructor
    try {
        Penny d = new Penny();
    }
    catch(Exception e) {
        fail("Penny() constructor caused exception: "+e.getMessage());
    }
    //test arg constructor
    try {
        Penny d = new Penny(2000);
    } catch(Exception e) {
        fail("Penny() constructor caused exception: "+e.getMessage());
    }

    //no fail
    assertTrue(true);
 } 
}
