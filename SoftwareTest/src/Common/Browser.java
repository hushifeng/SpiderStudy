package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	private static WebDriver driver = getDefaultDriver();
	public static String filePath;
	public static String baseURL;

	public static WebDriver driver() {
		return driver;
	}

	public static void open(String url) {
		driver.get(url);
	}

	public static void close() {
		driver.close();
	}

	private static WebDriver getDefaultDriver() {
		// 指定配置文件路径 暂时只使用火狐浏览器
		filePath = "D:\\workspace\\java\\SoftwareTest\\src\\Config\\config.properties";
		baseURL = Utility.readValue(filePath, "baseURL");
		if (Utility.readValue(filePath, "driver.type").equalsIgnoreCase(
				"firefox")) {
			System.setProperty(Utility.readValue(filePath, "driver.name"),
					Utility.readValue(filePath, "driver.path"));
			driver = new FirefoxDriver();
		} else if (Utility.readValue(filePath, "driver.type").equalsIgnoreCase(
				"chrome")) {
			System.setProperty(Utility.readValue(filePath, "driver.name"),
					Utility.readValue(filePath, "driver.path"));
			driver = new ChromeDriver();
		} else if (Utility.readValue(filePath, "driver.type").equalsIgnoreCase(
				"IE")) {
			System.setProperty(Utility.readValue(filePath, "driver.name"),
					Utility.readValue(filePath, "driver.path"));
			driver = new InternetExplorerDriver();
		}
		// driver.manage().window().maximize();
		return driver;
	}

}
