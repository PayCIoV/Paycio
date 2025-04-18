package Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import UtilityMethods.ScreenshotListener; // Ensure this import matches your package structure

@Listeners(ScreenshotListener.class) // Attach the listener to capture screenshots on failure
public class SettingsTest extends BaseTest {

    private PayCioLoginPage payciopage;
    private PayCioHomePage payciohomepage;
    private CreateMerchantPage createmerchantpage;

    @BeforeMethod
    public void setUpLoginClass() {
        // Initialize PayCioPage
        payciopage = new PayCioLoginPage(driver);
        payciohomepage = new PayCioHomePage(driver);
        createmerchantpage = new CreateMerchantPage(driver);
        liquiditypage = new LiquidityPage(driver);
        ScreenshotListener.driver = driver;
        settingspage = new SettingsPage(driver);
    }

    @Test
    public void SettingsTestScenario() throws InterruptedException {

        payciohomepage.clickWelcomeBackButton();
        settingspage.scrollAndClickOnAddCryptoAddress();
        settingspage.clickAddNewCryptoAddress();
        settingspage.enterAddress();
        settingspage.enterExchangeName();
        settingspage.clickOnDefaultCheckbox();
        settingspage.clickOnAddAddressButton();


//        settingspage.scrollAndClickOnP2PTradeHistory();
//        settingspage.scrollAndClickOnJoinTheCommunity();
//        settingspage.scrollAndClickOnReferral();


    }
}