package Tests;

import com.aventstack.extentreports.model.Report;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import UtilityMethods.ScreenshotListener; // Ensure this import matches your package structure


@Listeners(ScreenshotListener.class) // Attach the listener to capture screenshots on failure
public class RaiseATicketTest extends BaseTest {

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
        raiseaticketpage = new RaiseATicketPage(driver);

        ScreenshotListener.driver = driver;
    }

    @Test
    public void personal() throws InterruptedException {
// personal


//        payciohomepage.clickWelcomeBackButton();
//        Thread.sleep(1000);
//        ScrollToEnd();
//       raiseaticketpage.scrollToAndClickRaiseTicket();

        // raiseaticketpage.clickOnPlusIcon();
//        // plus button add button locator
//        Thread.sleep(3000);
        raiseaticketpage.clickSelectIssueCategory();
        Thread.sleep(500);
        raiseaticketpage.clickDepositIssueIcon();
        Thread.sleep(500);
        raiseaticketpage.clickConfirmButton();
        Thread.sleep(500);
        raiseaticketpage.enterQueryText();
        Thread.sleep(500);
        raiseaticketpage.clickUploadImageOfIssue();
        Thread.sleep(1000);
        raiseaticketpage.clickChooseFromGallery();
        Thread.sleep(500);
        raiseaticketpage.clickFirstImageThumbnail();
        Thread.sleep(500);
        raiseaticketpage.clickSubmitButton();
        Thread.sleep(500);
        raiseaticketpage.captureImageViewScreenshot();

        Merchant();
        liquidity();
    }


    public void Merchant() throws InterruptedException {
        raiseaticketpage.clickOnMerchant();
        //plus icon
        Thread.sleep(4000);
        raiseaticketpage.clickSelectMerchant();
        raiseaticketpage.clickImageViewUnderGgh();
        raiseaticketpage.clickConfirmButton();
        raiseaticketpage.clickSelectIssueCategory();
        raiseaticketpage.clickDepositIssueIcon();
        Thread.sleep(500);
        raiseaticketpage.clickConfirmButton();
        Thread.sleep(500);
        raiseaticketpage.enterQueryText();
        Thread.sleep(500);
        raiseaticketpage.clickUploadImageOfIssue();
        Thread.sleep(1000);
        raiseaticketpage.clickChooseFromGallery();
        Thread.sleep(500);
        raiseaticketpage.clickFirstImageThumbnail();
        Thread.sleep(500);
        raiseaticketpage.clickSubmitButton();
        Thread.sleep(500);
        raiseaticketpage.captureImageViewScreenshot();
    }


    public void liquidity() throws InterruptedException {

        Thread.sleep(4000);
        //plus icon
        raiseaticketpage.clickOnLiquidity();
        raiseaticketpage.clickOnSelectLiquidity();
        raiseaticketpage.clickTrxImageView();
        raiseaticketpage.clickConfirmButton();
        raiseaticketpage.clickSelectIssueCategory();
        raiseaticketpage.clickDepositIssueIcon();
        Thread.sleep(500);
        raiseaticketpage.clickConfirmButton();
        Thread.sleep(500);
        raiseaticketpage.enterQueryText();
        Thread.sleep(500);
        raiseaticketpage.clickUploadImageOfIssue();
        Thread.sleep(1000);
        raiseaticketpage.clickChooseFromGallery();
        Thread.sleep(500);
        raiseaticketpage.clickFirstImageThumbnail();
        Thread.sleep(500);
        raiseaticketpage.clickSubmitButton();
        Thread.sleep(500);
        raiseaticketpage.captureImageViewScreenshot();

    }


}