package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.TestCase;

public class Test extends TestCase {
	public void test() {
		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("localhost:8080/Rechner_Auth/Form.jsp");

		driver.close();
	}
}
