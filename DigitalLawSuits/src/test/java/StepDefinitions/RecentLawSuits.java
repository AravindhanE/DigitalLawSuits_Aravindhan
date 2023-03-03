package StepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import PageObject.RecentLawSuitsPom;
import Utility.ScreenCapture;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class RecentLawSuits {
	public BaseClass base;
	public RecentLawSuitsPom lawSuits;
	List values;
	static Logger log=LogManager.getLogger(RecentLawSuits.class);
	ScreenCapture ScnCapt;
	
	@After
	    public void tearDown(Scenario result) throws IOException {
	        if(result.isFailed()) {
	         	  TakesScreenshot tk=(TakesScreenshot) base.driver;
					File f=tk.getScreenshotAs(OutputType.FILE);
				    File f1=new File(".\\target\\screenshots\\"+result.getName()+".png" );
				    FileUtils.copyFile(f, f1);
	        }
	        base.closeBrowser();
	    }
	
	@SuppressWarnings("static-access")
	@Given("I launch browser")
	public void i_launch_browser() {
	  PropertyConfigurator.configure("log4j.properties");
	  base=new BaseClass();
	  base.launchBrowser();
	  log.info("I opened browser");
	  base.windowMaximize();
	  
	}

	@SuppressWarnings("static-access")
	@When("I enter {string} and search")
	public void i_enter_and_search(String url) {
	    base.launchUrl(url);
	    log.info("I navigated to website HomePage");
	}


	@SuppressWarnings("static-access")
	@Then("I navigated to Home Page")
	public void i_navigated_to_Home_Page() {
	   Assert.assertTrue(base.driver.getPageSource().contains("Digital Accessibility Lawsuits"));
	   log.info("I verified I am on home page");
	}


	@When("I fetch Plaintiff and Defendant information from Recent lawsuits as per {string}")
	public void i_fetch_Plaintiff_and_Defendant_information_from_Recent_lawsuits_as_per(String RecentDate) {
		lawSuits=new RecentLawSuitsPom(base.driver);
		values=new ArrayList();
		values=lawSuits.getMostRecentLawSuits(RecentDate);
		
	}


	@Then("I should verify following details are present with {string}  {string} {string} {string}")
	public void i_should_verify_following_details_are_present_with(String Detail1, String Detail2, String Detail3, String Detail4) {
	  for(int i=0;i<values.size();i++)
	  {
	Object obj=values.get(i);
	String s=String.valueOf(obj);
	System.out.println(s);
	Assert.assertTrue(s.contains(Detail1));
	Assert.assertTrue(s.contains(Detail2));
	Assert.assertTrue(s.contains(Detail3));
	Assert.assertTrue(s.contains(Detail4));
	log.info("i validated all details");
	
	  }
	   
	}
	@Then("I closed browser")
	public void i_closed_browser() {
	   base.closeBrowser();
	   log.info("i closed browser");
	}

}
