package StepsPllel;

import org.testng.Assert;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;

public class GoogleStepsLL extends BaseClass{

	@Given("user is on google homepage")
	public void user_is_on_google_homepage() {
	    initialisation();
	    getDriver().get("https://www.google.com");
	}

	@Given("user validate the google homepage url")
	public void user_validate_the_google_homepage_url() {
	    
		String actualUrl=getDriver().getCurrentUrl();
		boolean url=actualUrl.contains("google");
		Assert.assertEquals(url, true);
		try {
			Thread.sleep(5000);
			
			getDriver().quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	
}
