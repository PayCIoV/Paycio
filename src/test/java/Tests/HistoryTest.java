package Tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import UtilityMethods.ScreenshotListener; // Ensure this import matches your package structure

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Listeners(ScreenshotListener.class) // Attach the listener to capture screenshots on failure
public class HistoryTest extends BaseTest {

    private PayCioLoginPage payciopage;
    private PayCioHomePage payciohomepage;
    private CreateMerchantPage createmerchantpage;
    private OperationsButton operationsbutton;

    @BeforeMethod
    public void setUpLoginClass() {
        // Initialize PayCioPage
        payciopage = new PayCioLoginPage(driver);
        payciohomepage = new PayCioHomePage(driver);
        createmerchantpage = new CreateMerchantPage(driver);
        liquiditypage = new LiquidityPage(driver);
        ScreenshotListener.driver = driver;
        operationsbutton = new OperationsButton(driver);
        settingspage = new SettingsPage(driver);
    }

    @Test
    public void HistoryTestScenario() throws InterruptedException {
        payciohomepage.clickHistoryButton();
        Thread.sleep(3000);

//        payciohomepage.clickSmallIconByBounds();


    }
}