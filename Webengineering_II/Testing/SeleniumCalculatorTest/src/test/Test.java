package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.TestCase;

public class Test extends TestCase {
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.get("localhost/Rechner_Auth/Form.jsp");

		driver.close();
	}
}
