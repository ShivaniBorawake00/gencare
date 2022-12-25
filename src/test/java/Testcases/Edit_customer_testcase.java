package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.Edit_customer;



public class Edit_customer_testcase extends Base_class{
	
	@Test
	public void edid_custome_method() {
		
		Edit_customer editcust = new Edit_customer(driver);
		
		editcust.edit_customer_method("676776667");
		
		
	}
}
