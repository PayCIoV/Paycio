package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.time.Duration;

public class SettingsPage {


    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public SettingsPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }

    public void scrollAndClickOnAddCryptoAddress() {
        try {
            // Scroll to the element with content-desc "Add Crypto Address"
            WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().description(\"Add Crypto Address\"))"));

            // Click the element once it's visible
            element.click();
            Reporter.log("✅ Clicked on 'Add Crypto Address' button successfully", true);
        } catch (Exception e) {
            Reporter.log("❌ Failed to click on 'Add Crypto Address': " + e.getMessage(), true);
            e.printStackTrace();
        }
    }

    public void scrollAndClickOnP2PTradeHistory() {
        try {
            // Scroll to the element using textMatches
            WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"P2P Trade History\"))"));

            // Click the element once it's visible
            element.click();
            Reporter.log("✅ Clicked on 'P2P Trade History' successfully", true);
        } catch (Exception e) {
            Reporter.log("❌ Failed to click 'P2P Trade History': " + e.getMessage(), true);
            e.printStackTrace();
        }
    }


    public void scrollAndClickOnJoinTheCommunity() {
        try {
            // Scroll to the element using textMatches
            WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Join the community\"))"));

            // Click the element once it's visible
            element.click();
            Reporter.log("✅ Clicked on 'Join the community' successfully", true);
        } catch (Exception e) {
            Reporter.log("❌ Failed to click 'Join the community': " + e.getMessage(), true);
            e.printStackTrace();
        }
    }


    public void scrollAndClickOnReferral() {
        try {
            WebElement referralElement = driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Referral\"))"));

            referralElement.click();
            Reporter.log("✅ Clicked on 'Referral' successfully", true);
        } catch (Exception e) {
            Reporter.log("❌ Failed to click 'Referral': " + e.getMessage(), true);
            e.printStackTrace();
        }
    }


    public void clickAddNewCryptoAddress() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Find the "Add New Crypto Address" button using the content description
            WebElement addNewCryptoAddressButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.view.ViewGroup[@content-desc='Add New Crypto Address']")
            ));

            // Click the "Add New Crypto Address" button
            addNewCryptoAddressButton.click();
            Reporter.log("✅ Clicked on 'Add New Crypto Address' successfully", true);

        } catch (Exception e) {
            Reporter.log("❌ Failed to click 'Add New Crypto Address': " + e.getMessage(), true);
            e.printStackTrace();
        }
    }

    public void enterAddress() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Find the EditText field where the address needs to be entered
            WebElement addressField = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.widget.EditText[@text='Enter address']")
            ));

            // Clear the field (optional) and enter the address
            addressField.clear();
            addressField.sendKeys("0x6EEc5c5786BE10145646D1550C51aa24Cf3CB80");

            Reporter.log("✅ Address entered successfully: ", true);

        } catch (Exception e) {
            Reporter.log("❌ Failed to enter address: " + e.getMessage(), true);
            e.printStackTrace();
        }
    }

    public void enterExchangeName() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Find the EditText field for entering the exchange name
            WebElement exchangeNameField = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.widget.EditText[@text='Enter exchange name']")
            ));

            // Clear the field (optional) and enter the exchange name
            exchangeNameField.clear();
            exchangeNameField.sendKeys("Currency exchange ");

            Reporter.log("✅ Exchange name entered successfully: ", true);

        } catch (Exception e) {
            Reporter.log("❌ Failed to enter exchange name: " + e.getMessage(), true);
            e.printStackTrace();
        }
    }

    public void clickOnDefaultCheckbox() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Find the ViewGroup with the content description that includes the checkbox
            WebElement defaultCheckbox = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.view.ViewGroup[@content-desc='Would you like to make this address as default']")
            ));

            // Click on the ViewGroup which may represent the checkbox
            defaultCheckbox.click();

            Reporter.log("✅ Clicked on the 'Make this address as default' checkbox", true);

        } catch (Exception e) {
            Reporter.log("❌ Failed to click on the checkbox: " + e.getMessage(), true);
            e.printStackTrace();
        }
    }

    public void clickOnAddAddressButton() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement addAddressButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.view.ViewGroup[@content-desc='Add Address']")
            ));

            addAddressButton.click();
            Reporter.log("✅ Clicked on 'Add Address' button", true);

        } catch (Exception e) {
            Reporter.log("❌ Failed to click on 'Add Address' button: " + e.getMessage(), true);
            e.printStackTrace();
        }
    }


}