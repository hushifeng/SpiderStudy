package lab3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// firefox若未安装在默认目录下�?指定
		System.setProperty("webdriver.firefox.marionette",
				"‪C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		WebDriver webDriver = new FirefoxDriver();
		webDriver.get("http://www.baidu.com");

		WebElement webElement = webDriver.findElement(By.name("wd"));//
		webElement.sendKeys("西工�?");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		webElement.submit();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		webDriver.quit();
	}

}
