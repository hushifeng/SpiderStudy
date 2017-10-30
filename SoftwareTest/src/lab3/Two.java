package lab3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Two {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("http://www.baidu.com");// open home page
		webdriver.findElement(By.id("kw")).sendKeys("ºúÊÀ·æ");// Enter text in
															// search box by
															// locate id
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webdriver.findElement(By.id("su")).click();// Click search button
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webdriver.quit();

	}

}
