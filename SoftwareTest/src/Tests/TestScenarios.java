/**
 * @author ������ on 2016/11/15
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
	 //���Ե�½
	 FeatureSet.login(null,null);
	 }

	
	 @Test
	 public void test_Search() {
	 FeatureSet.Search();
	 //������������������������ٶ�һ�±����Ƿ�һ��
	 Assert.assertEquals("������_�ٶ�����", driver.getTitle());
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
	 //���Բ�����ֱ�ӵ�����
	 FeatureSet.DirectClick();
	 assertEquals("�ٶ�һ�£����֪��",driver.getTitle());
	 }

	 @Test
	 public void test_SearchMax(){
	 //�����������������������
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
	 //���Ե���ٶ�һ�°�ť�����������������
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
	 //���������������һ���ַ���Ϊһ�����ּ���
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
	 //���Ե���ٶ�һ�°�ť��������ո�ϲ�
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
		// ���������������
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
				"asidnsivnivonsklvnzksdnvklsdnklegsdvgdsvsdfvddsgsdvdfvas_�ٶ�����",
				driver.getTitle());
	}

}
