package Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ScreenCapture {

	String path;
	WebDriver driver;

	public ScreenCapture(WebDriver driver)
	{
		this.driver = driver;
	}
	public void getScreenShot(String name){
		try {

			  TakesScreenshot tk=(TakesScreenshot) driver;
				File f=tk.getScreenshotAs(OutputType.FILE);
			    File f1=new File("C:\\Users\\a835705\\eclipse-workspace\\DigitalLawSuits\\target\\screenshots\\"+name+".png" );
			    FileUtils.copyFile(f, f1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
