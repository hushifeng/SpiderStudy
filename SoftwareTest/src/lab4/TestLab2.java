package lab4;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLab2 {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		driver = new FirefoxDriver();

	}

	// @Test
	// public void testSort() {
	// driver.get("http://www.baidu.com");
	// WebElement webElement = driver.findElement(By.name("word"));
	// webElement.sendKeys("西工大");
	// try {
	// Thread.sleep(3000);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// webElement.submit();
	// //测试搜索框输入西工大后点击百度一下标题是否一致
	// Assert.assertEquals("西工大_百度搜索", driver.getTitle());
	// // System.out.println(driver.getTitle());
	//
	// try {
	// Thread.sleep(10000);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// driver.quit();
	// }

	// 测试不输入直接点搜索
	// @Test
	// public void testSearch() {
	// driver.get("http://www.baidu.com");
	// WebElement webElement = driver.findElement(By.name("word"));
	// try {
	// Thread.sleep(3000);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// webElement.submit();//不输入文字直接点击搜索
	// // System.out.println(driver.getTitle());
	//
	// try {
	// Thread.sleep(10000);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// driver.quit();
	// }

	// 测试搜索框输入最大文字数
	@Test
	public void testSearchMax() {
		driver.get("http://www.baidu.com");
		WebElement webElement = driver.findElement(By.name("word"));
		webElement
				.sendKeys("雨霖铃 柳永 寒蝉凄切,对长亭晚.骤雨初歇,都门帐饮无绪,方留恋处,兰舟催发.执手相看泪眼,竟无语凝噎.念去去,千里烟波,暮霭沉沉楚天阔.多情自古伤离别,更那堪,冷落清秋节.今宵酒醒何处?杨柳岸,晓风残月.此去经年,应是良辰好景虚设.便纵有千种风情,待与何人说! 雨霖铃 柳永 寒蝉凄切,对长亭晚.骤雨初歇,都门帐饮无绪,方留恋处,兰舟催发.执手相看泪眼,竟无语凝噎.念去去,千里烟波,暮霭沉沉楚天阔.多情自古伤离别,更那堪,冷落清秋节.今宵酒醒何处?杨柳岸,晓风残月.此去经年,应是良辰好景虚设.便纵有千种风情,待与何人说!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// webElement.submit();
		// System.out.println(driver.getTitle());

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// driver.quit();
	}

	// @Test
	// public void testLogin() {
	// // 测试百度账号登陆
	//
	// driver.get("https://www.baidu.com");
	// WebElement webElement2 = driver.findElement(By.name("tj_login"));
	// webElement2.click();//进入登录页面
	//
	// WebElement webElement3=driver.findElement(By.name("userName"));
	// webElement3.sendKeys("18392974187");
	//
	// WebElement webElement4=driver.findElement(By.name("password"));
	// webElement4.sendKeys("xxxxxxx");//密码本人隐藏了
	//
	// WebElement webElement5=driver.findElement(By.name("verifyCode"));
	// webElement5.sendKeys("验证码");//百度账号验证码为中文且随机
	// webElement5.submit();
	//
	// //自动登陆图灵机器人
	// driver.get("http://www.tuling123.com/login/index.jhtml?redirectUrl=%2Fmember%2Frobot%2Findex.jhtml");
	// driver.findElement(By.name("username")).sendKeys("你是我的呀呀乐");
	//
	// try {
	// Thread.sleep(3000);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// driver.findElement(By.name("password")).sendKeys("xxxxxx");//密码本人隐藏了
	// driver.findElement(By.className("loginnow")).click();
	//
	// }

}
