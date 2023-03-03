package PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WaitHelper;

public class RecentLawSuitsPom {

	@FindBy(xpath="//div[@class='mostrecent-list post-listing active']/div")
	public
	List<WebElement> listMostRecentLawSuits;
	
	WebDriver driver;
	WaitHelper waitHelper;
	
	public RecentLawSuitsPom(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		waitHelper=new WaitHelper(driver);
		
	}
	
	public int getNoOfBoxes()
	{
		return listMostRecentLawSuits.size();
	}
	
	
	@SuppressWarnings("unused")
	public List<String> getMostRecentLawSuits(String RecentDate)
	{
		List l=new ArrayList();
		for(int i=1;i<getNoOfBoxes();i++)
		{
		WebElement eachValue=driver.findElement(By.xpath("//div[@class='mostrecent-list post-listing active']/div["+i+"]"));
		waitHelper.waitForElement(eachValue, 30);
		if(eachValue.getText().contains(RecentDate))
		{
			if(!l.contains(eachValue.getText()))
			{
		//	System.out.println(eachValue.getText());
				l.add(eachValue.getText());
			}
			
		}
		else
		{
			break;
		}
		
		}
		return l;
	}
}
