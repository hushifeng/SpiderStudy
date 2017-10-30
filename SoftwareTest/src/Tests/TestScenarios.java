/**
 * @author 胡世锋 on 2016/11/15
 *
 */
package Tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import Common.Browser;
import Common.Utility;
import Feature.FeatureSet;

public class TestScenarios {

	private static WebDriver driver = Browser.driver();
	static String url = Browser.baseURL;

	// public static String filePath;

	@Before
	public void setUp() throws Exception {
		Browser.open(url);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		// driver.manage().deleteAllCookies();
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
		 driver.quit();

	}

	 @Test
	 public void test_LoginSuccess() throws Exception {
	 //测试登陆
	 FeatureSet.login(null,null);
	 }

	
	 @Test
	 public void test_Search() {
	 FeatureSet.Search();
	 //测试搜索框输入西工大后点击百度一下标题是否一致
	 Assert.assertEquals("西工大_百度搜索", driver.getTitle());
	 // System.out.println(driver.getTitle());
	
	 try {
	 Thread.sleep(10000);
	 } catch (InterruptedException e) {
	 // TODO Auto-generated catch block
	 e.printStackTrace();
	 }
	 }

	 @Test
	 public void test_DirectClick(){
	 //测试不输入直接点搜索
	 FeatureSet.DirectClick();
	 assertEquals("百度一下，你就知道",driver.getTitle());
	 }

	 @Test
	 public void test_SearchMax(){
	 //测试搜索框输入最大文字数
	 FeatureSet.SearchMax();
	 try {
	 Thread.sleep(3000);
	 } catch (InterruptedException e) {
	 // TODO Auto-generated catch block
	 e.printStackTrace();
	 }
	 assertEquals(0, driver.findElement(By.name("word")).getText().length());
	
	 }

	 @Test
	 public void test_SearchClickMax(){
	 //测试点击百度一下按钮后搜索框最大文字数
	 FeatureSet.SearchClickMax();
	 try {
	 Thread.sleep(3000);
	 } catch (InterruptedException e) {
	 // TODO Auto-generated catch block
	 e.printStackTrace();
	 }
	 assertEquals(0, driver.findElement(By.name("word")).getText().length());
	
	 }

	 @Test
	 public void test_SearchFirst(){
	 //测试搜索框输入第一个字符作为一个汉字计数
	 FeatureSet.SearchFirst();
	 try {
	 Thread.sleep(3000);
	 } catch (InterruptedException e) {
	 // TODO Auto-generated catch block
	 e.printStackTrace();
	 }
	 assertEquals(0, driver.findElement(By.name("word")).getText().length());
	
	 }

	 @Test
	 public void test_BlankMerge(){
	 //测试点击百度一下按钮后搜索框空格合并
	 FeatureSet.BlankMerge();
	 try {
	 Thread.sleep(3000);
	 } catch (InterruptedException e) {
	 // TODO Auto-generated catch block
	 e.printStackTrace();
	 }
	 assertEquals(0, driver.findElement(By.name("word")).getText().length());
	
	 }

	@Test
	public void test_NoMeaningSearch() {
		// 测试无意义的搜索
		FeatureSet.NoMeaningSearch();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// assertEquals(0,
		// driver.findElement(By.name("word")).getText().length());
		// System.out.println(driver.getTitle());
		assertEquals(
				"asidnsivnivonsklvnzksdnvklsdnklegsdvgdsvsdfvddsgsdvdfvas_百度搜索",
				driver.getTitle());
	}

}
