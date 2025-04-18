package Tests;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import UtilityMethods.ScreenshotListener; // Ensure this import matches your package structure


@Listeners(ScreenshotListener.class) // Attach the listener to capture screenshots on failure
public class LiquidityDepositTest extends BaseTest {

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
    }

    @Test
    public void LiquidityScenarioDeposit() throws InterruptedException {

//        payciohomepage.clickWelcomeBackButton();
//        Thread.sleep(7000);
//        liquiditypage.scrollAndClickOnLiquidity();
        Thread.sleep(1000);
        liquiditypage.clickOnTRXCurrency();
        liquiditypage.clickOnTronNetworkTRX();


        liquiditypage.clickOnLiteCoin();
        liquiditypage.clickOnLTCNetwork();

        // liquiditypage.clickOnTronNetworkTRX();

        liquiditypage.clickOnUSDTItem();
        Thread.sleep(1000);
        liquiditypage.clickOnTronUSDT();
        Thread.sleep(1000);
        liquiditypage.clickOnUSDT_Ethereum();
        Thread.sleep(5000);
        Reporter.log("<b>Deposit tab completed</b>", true);


        // Call the transfer flow
        LiquidityTransferFlow();
        LiquiditySwapPairs();
        swapOrderHistory();
        Transactions();
        changeEmail();
    }

    public void LiquidityTransferFlow() throws InterruptedException {

        Thread.sleep(1000);
        Reporter.log("<b>Transfer tab started</b>", true);

        liquiditypage.clickOnTransferButton();
        Thread.sleep(1000);
        liquiditypage.enterAmount();
        Thread.sleep(1000);
        liquiditypage.clickOnBottomTransferButton();
        Thread.sleep(1000);
        liquiditypage.isSpecificElementDisplayed();
        liquiditypage.clickOnCancelButton();

        Reporter.log("<b> Transfer tab completed</b>", true);
    }

    public void LiquiditySwapPairs() throws InterruptedException {

        Reporter.log("<b>Liquidity Swap Pairs flow started</b>", true);


        liquiditypage.clickOnSwapPairsButton();
        Thread.sleep(1000);
        liquiditypage.tapThreeDotsForTrxUsdt();
        Thread.sleep(1000);
        liquiditypage.clickOnEditButton();
//        liquiditypage.enterAmountinEditSwapFrom();
//        liquiditypage.enterAmountinEditSwapTo();
        liquiditypage.clickOnEditSwapPair();
        Thread.sleep(1000);
        liquiditypage.checkIfElementIsDisplayed();
        Thread.sleep(1000);
        liquiditypage.clickOnCancelButton();

        Reporter.log("<b>Liquidity Swap Pairs flow completed</b>", true);

    }

    public void swapOrderHistory() throws InterruptedException {


        Reporter.log("<b>Liquidity Swap order history started </b>", true);
        Thread.sleep(500);


        liquiditypage.swipeAndTapSwapOrderHistory();
        Thread.sleep(2000);
        liquiditypage.clickOnSelectSwapPair();
        Thread.sleep(500);

        liquiditypage.clickOnLTCImageViewLTCCheckBox();
        Thread.sleep(500);
        liquiditypage.clickOnConfirmButton();
        Thread.sleep(500);
        liquiditypage.clickOnLTCTRXPair();
        Thread.sleep(500);
        liquiditypage.clickOnImageViewUSDTCheckBox();
        Thread.sleep(500);
        liquiditypage.clickOnConfirmButton();
        Thread.sleep(500);
        //  liquiditypage.clickPathView();
//        liquiditypage.clickOnCancelButton();

        Reporter.log("<b>Liquidity Swap order history completed  </b>", true);

    }

    public void Transactions() throws InterruptedException {
        Reporter.log("<b>Liquidity Transactions started   </b>", true);
        Thread.sleep(2000);
        liquiditypage.swipeAndTapTransactions();
        liquiditypage.clickOnFilterButton();
        Thread.sleep(2000);
        liquiditypage.clickOnAllTimeFilter();
        liquiditypage.clickOnApplyButton();
        liquiditypage.clickOnFilterButton();
        liquiditypage.clickOnTransactionType();
        liquiditypage.clickOnDepositIcon();
        liquiditypage.clickOnApplyButtonInFilterScreen();
        liquiditypage.clickOnFilterButton();
        liquiditypage.clickOnWithdrawIcon();
        liquiditypage.clickOnApplyButtonInFilterScreen();
        liquiditypage.clickOnFilterButton();
        liquiditypage.clickOnPaymentStatus();
        liquiditypage.clickSuccessfulStatus();
        liquiditypage.clickOnApplyButtonInFilterScreen();
        liquiditypage.clickProcessingStatus();
        liquiditypage.clickOnApplyButtonInFilterScreen();
        liquiditypage.clickCancelledStatus();
        liquiditypage.clickOnApplyButtonInFilterScreen();
        Reporter.log("<b>Transaction flow completed</b>", true);


    }


    public void changeEmail() {


        Reporter.log("<b>Liquidity Change Email started   </b>", true);

        liquiditypage.enterNewEmail();
        liquiditypage.reEnterNewEmail();
        liquiditypage.clickSaveButton();

        Reporter.log("<b>Liquidity Change Email completed    </b>", true);

    }

}