package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl ="https://opensource-demo.orangehrmlive.com/";
   @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){

        // find the email field element and type email
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");

        // find the password field element and type the password
        driver.findElement(By.name("password")).sendKeys("admin123");

        //Find the Login btn Element and click
        WebElement loginBtn = driver.findElement(By.xpath("//button[starts-with(@class,'oxd')]"));
        loginBtn.click();
        String expectedMessage = "Dashboard";
        WebElement actualTestElement = driver.findElement(By.xpath(" //h6[contains(@class ,'header')]"));
        String actualMessage = actualTestElement.getText();
        Assert.assertEquals(expectedMessage,actualMessage);


       // String expectedMessage = "Dashboard";
        driver.quit();



    }
}
