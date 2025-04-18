package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class RaiseATicketPage extends BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public RaiseATicketPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }


    public void scrollToAndClickRaiseTicket() {
        try {
            Reporter.log("Scrolling to 'Raise a ticket' element...", true);

            // Scroll until the element with content-desc = "Raise a ticket" is visible
            WebElement raiseTicketBtn = driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))" +
                            ".scrollIntoView(new UiSelector().description(\"Raise a ticket\"))"
            ));

            Reporter.log("Element found. Clicking 'Raise a ticket'...", true);

            raiseTicketBtn.click();

            Reporter.log("Clicked on 'Raise a ticket' successfully.", true);
        } catch (Exception e) {
            Reporter.log("Failed to scroll and click 'Raise a ticket': " + e.getMessage(), true);
        }


    }



        public void clickOnPlusIcon() {
            try {
                // Define explicit wait
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

                // Wait for the plus icon to be clickable
                WebElement plusIcon = (WebElement) wait.until(
                        ExpectedConditions.elementToBeClickable(By.xpath("//com.horcrux.svg.PathView"))
                );

                // Log the action before clicking
                Reporter.log("Found the 'Plus' icon. Proceeding to click on it.");

                // Click on the plus icon
                plusIcon.click();

                // Log the action after the click
                Reporter.log("Successfully clicked on the 'Plus' icon.");
            } catch (Exception e) {
                // If the element is not found or an error occurs
                Reporter.log("Failed to find or click on the 'Plus' icon. Error: " + e.getMessage());
            }
        }


    public void clickSelectIssueCategory() {
        try {
            Reporter.log("Trying to click on 'Select issue category'...", true);

            // Locate and click using content-desc
            WebElement issueCategoryDropdown = driver.findElement(
                    AppiumBy.accessibilityId("Select issue category")
            );
            issueCategoryDropdown.click();

            Reporter.log("'Select issue category' clicked successfully.", true);
        } catch (Exception e) {
            Reporter.log("Failed to click 'Select issue category': " + e.getMessage(), true);
        }
    }


    public void clickDepositIssueIcon() {
        try {
            Reporter.log("Attempting to click the 'Deposit issue' icon...", true);

            WebElement depositIssueIcon = driver.findElement(By.xpath(
                    "//android.view.ViewGroup[@content-desc='Deposit issue']/android.view.ViewGroup/android.widget.ImageView"
            ));

            depositIssueIcon.click();

            Reporter.log("Clicked on 'Deposit issue' icon successfully.", true);
        } catch (Exception e) {
            Reporter.log("Failed to click 'Deposit issue' icon: " + e.getMessage(), true);
        }


    }


    public void clickConfirmButton() {
        try {
            Reporter.log("Attempting to click the 'Confirm' button...", true);

            WebElement confirmBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm']"));
            confirmBtn.click();

            Reporter.log("Clicked on 'Confirm' button successfully.", true);
        } catch (Exception e) {
            Reporter.log("Failed to click 'Confirm' button: " + e.getMessage(), true);
        }


    }

    public void enterQueryText() {
        try {
            Reporter.log("Attempting to enter text into the query field...", true);

            // Locate the EditText field using its hint text ("Enter your query here...")
            WebElement queryField = driver.findElement(By.xpath("//android.widget.EditText[@hint='Enter your query here...']"));

            // Clear any existing text and enter "none"
            queryField.clear();
            queryField.sendKeys("none");

            Reporter.log("Entered 'none' into the query field successfully.", true);
        } catch (Exception e) {
            Reporter.log("Failed to enter text into the query field: " + e.getMessage(), true);
        }

    }

    public void clickUploadImageOfIssue() {
        try {
            Reporter.log("Attempting to click on 'Upload Image of Issue'...", true);

            // Locate and click using content-desc
            WebElement uploadImageBtn = driver.findElement(AppiumBy.accessibilityId("Upload Image of Issue"));
            uploadImageBtn.click();

            Reporter.log("Clicked on 'Upload Image of Issue' successfully.", true);
        } catch (Exception e) {
            Reporter.log("Failed to click 'Upload Image of Issue': " + e.getMessage(), true);
        }
    }


    public void clickChooseFromGallery() {
        try {
            Reporter.log("Attempting to click on 'Choose from gallery'...", true);

            // Locate and click the 'Choose from gallery' TextView by its text
            WebElement chooseFromGalleryBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='Choose from gallery']"));
            Actions a = new Actions(driver);
            a.moveToElement(chooseFromGalleryBtn).click().perform();
            chooseFromGalleryBtn.click();

            Reporter.log("Clicked on 'Choose from gallery' successfully.", true);
        } catch (Exception e) {
            Reporter.log("Failed to click 'Choose from gallery': " + e.getMessage(), true);
        }
    }

    public void clickFirstImageThumbnail() {
        try {
            Reporter.log("Attempting to click on the first image thumbnail...", true);

            // Locate and click the first ImageView element based on the XPath
            WebElement imageThumbnail = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='com.google.android.providers.media.module:id/icon_thumbnail'])[1]"));
            imageThumbnail.click();

            Reporter.log("Clicked on the first image thumbnail successfully.", true);
        } catch (Exception e) {
            Reporter.log("Failed to click the first image thumbnail: " + e.getMessage(), true);
        }
    }


    public void clickSubmitButton() {
        try {
            Reporter.log("Attempting to click on the 'Submit' button...", true);

            // Locate and click the 'Submit' button by its content description
            WebElement submitBtn = driver.findElement(AppiumBy.accessibilityId("Submit"));
            submitBtn.click();

            Reporter.log("Clicked on 'Submit' button successfully.", true);
        } catch (Exception e) {
            Reporter.log("Failed to click the 'Submit' button: " + e.getMessage(), true);
        }
    }

    public void captureImageViewScreenshot() {
        try {
            Reporter.log("Attempting to capture a screenshot of ImageView...", true);

            // Locate the ImageView element
            WebElement imageView = driver.findElement(AppiumBy.xpath("//android.widget.ImageView"));

            // Capture screenshot of the ImageView element
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Save the screenshot in a specific location
            String screenshotPath = "screenshots/ImageView_screenshot.png";
            Files.copy(screenshot.toPath(), Paths.get(screenshotPath));

            // Attach the screenshot to the report
            Reporter.log("Screenshot of ImageView captured: <a href='" + screenshotPath + "'>Download ImageView Screenshot</a>", true);

            Reporter.log("Screenshot captured successfully.", true);
        } catch (IOException e) {
            Reporter.log("Failed to capture screenshot of ImageView: " + e.getMessage(), true);
        } catch (Exception e) {
            Reporter.log("Error while capturing ImageView screenshot: " + e.getMessage(), true);
        }
    }

    public void clickOnMerchant() {
        try {
            // Define explicit wait
            // wait for up to 10 seconds

            // Wait until the "Merchant" text element is visible
            WebElement merchantElement = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Merchant']"))
            );

            // Log the action in the report
            Reporter.log("Found the 'Merchant' element. Proceeding to click on it.");

            // Click on the "Merchant" element
            merchantElement.click();

            // Log the action after the click
            Reporter.log("Successfully clicked on the 'Merchant' element.");
        } catch (Exception e) {
            // If the element is not found or any error occurs
            Reporter.log("Failed to find or click on the 'Merchant' element. Error: " + e.getMessage());
        }
    }
    public void clickSelectMerchant() {
        try {
            // Define explicit wait for 10 seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Find the "Select merchant" text using the XPath and wait until it's clickable
            WebElement selectMerchantButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.widget.TextView[@text='Select merchant']") // XPath for 'Select merchant' text
            ));

            // Click on the "Select merchant" button
            selectMerchantButton.click();
            Reporter.log("✅ Clicked on 'Select merchant' successfully", true);

        } catch (Exception e) {
            Reporter.log("❌ Failed to click 'Select merchant': " + e.getMessage(), true);
            e.printStackTrace();
        }
    }

    public void clickImageViewUnderGgh() {
        try {
            // Define explicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate the ImageView using XPath
            WebElement imageView = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.view.ViewGroup[@content-desc='Ggh']/android.view.ViewGroup/android.widget.ImageView")
            ));

            // Perform the click
            imageView.click();
            Reporter.log("✅ Clicked on the ImageView under 'Ggh' successfully", true);

        } catch (Exception e) {
            Reporter.log("❌ Failed to click on the ImageView under 'Ggh': " + e.getMessage(), true);
            e.printStackTrace();
        }
    }
    public void clickOnLiquidity() {
        try {
            // Define explicit wait for 10 seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate the Liquidity ViewGroup by content-desc and wait until it's clickable
            WebElement liquidityElement = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.view.ViewGroup[@content-desc='Liquidity']")
            ));

            // Click the Liquidity element
            liquidityElement.click();
            Reporter.log("✅ Clicked on 'Liquidity' successfully", true);

        } catch (Exception e) {
            Reporter.log("❌ Failed to click on 'Liquidity': " + e.getMessage(), true);
            e.printStackTrace();
        }
    }

    public void clickOnSelectLiquidity() {
        try {
            // Define explicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate the "Select liquidity" view using content-desc
            WebElement selectLiquidity = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.view.ViewGroup[@content-desc='Select liquidity']")
            ));

            // Click the element
            selectLiquidity.click();
            Reporter.log("✅ Clicked on 'Select liquidity' successfully", true);

        } catch (Exception e) {
            Reporter.log("❌ Failed to click on 'Select liquidity': " + e.getMessage(), true);
            e.printStackTrace();
        }
    }
    public void clickTrxImageView() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for the TRX imageView to be clickable
            WebElement trxImageView = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.view.ViewGroup[@content-desc='TRX']/android.view.ViewGroup/android.widget.ImageView")
            ));

            // Click the icon
            trxImageView.click();
            Reporter.log("✅ Clicked on TRX ImageView successfully", true);

        } catch (Exception e) {
            Reporter.log("❌ Failed to click TRX ImageView: " + e.getMessage(), true);
            e.printStackTrace();
        }
    }





}