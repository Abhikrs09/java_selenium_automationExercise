package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class homepage_page {

	public WebDriver driver;
	
	public By viewCart = By.xpath("//u[contains(text(),'View Cart')]");
	public By proceed_to_check = By.xpath("//a[contains(text(),'Proceed To Checkout')]");
	public By login_signup = By.xpath("//u[contains(text(),'Register / Login')]");
	public By cart_button = By.xpath("//a[contains(text(),'Cart')]");
	public By delete_acc_btn = By.xpath("//a[contains(text(),'Delete Account')]");
	public By view_product_btn = By.xpath("//a[@href='/product_details/2']");
	public By add_product_btn= By.xpath("//button[@class='btn btn-default cart']");
	public By homepage_assertion = By.xpath("//h2[contains(text(),'Full-Fledged practice website for Automation Engineers')]");
	public By cartpage_assertion = By.xpath("//li[contains(text(),'Shopping Cart')]");

	
	 public homepage_page(WebDriver driver) {
	        this.driver = driver;
	    }
	 
	 public String cartpage_assert() {
			WebElement cartpagepagetext = driver.findElement(cartpage_assertion);
			String expected_cart_page_text=cartpagepagetext.getText();
			 return expected_cart_page_text;
			 
		 }
	 
	 public String homepage_assert() {
		WebElement homepagetext = driver.findElement(homepage_assertion);
		String expectedtext=homepagetext.getText();
		 return expectedtext;
		 
	 }
	 
	 public void click_add_product_btn() {
		 WebElement add_product_btnElement = driver.findElement(add_product_btn);
		 add_product_btnElement.click();
	 }
	 
	 
	 public void click_view_product_btn()
	 {
		WebElement view_product_btnElement = driver.findElement(view_product_btn);
		view_product_btnElement.click();
	 }
	
	 public void click_viewCart() {
	        WebElement click_viewCartElement = driver.findElement(viewCart);
	        click_viewCartElement.click();
	        
	    }

	    public void click_proceed_to_check() {
	        WebElement proceed_to_checkElement = driver.findElement(proceed_to_check);
	        proceed_to_checkElement.click();
	    }
	    
	    public void click_login_signup() {
	        WebElement login_signupElement = driver.findElement(login_signup);
	        login_signupElement.click();
	        
	    }
	    
	    public void click_cart_button() {
	        WebElement click_viewCartElement = driver.findElement(cart_button);
	        click_viewCartElement.click();
	        
	    }
	    
	    
	    public void click_delete_acc_btn() {
	        WebElement delete_acc_btnElement = driver.findElement(delete_acc_btn);
	        delete_acc_btnElement.click();
	        
	    }
	    
}
