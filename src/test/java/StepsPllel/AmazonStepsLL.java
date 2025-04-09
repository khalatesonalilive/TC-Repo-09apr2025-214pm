package StepsPllel;

import org.testng.Assert;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;

public class AmazonStepsLL extends BaseClass {
	@Given("user is on amazon homepage")
	public void user_is_on_amazon_homepage() {
		initialisation();
		getDriver().get("https://www.amazon.in");
	}

	@Given("user validate the amazon homepage url")
	public void user_validate_the_amazon_homepage_url() throws Exception {

		String actualUrl = getDriver().getCurrentUrl();
		boolean url = actualUrl.contains("amazon");
		Assert.assertEquals(url, true);
		Thread.sleep(5000);

		getDriver().quit();
	}
}
