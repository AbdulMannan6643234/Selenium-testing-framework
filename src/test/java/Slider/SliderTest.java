package Slider;

import org.openqa.selenium.Keys;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import Base.BaseTests;

public class SliderTest extends BaseTests {
    @Test
    public void testSlider(){
        var slider = homepage.clickHorizontalSlider();
        while(true){
            if(!slider.response().equals("4")){
            slider.inputKey("A"+Keys.ARROW_RIGHT);
            }else{
                assertEquals(slider.response(), "4","Unexpected Response");
                break;
            }
        }}

}
