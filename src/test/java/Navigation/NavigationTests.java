package Navigation;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import Base.BaseTests;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigator(){
        homepage.clickonLoading().clickExampleOne();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");

    }
    @Test
    public void testSwitchToTab(){
        homepage.clickMultipleWindows().ClickHere();
        getWindowManager().switchToTab("New Window");
    }
    @Test
    public void testSwitchTab(){
        homepage.clickonLoading().openInNewTab();
        getWindowManager().switchToTab("https://the-internet.herokuapp.com/dynamic_loading/2");
        assertEquals(getWindowManager().getButton(), "Start", "Unexpected Button Name");
    }

}
