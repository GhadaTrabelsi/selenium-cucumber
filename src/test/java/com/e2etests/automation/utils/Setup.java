package com.e2etests.automation.utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {

	private static WebDriver driver;

	/**
	 * This method is used to open browser. This method is called before the
	 * invocation of each test method in the given class. In this method we need to
	 * pass browser name which will invoke the respective driver.
	 *
	 * @throws MalformedURLException the malformed URL exception
	 * @Before Methods annotated with @Before will execute before every scenario.
	 */
	@Before
	public void setWebDriver() {

//		Il vérifie si la valeur de "browser" est null. Si la propriété système "browser" 
//		n'a pas été définie (c'est-à-dire qu'elle est null), il attribue la valeur par défaut "chrome" à la variable browser.
		String browser = System.getProperty("browser");
		if (browser == null) {
			browser = "chrome";
		}
		switch (browser) {

		case "chrome":
			//System.setProperty("webdriver.http.factory", "jdk-http-client");
			ChromeOptions chromeOptions = new ChromeOptions();
//			DesiredCapabilities cap = new DesiredCapabilities();
//			cap.setCapability("platform", "win10");
//			chromeOptions.merge(cap);
//			WebDriverManager.chromedriver().setup(); //==> commr ds firefox version OS qui est platform 
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();

			break;
		case "firefox":
			//System.setProperty("webdriver.http.factory", "jdk-http-client");
			FirefoxProfile profile = new FirefoxProfile();
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			//WebDriverManager.firefoxdriver().setup();
			firefoxOptions.setCapability("platform", Platform.WIN10);
			firefoxOptions.setProfile(profile);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;

		case "edge":
			//System.setProperty("webdriver.http.factory", "jdk-http-client");
			//WebDriverManager.edgedriver().setup();
			//System.setProperty("webdriver.edge.driver","src\\test\\resources\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();

		default:
			throw new IllegalArgumentException("Browser \"" + browser + "\" is not supported. ");

		}
	}

	/* GETTER */
	public static WebDriver getDriver() {
		return driver;
	}

}

