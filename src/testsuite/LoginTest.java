package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //enter valid email
        driver.findElement(By.name("username")).sendKeys("Admin");
        //enter valid password
        driver.findElement(By.name("password")).sendKeys("admin123");
        //click on login in button
        driver.findElement(By.xpath("(//button[@type = 'submit'])")).click();
        //verify Dashboard web element is present
        String expectedText = "Dashboard";
        String actualText = driver.findElement(By.xpath("//div[@class = 'oxd-layout']//h6")).getText();
        Assert.assertEquals("Dashboard text is not displayed",expectedText,actualText);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}

