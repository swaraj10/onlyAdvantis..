package com.advantis.test.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.advantis.test.TestBase;

public class HomePage extends TestBase {
	
	public HomePage(WebDriver driver, Properties objrep) {
		this.driver= driver;
		this.objrep = objrep;
	}
	
	
	public String HomePageTitle(){
		
		return driver.getTitle();
	}
	
	public void goToHomeLoanPage() throws Exception{
		
		click(By.xpath(objrep.getProperty("Nav_Bar_Loan_Xpath")));
		click(By.linkText(objrep.getProperty("List_Mortgage_Link_Text")));
	}
	

}
