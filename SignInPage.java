

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;


public class SignInPage {
    private WebDriver driver;

    

    //Constructor
    public SignInPage(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

   

    public void signIn(String usersEmail, String password) {
       
        driver.findElement(By.id("login_field")).sendKeys(usersEmail);
        driver.findElement(By.id("password")).sendKeys(password);
        clickOnSubmit();
    }
   

    public void clickOnSubmit() {
    	driver.findElement(By.name("commit")).click();
    }
    public void  errorMessage() {
    	
    	WebElement errorMessage = driver.findElement(By.xpath("//div[@class='flash-error']/div"));
        String messageText = errorMessage.getText();
        if (messageText.contains("Incorrect username or password.")) {
            System.out.println("Email or password is incorrect.");
        } else {
            System.out.println("Email or password is correct.");
        }

    }
    public boolean errorMessageIsVisible() {
    	WebElement errorMessage = driver.findElement(By.xpath("//div[@class='flash-error']/div"));
        String messageText = errorMessage.getText();
        return messageText.contains("Incorrect username or password.");
         

    }
    
}

	
	

