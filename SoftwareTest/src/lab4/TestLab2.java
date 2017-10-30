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
	// webElement.sendKeys("������");
	// try {
	// Thread.sleep(3000);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// webElement.submit();
	// //������������������������ٶ�һ�±����Ƿ�һ��
	// Assert.assertEquals("������_�ٶ�����", driver.getTitle());
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

	// ���Բ�����ֱ�ӵ�����
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
	// webElement.submit();//����������ֱ�ӵ������
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

	// �����������������������
	@Test
	public void testSearchMax() {
		driver.get("http://www.baidu.com");
		WebElement webElement = driver.findElement(By.name("word"));
		webElement
				.sendKeys("������ ���� ��������,�Գ�ͤ��.�����Ъ,������������,��������,���۴߷�.ִ���࿴����,��������ҭ.��ȥȥ,ǧ���̲�,ĺ������������.�����Թ������,���ǿ�,���������.�������Ѻδ�?������,�������.��ȥ����,Ӧ�������þ�����.������ǧ�ַ���,�������˵! ������ ���� ��������,�Գ�ͤ��.�����Ъ,������������,��������,���۴߷�.ִ���࿴����,��������ҭ.��ȥȥ,ǧ���̲�,ĺ������������.�����Թ������,���ǿ�,���������.�������Ѻδ�?������,�������.��ȥ����,Ӧ�������þ�����.������ǧ�ַ���,�������˵!");
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
	// // ���԰ٶ��˺ŵ�½
	//
	// driver.get("https://www.baidu.com");
	// WebElement webElement2 = driver.findElement(By.name("tj_login"));
	// webElement2.click();//�����¼ҳ��
	//
	// WebElement webElement3=driver.findElement(By.name("userName"));
	// webElement3.sendKeys("18392974187");
	//
	// WebElement webElement4=driver.findElement(By.name("password"));
	// webElement4.sendKeys("xxxxxxx");//���뱾��������
	//
	// WebElement webElement5=driver.findElement(By.name("verifyCode"));
	// webElement5.sendKeys("��֤��");//�ٶ��˺���֤��Ϊ���������
	// webElement5.submit();
	//
	// //�Զ���½ͼ�������
	// driver.get("http://www.tuling123.com/login/index.jhtml?redirectUrl=%2Fmember%2Frobot%2Findex.jhtml");
	// driver.findElement(By.name("username")).sendKeys("�����ҵ�ѽѽ��");
	//
	// try {
	// Thread.sleep(3000);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// driver.findElement(By.name("password")).sendKeys("xxxxxx");//���뱾��������
	// driver.findElement(By.className("loginnow")).click();
	//
	// }

}
