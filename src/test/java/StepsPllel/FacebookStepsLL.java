package StepsPllel;

import org.testng.Assert;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;

public class FacebookStepsLL extends BaseClass {

	@Given("user is on Facebook homepage")
	public void user_is_on_facebook_homepage() {
	    initialisation();
	    getDriver().get("https://www.facebook.com/reg");
	}

	@Given("user validate  the facebook homepage url")
	public void user_validate_the_facebook_homepage_url() throws Exception {
	    
		String actualUrl=getDriver().getCurrentUrl();
		boolean url=actualUrl.contains("facebook");
		Assert.assertEquals(url, true);
		Thread.sleep(5000);
		
		getDriver().quit();
	}
}
