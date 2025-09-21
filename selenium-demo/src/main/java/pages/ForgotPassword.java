package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {
    private WebDriver driver;

    private By Email=By.id("e-mail");
    private By loginButton=By.cssSelector("#login button");

    public ForgotPassword(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(Email).sendKeys(email);
    }

    public ConfirmationPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new ConfirmationPage(driver);
    }




}
