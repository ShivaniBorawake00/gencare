package Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	WebDriver ldriver;
	public login_page(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="uid")
	WebElement email;

	@FindBy(name="password")
	WebElement Password;

	@FindBy(name="btnLogin")
	WebElement loginbutton;

	@FindBy(name="btnReset")
	WebElement reset;

	@FindBy(xpath="//h2[text()='Guru99 Bank']")
	WebElement Guru99_Bank_txt;

	
	@FindBy(xpath="//ol[@style='font-size:18px;']/li")
	WebElement steps_of_login;



	public void setusername(String username) {
		email.sendKeys(username);	
	}
	public void setpass(String pass) {
		Password.sendKeys(pass);
	}
	public void clicklogin() {
		loginbutton.click();
	}

	public void Guru99_Bank_txt() {
		Guru99_Bank_txt.isDisplayed();
	}
	
	


}
