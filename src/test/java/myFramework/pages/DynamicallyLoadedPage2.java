package myFramework.pages;

import myFramework.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicallyLoadedPage2 {

    public DynamicallyLoadedPage2(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath="//strong[.='Done!']")
    public WebElement doneMsg;

    @FindBy (xpath = "//img")
    public WebElement image;
}
