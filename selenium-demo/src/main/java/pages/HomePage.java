package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPassword clickPassword() {
        clickLink("Forgot Password");
        return new ForgotPassword(driver);
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

}
