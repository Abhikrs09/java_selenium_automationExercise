package BasePackage;


import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import Utilities.ExtentManager;
import Utilities.ReadingPropertiesFile;
import Utilities.Screenshot;


public class BasePage {
	
	public static Logger logger = LogManager.getLogger(BasePage.class);
	public WebDriver driver;
	public static ExtentReports extent_report;
	public static ExtentTest extent_test;
	
	
	@BeforeMethod
    public void setUp() {
		String browserName=ReadingPropertiesFile.getProperty("browser");
        
        if (browserName.equalsIgnoreCase("chrome")) {
          
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
 
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ReadingPropertiesFile.getProperty("url"));
		 extent_report = ExtentManager.getInstance("Reports//Extent_demo.html");
		 extent_test = extent_report.startTest(browserName);

    }
	
	
	@AfterMethod
	public void testStatus(ITestResult result) {

		//setting up the after method for base class
		if(result.getStatus() == ITestResult.SUCCESS) {
			extent_test.log(LogStatus.PASS, "Test case got passed");
			
		} else if (result.getStatus() == ITestResult.FAILURE) {
			Screenshot.takeScreenShot(driver,result.getName());
			extent_test.log(LogStatus.ERROR, extent_test.addScreenCapture(System.getProperty("user.dir") + "//Screenshots//" + result.getName() +" .jpg"));
			extent_test.log(LogStatus.ERROR, result.getThrowable());
			extent_test.log(LogStatus.FAIL, "Test case got failed");
			
		}
		extent_report.flush();
		driver.quit();

	}
}
