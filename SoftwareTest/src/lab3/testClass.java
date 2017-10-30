package lab3;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testClass {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.firefox.marionette",
				"‪C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	// Search using keyword through Google search

	public void testtestclass() throws Exception {
		// Open Home Page
		driver.get("http://www.google.com");
		// Enter text in search box
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(1000);
		// Click Search button
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(10000);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
