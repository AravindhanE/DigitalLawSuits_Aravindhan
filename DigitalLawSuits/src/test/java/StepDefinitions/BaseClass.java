package StepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a835705\\eclipse-workspace\\Day1_Class\\Driver\\chromedriver.exe ");
       driver=new ChromeDriver();
	}
	
	public static void launchUrl(String url)
	{
		driver.get(url);
	}
	
	public static void  clickOnButton(WebElement w)
	{
		w.click();
	}
	
	public static void  passValues(WebElement w, String values)
	{
		w.sendKeys(values);
	}
	public static void windowMaximize()
	{
		driver.manage().window().maximize();
	}
	
	public boolean checkDropDownMultiple(WebElement dropDwon)
	{
		 Select s=new Select(dropDwon);
		 boolean b=s.isMultiple();
		 return b;
	}
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
