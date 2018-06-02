package com.test1.qa.pages;
import org.eclipse.jetty.util.annotation.Name;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test1.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath=".//*[@id='email']")
	WebElement username;
	
	@FindBy(xpath=".//*[@id='pass']")
	WebElement password;
	
	@FindBy(id="loginbutton")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public void login(String un, String pw){
		username.sendKeys(un);
		password.sendKeys(pw);
		loginBtn.click();
		    	   
		
		//return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
