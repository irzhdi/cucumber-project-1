package com.juaracoding.cucumber4.utlis;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {
	public static int testCount = 0;

	public static String getScreenshot(WebDriver driver, String screenshotName){
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"/FaildTestsScrenshot/"+screenshotName+"_"+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyfile(source, finalDestination);
		return destination;
	}
}
