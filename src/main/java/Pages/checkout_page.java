package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.ReadingPropertiesFile;

public class checkout_page {

	public WebDriver driver;
	
	public By verify_acc_created = By.xpath("//p[contains(text(),'Congratulations! Your new account has been success')]");
	public By continue_btn = By.xpath("//a[contains(text(),'Continue')]");

	public By message_textarea = By.xpath("//textarea[@name='message']");
	public By place_order_btn = By.xpath("//a[contains(text(),'Place Order')]");
	
	public By cardname_textbox = By.xpath("//input[@data-qa='name-on-card']");
	public By cardnumber_textbox = By.xpath("//input[@data-qa='card-number']");
	public By cvc_textbox = By.xpath("//input[@name='cvc']");
	public By exp_month_textbox = By.xpath("//input[@name='expiry_month']");
	public By exp_year_textbox = By.xpath("//input[@name='expiry_year']");
	
	public By pay_btn = By.xpath("//button[@id='submit']");
	public By orderPlaced_text =By.xpath("//b[contains(text(),'Order Placed!')]");
	
	
	
	public checkout_page(WebDriver driver) {
        this.driver = driver;
    }
	
	public String cardname=ReadingPropertiesFile.getProperty("cardname");
    public String cardnumber=ReadingPropertiesFile.getProperty("cardnumber");
    public String cvc=ReadingPropertiesFile.getProperty("cvc");
    public String month=ReadingPropertiesFile.getProperty("month");
    public String year=ReadingPropertiesFile.getProperty("year");
   
	
    
    
	public void click_continue_btn() {
        WebElement continue_btnElement = driver.findElement(continue_btn);
        continue_btnElement.click();
    }
    
    public void click_place_order_btn() {
        WebElement place_order_btnElement = driver.findElement(place_order_btn);
        place_order_btnElement.click();
        
    }
    
    public void enter_message_textarea(String message) {
        WebElement message_textareaElement = driver.findElement(message_textarea);
        message_textareaElement.sendKeys(message);
    }
    
    public void enter_cardname_textbox(String cardname) {
        WebElement cardname_textboxElement = driver.findElement(cardname_textbox);
        cardname_textboxElement.sendKeys(cardname);
    }
    
    public void enter_cardnumber_textbox(String cardnumber) {
        WebElement cardnumber_textboxElement = driver.findElement(cardnumber_textbox);
        cardnumber_textboxElement.sendKeys(cardnumber);
    }
    
    public void enter_cvc_textbox(String cvc) {
        WebElement cvc_textboxElement = driver.findElement(cvc_textbox);
        cvc_textboxElement.sendKeys(cvc); 
    }
    
    public void enter_exp_month_textbox(String month) {
        WebElement exp_month_textboxElement = driver.findElement(exp_month_textbox);
        exp_month_textboxElement.sendKeys(month);
        
    }
    public void enter_exp_year_textbox(String year) {
        WebElement exp_year_textboxElement = driver.findElement(exp_year_textbox);
        exp_year_textboxElement.sendKeys(year);
        
    }
    public void click_pay_btn() {
        WebElement pay_btnElement = driver.findElement(pay_btn);
        pay_btnElement.click();
        
    }
    
    
    
}
