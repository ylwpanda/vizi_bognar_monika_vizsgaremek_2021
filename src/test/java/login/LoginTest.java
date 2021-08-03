package login;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.SignedInIMDB;
import utils.Utils;


public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickSignInPage();
        loginPage.setSingIn();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        SignedInIMDB signedInIMDB = loginPage.clickLoginButton();
        Utils.scrollDown(getDriver());
        signedInIMDB.getloginCheck();
        Assertions.assertTrue(signedInIMDB.getloginCheck().contains("CodeCool"), "You are not logged in!");
    }
}
