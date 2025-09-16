package Loading;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import Base.BaseTests;

public class loadingTest extends BaseTests {
    @Test
    public void testLoading(){
        var loading = homepage.clickonLoading();
        loading.clickExampleOne();
        assertEquals(loading.getResponse(), "Hello World!", "Unexpected Response");
    }
    @Test
    public void testExample2(){
         var loading = homepage.clickonLoading();
        loading.clickExampleTwo();
        assertEquals(loading.getResponse(), "Hello World!", "Unexpected Response");
    }

}
