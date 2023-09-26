package Testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BasePage;
import Pages.Delete_account_page;
import Pages.SignUp_login_Page;
import Pages.SignUp_page;
import Pages.checkout_page;
import Pages.homepage_page;
import Utilities.ReadingPropertiesFile;

public class signupPageTestCase extends BasePage {
	
	public String name=ReadingPropertiesFile.getProperty("name");
    public String email=ReadingPropertiesFile.getProperty("email");
    public String pass=ReadingPropertiesFile.getProperty("pass");
    public String fname=ReadingPropertiesFile.getProperty("fname");
    public String lname=ReadingPropertiesFile.getProperty("lname");
    public String add=ReadingPropertiesFile.getProperty("add");
    public String state=ReadingPropertiesFile.getProperty("state");
    public String zip=ReadingPropertiesFile.getProperty("zip");
    public String city=ReadingPropertiesFile.getProperty("city");
    public String mobile=ReadingPropertiesFile.getProperty("mobile");
    public String desc=ReadingPropertiesFile.getProperty("desc");
    public String cardname=ReadingPropertiesFile.getProperty("cardname");
    public String cardnumber=ReadingPropertiesFile.getProperty("cardnumber");
    public String cvc=ReadingPropertiesFile.getProperty("cvc");
    public String month=ReadingPropertiesFile.getProperty("month");
    public String year=ReadingPropertiesFile.getProperty("year");
   
    public static Logger logger = LogManager.getLogger(signupPageTestCase.class);
	
	
	@Test
	public void testcase(){
		SignUp_login_Page signUpPage = new SignUp_login_Page(driver);
		homepage_page hpage= new homepage_page(driver);
		SignUp_page sign_page=new SignUp_page(driver);
		checkout_page cout_page= new checkout_page(driver);
		Delete_account_page dpage = new Delete_account_page(driver);
		
		
		
		logger.info("====================Verifying Homepage =================================");
		String homepage_string=ReadingPropertiesFile.getProperty("homepage_string");
		String expected_string=hpage.homepage_assert();
		Assert.assertEquals(homepage_string,expected_string);
		
		
		hpage.click_view_product_btn();
		hpage.click_add_product_btn();
		hpage.click_viewCart();
		
		logger.info("====================Verifying cart page is displayed =================================");
		String cartpage_string=ReadingPropertiesFile.getProperty("cartpage_string");
		String expected_cartpage_string=hpage.cartpage_assert();
		Assert.assertEquals(cartpage_string,expected_cartpage_string);

		
		hpage.click_proceed_to_check();
		hpage.click_login_signup();
		
		signUpPage.enterUsername(name);
		signUpPage.enterEmail(email);
		signUpPage.clicksignUpButton();
		
		logger.info("====================Inserting all the data in sign up page =================================");
		sign_page.click_genderbtn();
		sign_page.enter_password(pass);
		sign_page.enter_firstname(fname);
		sign_page.enter_lastname(lname);
		sign_page.enter_adress(add);
		sign_page.enter_state(state);
		sign_page.enter_city(city);
		sign_page.enter_zip(zip);
		sign_page.enter_mobile(mobile);
		sign_page.click_create_account();
		
		
		logger.info("====================Verifying account created =================================");
		
		String create_account_string=ReadingPropertiesFile.getProperty("create_account_string");
		String expected_create_account_string=sign_page.account_created_assert();
		Assert.assertEquals(create_account_string,expected_create_account_string);

		cout_page.click_continue_btn();
		
		logger.info("====================Verifying Logged in as username' at top. =================================");
//		//Verify ' Logged in as username' at top.
//		String username_string=ReadingPropertiesFile.getProperty("name");
//		String expected_username_string=sign_page.verify_username_assert();
//		Assert.assertEquals(expected_username_string,username_string);
//		
		
	
		hpage.click_cart_button();
		hpage.click_proceed_to_check();
		
		
		logger.info("==================== Procedding for checkout =================================");
		cout_page.enter_message_textarea(desc);
		cout_page.click_place_order_btn();
		
		cout_page.enter_cardname_textbox(cardname);
		cout_page.enter_cardnumber_textbox(cardnumber);
		cout_page.enter_cvc_textbox(cvc);
		cout_page.enter_exp_month_textbox(month);
		cout_page.enter_exp_year_textbox(year);
		cout_page.click_pay_btn();
		
		logger.info("==================== Verifying order placed assertion =================================");
		
		String order_placed_string=ReadingPropertiesFile.getProperty("order_placed");
		String expected_order_placed_string=sign_page.order_placed_assertionassert();
		Assert.assertEquals(order_placed_string,expected_order_placed_string);
		
		cout_page.click_continue_btn();
		
		hpage.click_delete_acc_btn();
		
		
		logger.info("==================== Verifying delete page assertion =================================");
		
		String order_delete_string=ReadingPropertiesFile.getProperty("order_delete");
		String expected_order_delete=dpage.assert_order_delete_assertion();
		Assert.assertEquals(order_delete_string,expected_order_delete);
		dpage.click_continue_btn();
		
		logger.info("==================== All testcase passed =================================");
		
	}

}
