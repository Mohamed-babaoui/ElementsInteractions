package login;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    @DisplayName("Login Test")
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        //assertEquals(secureAreaPage.getAlertText(), "You logged into a secure area! x", "Alert text is incorrect");
        assertTrue(secureAreaPage.getAlertText()
                        .contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
