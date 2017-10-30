package lab3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Third {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("http://www.51.com");// open home page
		WebElement webElement = webdriver.findElement(By.className("login"));
		List<WebElement> elements = webElement
				.findElements(By.tagName("label"));
		for (WebElement e : elements) {
			System.out.println(e.getText());
		}

	}

}
