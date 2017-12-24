package com.advantis.test.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;


//Use this class as base class, if you want to implement a WebDriverEventListener and are only interested in some events. 
//All methods provided by this class have an empty method body. See the below link for the detail
//https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/support/events/AbstractWebDriverEventListener.html

//You can give any name to the class ........
public class MyListener extends AbstractWebDriverEventListener {
	
//Called before WebElement.click().	
	@Override
	public void beforeClickOn(WebElement element, WebDriver driver){
		try {
			Thread.sleep(100L);
			System.out.println("1========================Beforeclickon was called=============================" + element.toString());
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			System.out.println("2========================Beforeclickon was not called============================="+ element.toString());
		}		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver){
		try {
			Thread.sleep(100L);
			System.out.println("3========================afterclickon was called============================="+ element.toString());
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			System.out.println("4========================afterclickon was  not called============================="+ element.toString());
		}
	}
	
	
	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver){
		
		try {
			
			Thread.sleep(100L);
			System.out.println("5.============================Element was found"+ by.toString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("6.=========================Element was not found"+ by.toString());
		}
	}
	
	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver){
		
		try {
			Thread.sleep(100L);
			System.out.println("7.================================Element is going to find found"+ by.toString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("8.=========================================Element is going to find found"+ by.toString());
		}
		
	}
}
