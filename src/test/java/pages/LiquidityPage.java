package pages;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import io.appium.java_client.*;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.LinkedHashSet;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class LiquidityPage extends BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public LiquidityPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }


    public void scrollAndClickOnLiquidity() {
        // Scroll to the element with text "Create Merchant"
        WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Liquidity\"))"));

        // Now that the element is visible, perform a click on it
        element.click();
        Reporter.log("clicked  on Liquidity Button ", true);
    }

    public void clickOnTRXCurrency() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until the TRX currency element is visible and clickable using partial match
        WebElement trxElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[contains(@content-desc, 'TRX')]")
        ));

        trxElement.click();
        Reporter.log("Clicked on TRX currency successfully", true);
    }

//    public void clickOnTronNetworkTRX() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//        // Use XPath with partial match to handle dynamic content
//        WebElement trxElement = wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//android.view.ViewGroup[contains(@content-desc, 'Tron Network (TRX)')]")
//        ));
//
//        trxElement.click();
//
//        Reporter.log("Clicked on Tron Network (TRX) element successfully", true);
//    }

    public void clickOnTronNetworkTRX() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement trxElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[contains(@content-desc, 'Tron Network (TRX)')]")
        ));

        trxElement.click();
        Reporter.log("Clicked on Tron Network (TRX) element successfully", true);
    }

    public void clickOnLiteCoin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait for the "Lite Coin" text element to be visible
        WebElement liteCoinElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.widget.TextView[@text='Lite Coin']")
        ));

        // Click on the element
        liteCoinElement.click();

        // Log to TestNG report
        Reporter.log("Clicked on Lite Coin successfully", true);
    }


    public void clickOnLTCNetwork() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until the LTC element is visible and clickable using partial static content
        WebElement ltcElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[contains(@content-desc, 'LTC Network (LTC)')]")
        ));

        ltcElement.click();
        Reporter.log("Clicked on LTC Network successfully", true);
    }


    public void clickOnUSDTItem() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait for the USDT item using partial static content
        WebElement usdtElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[contains(@content-desc, 'USDT, USDT, Tron Network')]")
        ));

        // Click on the element
        usdtElement.click();

        // Log the action
        Reporter.log("Clicked on USDT item successfully", true);
    }


    public void clickOnTronUSDT() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Locate element using only the static part of content-desc
        WebElement tronElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[contains(@content-desc, 'Tron Network (USDT)')]")
        ));

        tronElement.click();
        Reporter.log("Clicked on Tron Network (USDT) successfully", true);
    }

    public void clickOnUSDT_Ethereum() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Locate the element using only the static part of the content-desc
        WebElement usdtEthElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[contains(@content-desc, 'USDT, USDT, Ethereum Network')]")
        ));

        // Perform the click action
        usdtEthElement.click();

        // Log it for the report
        Reporter.log("Clicked on USDT - Ethereum Network successfully", true);
    }


    public void clickOnEthereumCardStatic() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Using partial content-desc to avoid dynamic value issues
        WebElement ethElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[contains(@content-desc, 'Ethereum, ETH, Ethereum Network')]")
        ));

        ethElement.click();
        Reporter.log("Clicked on Ethereum (ETH) card using static content-desc", true);
    }


    public void clickOnTransferButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until the Transfer element is visible
        WebElement transferElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.view.ViewGroup[@content-desc='Transfer']")
        ));

        // Click on the element
        transferElement.click();

        // Log for test report
        Reporter.log("Clicked on Transfer button successfully", true);
    }

    public void enterAmount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait for the EditText to be visible and enabled
        WebElement amountInput = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.widget.EditText[@text='Minimum 10 USD']")
        ));

        // Clear any placeholder text and input the new amount
        amountInput.clear();
        amountInput.sendKeys("50");

        // Log the action
        Reporter.log("Entered amount: ", true);
    }

    public void clickOnBottomTransferButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until the bottom "Transfer" button is clickable
        WebElement bottomTransferButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc=' Transfer' and @bounds='[48,1043][672,1139]']")
        ));

        // Click the bottom "Transfer" button
        bottomTransferButton.click();

        // Log success
        Reporter.log("Clicked on the bottom 'Transfer' button successfully", true);
    }

    public boolean isSpecificElementDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")
            ));

            boolean isVisible = element.isDisplayed();
            Reporter.log("Element visibility status: " + isVisible, true);
            return isVisible;
        } catch (Exception e) {
            Reporter.log("Element not found or not displayed", true);
            return false;
        }
    }

    public void clickOnSwapPairsButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until the Swap pairs button is clickable
        WebElement swapPairs = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc='Swap pairs']")
        ));

        // Click the element
        swapPairs.click();

        // Log the result
        Reporter.log("Clicked on 'Swap pairs' button successfully", true);
    }

    public void tapThreeDotsForTrxUsdt() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // XPath for the three dots ViewGroup
            By threeDotsLocator = By.xpath(
                    "//android.view.ViewGroup[@clickable='true' and @enabled='true' and @focusable='true' and @bounds='[594,323][660,389]']"
            );

            // Wait for the element to be clickable
            WebElement threeDots = wait.until(ExpectedConditions.elementToBeClickable(threeDotsLocator));

            // Tap on the element
            threeDots.click();
            Reporter.log("✅ Successfully tapped the three dots for TRX ↔ USDT", true);

        } catch (Exception e) {
            Reporter.log("❌ Failed to tap the three dots: " + e.getMessage(), true);
            e.printStackTrace();
        }

    }

    public void clickOnEditButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until the 'Edit' button is clickable using content-desc
        WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc='Edit']")
        ));

        // Perform the click action
        editButton.click();

        // Log the action
        Reporter.log("Clicked on the Edit button successfully", true);
    }

    public void enterAmountinEditSwapFrom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until the EditText is visible
        WebElement amountField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.widget.EditText[@hint='Enter Amount']")
        ));

        // Clear the existing value and enter 0.1
        amountField.clear();
        amountField.sendKeys("25000");

        // Log the action
        Reporter.log("Entered amount 0.1 in the amount field successfully", true);
    }

    public void enterAmountinEditSwapTo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until the EditText is visible
        WebElement amountField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.widget.EditText[@hint='Enter Amount']")
        ));

        // Clear the existing value and enter 0.1
        amountField.clear();
        amountField.sendKeys("5005");

        // Log the action
        Reporter.log("Entered amount 0.1 in the amount field successfully", true);
    }

    public void clickOnEditSwapPair() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until the "Edit swap pair" element is clickable
        WebElement editSwapPairButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc='Edit swap pair']")
        ));

        // Click on the element
        editSwapPairButton.click();

        // Log the action
        Reporter.log("Clicked on 'Edit swap pair' successfully", true);
    }

    public void checkIfElementIsDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate the element using the given full XPath
            WebElement targetElement = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")
            ));

            // Check if the element is displayed
            if (targetElement.isDisplayed()) {
                Reporter.log("The target element is displayed.", true);
            } else {
                Reporter.log("The target element is NOT displayed.", true);
            }

        } catch (Exception e) {
            Reporter.log("The target element was not found or is not displayed: " + e.getMessage(), true);
        }
    }


    public void clickOnCancelButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Locate the cancel button element (assuming it's a PathView)
        WebElement cancelButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//com.horcrux.svg.PathView")
        ));

        // Click on the cancel button
        cancelButton.click();

        // Log the action
        Reporter.log("Clicked on cancel button successfully", true);
    }


    public void swipeAndTapSwapOrderHistory() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Reference element to swipe on (e.g., page container or list)
            WebElement swipeBaseElement = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//android.widget.ScrollView") // Replace with actual scrollable container if different
            ));

            // Perform swipe to reveal the target
            swipeAction(swipeBaseElement, "up");

            // Wait for the target button to be clickable
            WebElement swapOrderHistoryButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.view.ViewGroup[@content-desc='Swap order history']")
            ));

            // Tap the button
            swapOrderHistoryButton.click();
            Reporter.log("✅ Clicked on 'Swap order history' successfully", true);

        } catch (Exception e) {
            Reporter.log("❌ Failed to click 'Swap order history': " + e.getMessage(), true);
            e.printStackTrace();
        }
    }


    public void swipeAndClickSwapOrderHistory() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Swipe to the right to bring the element into view
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.80); // Start near the right edge
        int endX = (int) (size.width * 0.20); // End near the left edge
        int startY = size.height / 2; // Swipe vertically centered
        int endY = size.height / 2;

        // Perform the swipe action
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.press(PointOption.point(startX, startY))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();

        // Wait for the "Swap order history" element to be clickable after swipe
        WebElement swapOrderHistoryButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc='Swap order history']")
        ));

        // Click on the element
        swapOrderHistoryButton.click();

        // Log the action
        Reporter.log("Clicked on 'Swap order history' after swipe", true);
    }


    public void clickOnSelectSwapPair() {
        // Wait for the element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Locate the element by content description
        WebElement swapPairButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc='Select swap pair']")
        ));

        // Perform the click action
        swapPairButton.click();
    }


    public void clickOnImageViewUSDTCheckBox() {
        // Wait for the ImageView element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Locate the ImageView inside the ViewGroup with the given content-desc
        WebElement imageView = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc='USDT, Ethereum Network, TRX, Tron Network']/android.view.ViewGroup/android.widget.ImageView")
        ));

        // Perform the click action
        imageView.click();
    }

    public void clickOnUSDT_TRX() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait for the element with content-desc 'USDT - TRX' to be clickable
        WebElement usdtTrxElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc=' USDT - TRX']")
        ));

        // Perform the click
        usdtTrxElement.click();

        // Log the action
        Reporter.log("Clicked on 'USDT - TRX' successfully", true);
    }

    public void clickOnLTCImageViewLTCCheckBox() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until the ImageView element is clickable
        WebElement ltcImageView = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc='LTC, LTC Network, TRX, Tron Network']/android.view.ViewGroup/android.widget.ImageView")
        ));

        // Click on the ImageView
        ltcImageView.click();

        // Log the action
        Reporter.log("Clicked on LTC ImageView successfully", true);
    }

    public void clickOnConfirmButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until the TextView with text "Confirm" is clickable
        WebElement confirmButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.widget.TextView[@text='Confirm']")
        ));

        // Click on the "Confirm" button
        confirmButton.click();

        // Log the action
        Reporter.log("Clicked on 'Confirm' button successfully", true);
    }
    public void clickPathView() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement pathViewElement = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//com.horcrux.svg.PathView")
            ));
            pathViewElement.click();
            Reporter.log("✅ Clicked on PathView element successfully", true);
        } catch (Exception e) {
            Reporter.log("❌ Failed to click PathView element: " + e.getMessage(), true);
            e.printStackTrace();
        }
    }

    public void clickOnLTCTRXPair() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait for the clickable LTC - TRX swap pair element using its content-desc
        WebElement ltcTrxElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc=' LTC - TRX']")
        ));

        // Click the element
        ltcTrxElement.click();

        // Log the action
        Reporter.log("Clicked on LTC - TRX swap pair successfully", true);
    }


    public void swipeLeft() {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.8);
        int endX = (int) (size.width * 0.2);
        int y = (int) (size.height * 0.5);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, y));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), endX, y));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        ((RemoteWebDriver) driver).perform(Collections.singletonList(swipe));
    }

    public void swipeAndTapTransactions() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            boolean isFound = false;
            int maxSwipes = 5;

            while (!isFound && maxSwipes-- > 0) {
                try {
                    WebElement transactionsButton = driver.findElement(
                            By.xpath("//android.view.ViewGroup[@content-desc='Transactions']")
                    );
                    if (transactionsButton.isDisplayed()) {
                        transactionsButton.click();
                        Reporter.log("✅ Clicked on 'Transactions' successfully", true);
                        isFound = true;
                    }
                } catch (NoSuchElementException | ElementClickInterceptedException e) {
                    swipeLeft(); // Swipe left to bring the button into view
                    Thread.sleep(1000); // Give UI time to update
                }
            }

            if (!isFound) {
                Reporter.log("❌ 'Transactions' button not found after swiping.", true);
            }

        } catch (Exception e) {
            Reporter.log("❌ Failed to click 'Transactions': " + e.getMessage(), true);
            e.printStackTrace();
        }
    }


    public void clickOnFilterButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the Filter button is clickable and then click it
        WebElement filterButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc='Filter']"))
        );

        filterButton.click();
        Reporter.log("Clicked on the 'Filter' button", true);
    }

    public void clickOnAllTimeFilter() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement allTimeElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc='All time']/android.view.ViewGroup"))
        );

        allTimeElement.click();
        Reporter.log("Clicked on the 'All time' dropdown", true);
    }

    public void clickOnApplyButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement applyButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc='Apply']"))
        );

        applyButton.click();
        Reporter.log("Clicked on the 'Apply' button", true);
    }


    public void clickOnTransactionType() {
        Reporter.log("<b>Attempting to click on 'Transaction type'</b>", true);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement transactionTypeElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.widget.TextView[@text='Transaction type']")
        ));

        transactionTypeElement.click();
        Reporter.log("<b>Clicked on 'Transaction type' successfully</b>", true);
    }


    public void clickOnDepositIcon() {
        Reporter.log("<b>Trying to click on the 'Deposit' icon</b>", true);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement depositIcon = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc='Deposit']/android.view.ViewGroup/android.widget.ImageView")
        ));

        depositIcon.click();
        Reporter.log("<b>Clicked on the 'Deposit' icon successfully</b>", true);
    }

    public void clickOnWithdrawIcon() {
        Reporter.log("<b>Trying to click on the 'Withdraw' icon</b>", true);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement withdrawIcon = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc='Withdraw']/android.view.ViewGroup/android.widget.ImageView")
        ));

        withdrawIcon.click();
        Reporter.log("<b>Clicked on the 'Withdraw' icon successfully</b>", true);
    }


    public void clickOnApplyButtonInFilterScreen() {
        Reporter.log("<b>Trying to click on the 'Apply' button</b>", true);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement applyButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.widget.TextView[@text='Apply']")
        ));

        applyButton.click();
        Reporter.log("<b>Clicked on the 'Apply' button successfully</b>", true);
    }

    public void clickOnPaymentStatus() {
        Reporter.log("<b>Trying to click on 'Payment status'</b>", true);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement paymentStatus = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.widget.TextView[@text='Payment status']")
        ));

        paymentStatus.click();
        Reporter.log("<b>Clicked on 'Payment status' successfully</b>", true);
    }

    public void clickSuccessfulStatus() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Reporter.log("<b>Clicking on 'Successful' status</b>", true);

        WebElement successfulStatus = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc='Successfull']/android.view.ViewGroup/android.widget.ImageView")
        ));
        successfulStatus.click();

        Reporter.log("<b>'Successful' status clicked</b>", true);
    }

    public void clickProcessingStatus() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Reporter.log("<b>Clicking on 'Processing' status</b>", true);

        WebElement processingStatus = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc='Processing']/android.view.ViewGroup/android.widget.ImageView")
        ));
        processingStatus.click();

        Reporter.log("<b>'Processing' status clicked</b>", true);
    }

    public void clickCancelledStatus() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Reporter.log("<b>Clicking on 'Cancelled' status</b>", true);

        WebElement cancelledStatus = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.ViewGroup[@content-desc='Cancelled']/android.view.ViewGroup/android.widget.ImageView")
        ));
        cancelledStatus.click();

        Reporter.log("<b>'Cancelled' status clicked</b>", true);
    }

    public void printNoRecordsText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By noRecordsText = By.xpath("//android.widget.TextView[@text='It looks like there are no records yet']");

        try {
            WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(noRecordsText));
            String actualText = message.getText();
            Reporter.log("<b>📝 Message Displayed:</b> " + actualText, true);
        } catch (TimeoutException e) {
            Reporter.log("<b>⚠️ 'No records yet' text not found on screen.</b>", true);
        }
    }

    public void swipeAndClickChangeEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Swipe right to bring "Change email" into view
            Dimension size = driver.manage().window().getSize();
            int startX = (int) (size.width * 0.1);
            int endX = (int) (size.width * 0.9);
            int y = (int) (size.height * 0.5);

            // Perform swipe from left to right
            new TouchAction<>((PerformsTouchActions) driver)
                    .press(PointOption.point(startX, y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .moveTo(PointOption.point(endX, y))
                    .release()
                    .perform();

            // Now click on the "Change email" element
            By changeEmailButton = By.xpath("//android.view.ViewGroup[@content-desc='Change email']");
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(changeEmailButton));
            button.click();

            Reporter.log("<b>✅ Clicked on 'Change email' after swiping right</b>", true);
        } catch (Exception e) {
            Reporter.log("<b>❌ Failed to swipe and click on 'Change email':</b> " + e.getMessage(), true);
        }
    }


    public void enterNewEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Locate the EditText element for "Enter your new email address"
            By emailField = By.xpath("//android.widget.EditText[@text='Enter your new email address']");
            WebElement emailInput = wait.until(ExpectedConditions.elementToBeClickable(emailField));

            // Clear any pre-existing text and enter the new email
            emailInput.sendKeys("vktesting123@gmail.com");

            Reporter.log("<b>✅ New email entered: vktesting123@gmail.com</b>", true);
        } catch (Exception e) {
            Reporter.log("<b>❌ Failed to enter email:</b> " + e.getMessage(), true);
        }
    }

    public void reEnterNewEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Locate the EditText element for "Re-enter new email address"
            By reEmailField = By.xpath("//android.widget.EditText[@text='Re enter new email address']");
            WebElement reEmailInput = wait.until(ExpectedConditions.elementToBeClickable(reEmailField));

            // Clear any pre-existing text and re-enter the new email

            reEmailInput.sendKeys("vktesting123@gmail.com");

            Reporter.log("<b>✅ Re-entered new email: vktesting123@gmail.com</b>", true);
        } catch (Exception e) {
            Reporter.log("<b>❌ Failed to re-enter email:</b> " + e.getMessage(), true);
        }
    }

    public void clickSaveButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Locate the Save button by content description
            By saveButton = By.xpath("//android.view.ViewGroup[@content-desc='Save']");
            WebElement saveButtonElement = wait.until(ExpectedConditions.elementToBeClickable(saveButton));

            // Click the Save button
            saveButtonElement.click();

            Reporter.log("<b>✅ Save button clicked</b>", true);
        } catch (Exception e) {
            Reporter.log("<b>❌ Failed to click Save button:</b> " + e.getMessage(), true);
        }
    }


}
