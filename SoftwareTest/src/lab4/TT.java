package lab4;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TT {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	// Search using keyword through Google search

	@Test
	public void testtestclass() throws Exception {
		// Open Home Page
		driver.get("http://www.baidu.com");
		WebElement element = driver.findElement(By.name("wd"));
		// Enter text in search box
		element.sendKeys("西北工业大学");
		Thread.sleep(1000);
		// Click Search button
		element.submit();
		;
		Thread.sleep(10000);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
