package com.qa.testcases;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test1.qa.base.TestBase;
//import com.gmail.qa.pages.HomePage;
import com.test1.qa.pages.LoginPage;
import com.test1.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	//HomePage homePage;
	String sheetName="Sheet1";
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	/*@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
	}
	
	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}*/
@DataProvider
public Object[][] Userdata(){
	Object data[][]=TestUtil.getTestData(sheetName);
	return data;
}
	@Test(dataProvider="Userdata")
	public void login1(String username,String password){
		loginPage.login(username, password);
	
	//Alert alert = driver.switchTo().alert();
	//alert.accept();
}
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
	
}

