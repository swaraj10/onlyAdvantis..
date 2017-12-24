package com.advantis.test.pages;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.advantis.test.TestBase;

public class HomeLoanPage extends TestBase {
	
	public HomeLoanPage(WebDriver driver, Properties objrep) {
		this.driver= driver;
		this.objrep = objrep;
	}
	
	public String homeLoanPageTitle(){
		return driver.getTitle();
	}
	
	public int totalNoOflinks(){
		List<WebElement> links = getWebelements(By.tagName(objrep.getProperty("Links_on_HomeLoan_Page")));
		return links.size();		 
	}
	
	
	//while doing this way Index array out of bound exception occurred .....
	
	
	public String[] allLinkTexts(){
		List<WebElement> links = getWebelements(By.tagName(objrep.getProperty("Links_on_HomeLoan_Page")));
		String[] linkTexts = new String[108];	
		int i=0;
		for (i=1; i<=links.size(); i++){
		linkTexts[i]= links.get(i).getText();
		}	
		return linkTexts;	
	}
	
	
	/*
	
	public String allLinksTextInHomeLoanPage(){
		List<WebElement> links = getWebelements(By.tagName(objrep.getProperty("Links_on_HomeLoan_Page")));
		int i = 0;
		String linktext = null;
		for(i =0; i<links.size(); i++){
			linktext = links.get(i).getText();	
		}
		return linktext;
	}
	
	*/
	
	
	
}
