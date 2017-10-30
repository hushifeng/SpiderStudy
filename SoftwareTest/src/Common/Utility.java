/**
 * @author ºúÊÀ·æ
 */
package Common;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Utility {

	private static WebDriver driver = Browser.driver();

	// Get value according its key
	public static String readValue(String filePath, String key) {
		Properties props = new Properties();
		String value = new String();
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(
					filePath));
			props.load(in);
			value = props.getProperty(key);
			System.out.println(key + ":" + value);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			return value;
		}
	}

	// generate valid mail address
	public static String validEmailAddressGenerator() {

		StringBuffer sb = new StringBuffer();
		String allChar = "0123456789abcdefghijklmnopqrstuvwxyz";

		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			sb.append(allChar.charAt(random.nextInt(allChar.length())));
		}

		String tmp = sb.toString();

		sb.append("@");
		sb.append(tmp);
		sb.append(".com");

		String mailAdd = sb.toString();

		return mailAdd;
	}

	public static void waitForElementPresence(By by) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	public static void waitForElementClickAble(WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public static Boolean waitForElement(By by, int timeout) {

		for (int second = 0;; second++) {
			if (second < timeout) {

				if (1 == driver.findElements(by).size()) {
					return true;
				}
			} else
				return false;
		}

	}

}
