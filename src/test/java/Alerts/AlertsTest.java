package Alerts;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import Base.BaseTests;

public class AlertsTest extends BaseTests {
    @Test
    public void testAlerts(){
        var alert = homepage.clickOnAlerts();
        alert.clickonAlertButton();
        alert.alert_clickToAccept();
        assertEquals(alert.getResponse(), "You successfully clicked an alert", "Response does not match");
    }
        @Test
        public void testGetTextFromAlert(){
        var alert = homepage.clickOnAlerts();
        alert.clickonConfirmButton();
        String text = alert.alert_getText();
        if(text.equals("I am a JS Confirm")){
            alert.alert_clickToDismiss();
            assertEquals(alert.getResponse(), "You clicked: Cancel", "Unexpected respones");
        }
        else{
            alert.alert_clickToAccept();
            assertEquals(alert.getResponse(), "You clicked: Ok", "Unexpected respones");

        }
    }
        @Test
        public void testInputTextInAlert(){
            var alert = homepage.clickOnAlerts();
            alert.clickonPromptButton();
            alert.alert_inputText("I am Winchester");
            alert.alert_clickToAccept();
            assertEquals(alert.getResponse(), "You entered: I am Winchester", "Unexpected Response");
        }
    
}
