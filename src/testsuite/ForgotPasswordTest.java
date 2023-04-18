package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl ="https://opensource-demo.orangehrmlive.com/";


    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        driver.findElement(By.xpath("//div[@class ='orangehrm-login-forgot'] ")).click();
        String expectedMessage = "Forgot your Password";
       
    }
}
