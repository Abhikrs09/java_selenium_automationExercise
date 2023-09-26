package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Delete_account_page {

public WebDriver driver;
	
	public By account_delete_text = By.xpath("//b[contains(text(),'Account Deleted!')]");
	public By continue_btn = By.xpath("//a[contains(text(),'Continue')]");
	public By assert_order_delete = By.xpath("//b[contains(text(),'Account Deleted!')]");
	
	
	public Delete_account_page(WebDriver driver) {
        this.driver = driver;
    }
	
	public void click_continue_btn() {
        WebElement continue_btnElement = driver.findElement(continue_btn);
        continue_btnElement.click();
        
    }
	
	public String assert_order_delete_assertion() {
		WebElement assert_order_delete_text = driver.findElement(assert_order_delete);
		String assert_order_delete_text_string=assert_order_delete_text.getText();
		 return assert_order_delete_text_string;
		 
	 }
    
    
}
