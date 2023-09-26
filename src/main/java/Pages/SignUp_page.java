package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SignUp_page {

	
public WebDriver driver;
	
	public By gender_radio = By.xpath("//input[@id='id_gender1']");
	public By password_textbox = By.xpath("//input[@id='password']");
	public By fname_textbox = By.xpath("//input[@id='first_name']");
	
	public By lname_textbox= By.xpath("//input[@id='last_name']");
	public By adress_textbox = By.xpath("//input[@id='address1']");
	public By state_textbox = By.xpath("//input[@id='state']");
	public By city_textbox= By.xpath("//input[@id='city']");
	public By zip_textbox = By.xpath("//input[@id='zipcode']");
	public By mobile_textbox = By.xpath("//input[@id='mobile_number']");
	public By create_acc_btn = By.xpath("//button[contains(text(),'Create Account')]");
	public By verify_account_created = By.xpath("//b[contains(text(),'Account Created!')]");
	
	public By verify_username = By.xpath("//b[contains(text(),'Abhi')]");
	public By order_placed_assertion = By.xpath("//b[contains(text(),'Order Placed!')]");
	
	
    
    public SignUp_page(WebDriver driver) {
        this.driver = driver;
    }
    
    public String order_placed_assertionassert() {
		WebElement order_placed_assertion_text = driver.findElement(order_placed_assertion);
		String order_placed_assertion_text_string=order_placed_assertion_text.getText();
		 return order_placed_assertion_text_string;
		 
	 }
    
    public String account_created_assert() {
		WebElement account_created_text = driver.findElement(verify_account_created);
		String account_created_text_string=account_created_text.getText();
		 return account_created_text_string;
		 
	 }
    
    public  String verify_username_assert() {
		WebElement verify_username_text = driver.findElement(verify_username);
		String verify_username_text_string=verify_username_text.getText();
		 return verify_username_text_string;
		 
	 }
    
    
    
    public void click_genderbtn() {
    	 WebElement gender_radioElement = driver.findElement(gender_radio);
    	 gender_radioElement.click();
    }
    
    public void enter_password(String pass) {
    	WebElement password_textboxElement = driver.findElement(password_textbox);
    	password_textboxElement.sendKeys(pass);
    }
    
    public void enter_firstname(String fname) {
    	WebElement fname_textboxElement = driver.findElement(fname_textbox);
    	fname_textboxElement.sendKeys(fname);
    }
    public void enter_lastname(String lname) {
    	WebElement lname_textboxElement = driver.findElement(lname_textbox);
    	lname_textboxElement.sendKeys(lname);
    }
    public void enter_adress(String add) {
    	WebElement adress_textboxElement = driver.findElement(adress_textbox);
    	adress_textboxElement.sendKeys(add);
    }
    public void enter_state(String state) {
    	WebElement state_textboxElement = driver.findElement(state_textbox);
    	state_textboxElement.sendKeys(state);
    }
    public void enter_zip(String zip) {
    	WebElement zip_textboxElement = driver.findElement(zip_textbox);
    	zip_textboxElement.sendKeys(zip);
    }
    
    public void enter_mobile(String mobile) {
    	WebElement mobile_textboxElement = driver.findElement(mobile_textbox);
    	mobile_textboxElement.sendKeys(mobile);
    }
    public void enter_city(String city) {
    	WebElement city_textboxElement = driver.findElement(city_textbox);
    	city_textboxElement.sendKeys(city);
    }
    
    public void click_create_account() {
    	WebElement create_acc_btnElement = driver.findElement(create_acc_btn);
    	create_acc_btnElement.click();
    }
    
}
