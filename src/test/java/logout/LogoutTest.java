package logout;

import login.LoginTest;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.LogoutPage;
import pages.SignedInIMDB;


public class LogoutTest extends LoginTest {

    protected LogoutPage logoutPage;

    @Test
    public void testSuccessfulLogout() throws InterruptedException {
        //LoginPage loginPage = homePage.clickSignInPage();
        //loginPage.setSingIn();
        //loginPage.setEmail(email);
        //loginPage.setPassword(password);
        //SignedInIMDB signedInIMDB = loginPage.clickLoginButton();
        //Utils.waitForXMillis(30);
        LogoutPage logoutPage = new LogoutPage(super.getDriver());
        logoutPage.clickProfileButton();
        logoutPage.clickLogoutButton();

        //Utils.scrollDown(getDriver());
        //signedInIMDB.getloginCheck();
        //assertTrue(signedInIMDB.getloginCheck().contains("Browse popular movies"), "You are not logged in!");
    }


}