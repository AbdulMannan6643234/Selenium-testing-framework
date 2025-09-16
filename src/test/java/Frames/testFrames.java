package Frames;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import Base.BaseTests;

public class testFrames extends BaseTests {
    @Test
    public void testFrame(){
        var frame = homepage.clickOniFrames();
        frame.clearTextArea();
        frame.SetTextArea("Hello");
        frame.decreaseIndentation();
        frame.SetTextArea("World");
        assertEquals(frame.getTextFromEditor(), "Hello World", "Unexpected Response");
    }

}
