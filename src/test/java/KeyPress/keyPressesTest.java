package KeyPress;
import org.openqa.selenium.Keys;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import Base.BaseTests;
public class keyPressesTest extends BaseTests {
    @Test
    public void testKeyPress(){
        var keypress = homepage.clickKeyPresses();
        keypress.typeText("A"+ Keys.BACK_SPACE);
        assertTrue(keypress.getResponse().contains("BACK_SPACE"), "Response Doesnt Match");
        
    }
    @Test
    public void testPi(){
        var keypress = homepage.clickKeyPresses();
        keypress.enterat();
                

    }
}
