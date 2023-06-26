package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }
    @Test

    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        driver.findElement(By.xpath("//div[@class = 'orangehrm-login-forgot']//p")).click();
        String expectedText = "Reset Password";
        String actualText = driver.findElement(By.tagName("h6")).getText();
        Assert.assertEquals("Reset password text is not display",actualText,expectedText);

    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
