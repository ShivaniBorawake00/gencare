package Testcases;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.New_customer_page;
import Pages.login_page;

public class New_customer_test extends Base_class{
	
	

	@Test
	public void new_custo() throws Exception {
		System.out.println("login succsesfiul");
		New_customer_page New_customer =new New_customer_page(driver);
		Thread.sleep(3000);
		New_customer.new_custo();
		New_customer.name();
		New_customer.gender("male");
		New_customer.dob("22", "44", "1234");
		New_customer.adress();
		New_customer.city();
		New_customer.email_id("shivaniborawake00@gmail.com");
		New_customer.telephoneno("7777777777");
		New_customer.pin_no("415455");
		New_customer.password("gdggdgd");
		New_customer.submit();

	}



}
