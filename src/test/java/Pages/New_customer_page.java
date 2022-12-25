package Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_customer_page {
	WebDriver driver;
	public New_customer_page(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement new_custo;
	
	@FindBy(name="name")
	WebElement cus_name;

	@FindBy(name="rad1")
	WebElement gender;


	@FindBy(name="dob")
	WebElement dob;

	@FindBy(name="addr")
	WebElement adress;

	@FindBy(name="city")
	WebElement city;

	@FindBy(name="state")
	WebElement state;

	@FindBy(name="pinno")
	WebElement pin_no;

	@FindBy(name="telephoneno")
	WebElement telephoneno;

	@FindBy(name="emailid")
	WebElement email_id;

	@FindBy(name="password")
	WebElement password;

	@FindBy(name="sub")
	WebElement submit;
	
	public void  new_custo() {
		new_custo.click();
	}

	public void  name() {
		cus_name.sendKeys("shivani");
	}
	public void  gender(String gender1) {
		gender.click();
	}
	public void  dob(String dd, String mm,String yy) {
		dob.sendKeys(dd);
		dob.sendKeys(mm);
		dob.sendKeys(yy);
	}
	
	public void  adress() {
		adress.sendKeys("phaltan");
	}
	public void  city() {
		city.sendKeys("phaltan");
	}
	public void  email_id(String email) {
		email_id.sendKeys(email);
	}
	public void telephoneno(String phone) {
		telephoneno.sendKeys(phone);
		
	}
	
	public void  pin_no(String pin) {
		pin_no.sendKeys(pin);
	}
	public void  password(String pass) {
		password.sendKeys(pass);
	}
	public void  submit() {
		submit.click();
	}
	
}
