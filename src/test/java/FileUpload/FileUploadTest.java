package FileUpload;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import Base.BaseTests;

public class FileUploadTest extends BaseTests {
    @Test
    public void testFileUpload(){
        var file = homepage.clickonUpload();
        file.clickOnChooseFile("C:\\WebDriver\\bin\\chromedriver.exe");
        assertEquals(file.getFileName(), "chromedriver.exe", "Unexpected File Name");
    }

}
