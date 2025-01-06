package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {
    @Test
    public void testSearch() {
        HomePage homePage = new HomePage(driver);
        homePage.search("Selenium");
        Assert.assertTrue(driver.getTitle().contains("Search"));
    }
}