package Testcases;

import org.testng.annotations.Test;

import Pages.login_page;

public class login_test001 extends Base_class{
	
	@Test
	public void logintest() {

		login_page login_page=new login_page(driver);
		login_page.setusername(username);
		login_page.setpass(pass);
		login_page.clicklogin();
	}
	@Test
	public void check_diplay() throws Exception {
		login_page login_page=new login_page(driver);
		Thread.sleep(3000);
		login_page.Guru99_Bank_txt();
		
	}
}
