package Testcases;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import Pages.login_page;
import Utility_file.Read_config;


public class Base_class {
	public String baseURL="https://demo.guru99.com/v4/";
	public String username= "mngr453580";
	public String pass= "tunasYh";
	public static WebDriver driver;
	login_page login_page;

	@Parameters("browser")
	@BeforeMethod
	public void setup(@Optional("chrome") String browser) {
		
		Read_config config = new Read_config();
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Gencare\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
		}else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL);
	    login_page=new login_page(driver);
		login_page.setusername(username);
		login_page.setpass(pass);
		login_page.clicklogin();
		} 

	@AfterMethod
	public void tear_down() {
		driver.quit();

	}
	public void takess(ITestResult result) throws Exception {
		if(ITestResult.FAILURE==result.getStatus()) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			  Date d = new Date();
			  String TimeStamp = d.toString().replace(":", "_").replace(" ", "_");
			
			FileUtils.copyFile(source, new File("./Screenshots/" + result.getName()+ ".png"));
			System.out.println(result.getName()+"method() ss captured");
		}
		else {
			if(ITestResult.SUCCESS==result.getStatus()) {
				
				TakesScreenshot ts=(TakesScreenshot)driver;
				
			
				File source = ts.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(source, new File("./Screenshots/" + result.getName()+ ".png"));
				System.out.println(result.getName()+"method() ss captured");
		}
			
	}
	}
	
	}

