package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ConfirmationPage;

public class ForgotpasswordTests extends BaseTests {
    @Test
    public void testSuccessfulEmail(){
        var forgotpasswordPage=homePage.clickPassword();
        forgotpasswordPage.setEmail("cv@gmail.com");
        ConfirmationPage confirmationPage=forgotpasswordPage.clickLoginButton();
    }

}
