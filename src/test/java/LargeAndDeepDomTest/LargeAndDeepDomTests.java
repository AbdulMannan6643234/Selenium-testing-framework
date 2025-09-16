package LargeAndDeepDomTest;
import org.testng.annotations.Test;

import Base.BaseTests;
public class LargeAndDeepDomTests extends BaseTests{
    @Test
    public void scrollIntoView(){
        var scroll = homepage.clickLargeAndDeepDom();
        scroll.scrollToTable();
    }
    @Test
    public void testInfiniteScroll(){
        var scroll = homepage.clickinfiniteScroll();
        scroll.scrollToElement(5);
    }
}
