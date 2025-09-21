package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
    private WebDriver driver;
    private By statusAlert=By.id("form_submit");

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }


}
