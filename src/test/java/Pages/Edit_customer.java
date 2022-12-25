package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_customer {
	static WebDriver driver;

	public Edit_customer(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//a[text()='Edit Customer']")
	WebElement edit_customer;


	@FindBy(xpath="//p[text()='Edit Customer Form']")
	WebElement edit_customer_form;


	@FindBy(name="cusid")
	WebElement cusid;


	@FindBy(name="AccSubmit")
	WebElement AccSubmit;

	@FindBy(name="res")
	WebElement res;

	public void edit_customer_method(String id) {
		edit_customer.click();
		edit_customer_form.isDisplayed();
		res.isDisplayed();
		cusid.sendKeys(id);
		AccSubmit.click();

	}
}
