package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



    
public class SignUp_login_Page {
	
	public WebDriver driver;
	
	public By name_textbox = By.xpath("//input[@name='name']");
	public By email_textbox = By.xpath("//input[@data-qa='signup-email']");
	public By signup_btn = By.xpath("//button[contains(text(),'Signup')]");
    
    public SignUp_login_Page(WebDriver driver) {
        this.driver = driver;
    }
   
    
    public void enterUsername(String name) {
        WebElement usernameElement = driver.findElement(name_textbox);
        usernameElement.clear();
        usernameElement.sendKeys(name);
    }

    public void enterEmail(String email) {
        WebElement passwordElement = driver.findElement(email_textbox);
        passwordElement.clear();
        passwordElement.sendKeys(email);
    }

    public void clicksignUpButton() {
        WebElement signupButtonElement = driver.findElement(signup_btn);
        signupButtonElement.click();
    }
}
