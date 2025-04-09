package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	// Convert the WebDriver in to the ThreadLocal<WebDriver>

	private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();

	public WebDriver getDriver() {
		return threadLocal.get();
		
	}

	public void initialisation() {

		WebDriver driver = new EdgeDriver();
		threadLocal.set(driver);

		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		getDriver().manage().deleteAllCookies();

		System.out.println("Conflict Issue Statement");

	}

}
