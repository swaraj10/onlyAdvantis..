package com.advantis.test.modules;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.advantis.test.TestBase;


public class HomePageTest extends TestBase {	
	
	@BeforeMethod
	public void setUp() throws Throwable{
		initialize();
	}
	
	@Test
	public void testTitle(){
		Assert.assertEquals(home.HomePageTitle(), "Portland Credit Unions | Advantis Credit Union", "Homepage title assertion fail");
	}
	
	@Test
	public void testHomeLoanPageTitle() throws Exception{
		home.goToHomeLoanPage();
		Assert.assertEquals(homeLoan.homeLoanPageTitle(), "Portland Mortgage - Home Loans | Advantis Credit Union", "Home Loan page title assertion fail");
	}
	
	@Test
	public void verifyTotalLinksOnHomeLoanPage() throws Exception{		
		home.goToHomeLoanPage();
		Assert.assertEquals(homeLoan.totalNoOflinks(), 108, "VerifyTotalLinksOnHomeLoanPage test fail");			
	}
	
	//Test of verification of all String
	
	/*
	 * 
	@Test
	public void verifyAllLinksTextInHomeLoanPage() throws Exception{
		home.goToHomeLoanPage();
		String[] arr = homeLoan.allLinkTexts();
		String str = String.join(",", arr);
		Assert.assertEquals(str, "This is all link texts......", "All link texts in home loan page assertion fail");
	}	
	*/
	
	@Test
	public void verifyAllLinksTextInHomeLoanPage() throws Exception{
		home.goToHomeLoanPage();	
		Assert.assertEquals(homeLoan.allLinkTexts(), "This is all link texts......", "All link texts in home loan page assertion fail");
	}		
	
	
	
	
	@AfterMethod
	public void closeBrowser(){
		
		closeDriver();
	}

}
