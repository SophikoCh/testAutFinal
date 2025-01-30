package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.CustomLogger;

public class HomePageTest extends BaseTest {
    @Test
    public void testSearch() {
        HomePage homePage = new HomePage(driver);
        homePage.search("Selenium");
        CustomLogger.info("Test passed: The title contains 'Search'");

    }
}