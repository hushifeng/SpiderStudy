/**
 * @author 胡世锋 on 2016/11/15
 *
 */
package Feature;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Common.Browser;


public class FeatureSet {
	private static WebDriver driver = Browser.driver();

	private static String userId = "你是我的呀呀乐";
	private static String password = "XXXXXX";// 密码不便透露抱歉本人已隐藏

	// Login
	public static void login(String id, String pwd) {

		// set a default value for username and password
		if (id == null || id.length() == 0 || pwd == null || pwd.length() <= 0) {
			id = userId;
			pwd = password;
		}
		driver.findElement(By.name("username")).sendKeys(id);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("password")).sendKeys(pwd);// 密码本人隐藏了
		driver.findElement(By.className("loginnow")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	// 测试搜索框输入西工大后点击百度一下标题是否一致
	public static void Search() {
		WebElement webElement = driver.findElement(By.name("word"));
		webElement.sendKeys("西工大");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webElement.submit();

	}

	// 测试不输入直接点搜索
	public static void DirectClick() {
		WebElement webElement = driver.findElement(By.name("word"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webElement.submit();// 不输入文字直接点击搜索
		// System.out.println(driver.getTitle());

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 测试搜索框输入最大文字数
	public static void SearchMax() {
		WebElement webElement = driver.findElement(By.name("word"));
		webElement
				.sendKeys("雨霖铃 柳永 寒蝉凄切,对长亭晚.骤雨初歇,都门帐饮无绪,方留恋处,兰舟催发.执手相看泪眼,竟无语凝噎.念去去,千里烟波,暮霭沉沉楚天阔.多情自古伤离别,更那堪,冷落清秋节.今宵酒醒何处?杨柳岸,晓风残月.此去经年,应是良辰好景虚设.便纵有千种风情,待与何人说! 雨霖铃 柳永 寒蝉凄切,对长亭晚.骤雨初歇,都门帐饮无绪,方留恋处,兰舟催发.执手相看泪眼,竟无语凝噎.念去去,千里烟波,暮霭沉沉楚天阔.多情自古伤离别,更那堪,冷落清秋节.今宵酒醒何处?杨柳岸,晓风残月.此去经年,应是良辰好景虚设.便纵有千种风情,待与何人说!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 测试点击百度一下按钮后搜索框最大文字数
	public static void SearchClickMax() {
		WebElement webElement = driver.findElement(By.name("word"));
		webElement
				.sendKeys("雨霖铃 柳永 寒蝉凄切,对长亭晚.骤雨初歇,都门帐饮无绪,方留恋处,兰舟催发.执手相看泪眼,竟无语凝噎.念去去,千里烟波,暮霭沉沉楚天阔.多情自古伤离别,更那堪,冷落清秋节.今宵酒醒何处?杨柳岸,晓风残月.此去经年,应是良辰好景虚设.便纵有千种风情,待与何人说! 雨霖铃 柳永 寒蝉凄切,对长亭晚.骤雨初歇,都门帐饮无绪,方留恋处,兰舟催发.执手相看泪眼,竟无语凝噎.念去去,千里烟波,暮霭沉沉楚天阔.多情自古伤离别,更那堪,冷落清秋节.今宵酒醒何处?杨柳岸,晓风残月.此去经年,应是良辰好景虚设.便纵有千种风情,待与何人说!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webElement.submit();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 测试搜索框输入第一个字符作为一个汉字计数
	public static void SearchFirst() {
		WebElement webElement = driver.findElement(By.name("word"));
		webElement
				.sendKeys("#雨霖铃 柳永 寒蝉凄切,对长亭晚.骤雨初歇,都门帐饮无绪,方留恋处,兰舟催发.执手相看泪眼,竟无语凝噎.念去去,千里烟波,暮霭沉沉楚天阔.多情自古伤离别,更那堪,冷落清秋节.今宵酒醒何处?杨柳岸,晓风残月.此去经年,应是良辰好景虚设.便纵有千种风情,待与何人说! 雨霖铃 柳永 寒蝉凄切,对长亭晚.骤雨初歇,都门帐饮无绪,方留恋处,兰舟催发.执手相看泪眼,竟无语凝噎.念去去,千里烟波,暮霭沉沉楚天阔.多情自古伤离别,更那堪,冷落清秋节.今宵酒醒何处?杨柳岸,晓风残月.此去经年,应是良辰好景虚设.便纵有千种风情,待与何人说!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 测试点击百度一下按钮后搜索框空格合并
	public static void BlankMerge() {
		WebElement webElement = driver.findElement(By.name("word"));
		webElement
				.sendKeys("雨霖铃柳永寒蝉凄切对长亭晚骤雨初歇都门帐 饮无绪方留恋处兰舟催发                                                                                                                               执手相看泪眼竟");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webElement.submit();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 测试无意义的搜索
	public static void NoMeaningSearch() {
		WebElement webElement = driver.findElement(By.name("word"));
		webElement
				.sendKeys("asidnsivnivonsklvnzksdnvklsdnklegsdvgdsvsdfvddsgsdvdfvas");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webElement.submit();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
