package pages;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class PayCioHomePage extends BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public PayCioHomePage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//android.widget.TextView[contains(@text, 'Welcome')]")
    private WebElement welcomeBackText;

    @FindBy(xpath = "//android.widget.TextView[@text='Wallet']")
    private WebElement walletButton;


    @Test
    public void clickWelcomeBackButton() {
        try {

            wait.until(ExpectedConditions.elementToBeClickable(welcomeBackText));

            welcomeBackText.click();

            Reporter.log("Clicked the 'Welcome Back' button.", true);

        } catch (Exception e) {

            System.out.println("Failed to click 'Welcome Back' button: " + e.getMessage());
            e.printStackTrace();  // Capture detailed error info
            throw e;  // Rethrow the exception for test failure
        }



    }

    public void clickWalletButton() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(walletButton)); // Wait until it's clickable
            walletButton.click(); // Click the button
            Reporter.log("Clicked the 'Wallet' button.", true);
        } catch (Exception e) {
            System.out.println("Failed to click 'Wallet' button: " + e.getMessage());
            e.printStackTrace(); // Capture detailed error info
            throw e; // Rethrow the exception for test failure
        }
    }

    public void clickViewAllButton() {
        try {
            By viewAllLocator = By.xpath("//android.widget.TextView[@text='View All']");
            wait.until(ExpectedConditions.elementToBeClickable(viewAllLocator)); // Wait until it's clickable
            driver.findElement(viewAllLocator).click(); // Click the element
            Reporter.log("Clicked the 'View All' button.", true);
        } catch (Exception e) {
            System.out.println("Failed to click 'View All' button: " + e.getMessage());
            e.printStackTrace(); // Capture detailed error info
            throw e; // Rethrow the exception for test failure
        }
    }
    public void clickHistoryButton() {
        try {
            By historyLocator = By.xpath("//android.widget.TextView[@text='History']");
            wait.until(ExpectedConditions.elementToBeClickable(historyLocator)); // Wait until it's clickable
            driver.findElement(historyLocator).click(); // Click the element
            Reporter.log("Clicked the 'History' button.", true);
        } catch (Exception e) {
            System.out.println("Failed to click 'History' button: " + e.getMessage());
            e.printStackTrace(); // Capture detailed error info
            throw e; // Rethrow the exception for test failure
        }
    }

    public void clickSvgIcon() {
        try {
            // XPath targeting the clickable ViewGroup (index=6) that wraps the SVG icon
            By svgIconLocator = By.xpath("(//android.view.ViewGroup[@clickable='true'])[6]");

            wait.until(ExpectedConditions.elementToBeClickable(svgIconLocator)); // Wait until it's clickable
            driver.findElement(svgIconLocator).click(); // Click the element

            Reporter.log("Clicked on the SVG icon successfully.", true);
        } catch (Exception e) {
            System.out.println("Failed to click the SVG icon: " + e.getMessage());
            e.printStackTrace(); // Detailed error
            throw e; // Rethrow to fail the test
        }
    }
    public void clickSmallIconByBounds() {
        try {
            By iconLocator = By.xpath("//android.view.ViewGroup[@bounds='[51,202][81,232]']");
            wait.until(ExpectedConditions.presenceOfElementLocated(iconLocator));
            WebElement icon = driver.findElement(iconLocator);
            // Use tap as it's not clickable directly
            TouchAction<?> action = new TouchAction<>((PerformsTouchActions) driver);
            action.tap(ElementOption.element(icon)).perform();

            Reporter.log("Tapped on the small icon successfully.", true);
        } catch (Exception e) {
            System.out.println("Failed to tap the small icon: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }


}
