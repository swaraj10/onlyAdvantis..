package com.advantis.test.utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/*
Create a  Screenshot class and then the method captureScreenshot() with  2 parameter  as below and
then create a String object timestamp() so that we can save several screenshot file.
*/
public class Screenshot  {
		
	public  void captureScreenshot(WebDriver driver, String screenshotname ){
		
		try {
			TakesScreenshot sc = ((TakesScreenshot)driver);
			File file = sc.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("C:\\Users\\adraj\\Desktop\\Screenshot\\" + screenshotname + timestamp() +  ".png"));
		} catch (Exception e) {
			System.out.println("Exception while screenshot is : " + e.getMessage());			
		}
	}
	public  String timestamp() {
	    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}
