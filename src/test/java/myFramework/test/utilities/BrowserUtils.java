package myFramework.test.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }

    public static void switchWindowAndVerify(WebDriver driver,String expectedInUrl,String expectedTitle){
        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String eachWindow : allWindowHandles) {
            driver.switchTo().window(eachWindow);
            if(driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle),"Title verification failed!");
    }

}
