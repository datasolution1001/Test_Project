



import static org.junit.Assert.*;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class SignInPageTest {
    private WebDriver driver;

    @Before
    public void setUp() {
    	//setting the driver executable
    
        //Use Edge driver
        driver = new EdgeDriver();
       // wait for the element to appear before the exception occurs
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

   /* @Test
    public void testSignInWithValidCredentials() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInButton();
        //Create object of SignInPage
        SignInPage signInPage = new SignInPage(driver);
        //Check if page is opened

       
        signInPage.signIn("ouerghihajer@isi.utm.tn", "hajer");

     // Check if the login was successful
        assertTrue(driver.getCurrentUrl().equals("https://github.com/"));
    }
    */

   /* @Test
    public void testSignInWithInvalidPassword() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInButton();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.signIn("hajer.ouerghi@fst.utm.tn", "hajer");

        //Check the visibility of error message, when the wrong password is entered
          signInPage.errorMessage();
        assertTrue(signInPage.errorMessageIsVisible());
    }*/

    @Test
    public void testSignInWithInvalidEmail() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInButton();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.signIn("wrongEmail", "hajer");

        //Check the visibility of error message, when the wrong email is entered
         signInPage.errorMessage();
         assertTrue(signInPage.errorMessageIsVisible());
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println ("end of test");
    }
}




