/**
 * @author ������ on 2016/11/15
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

	private static String userId = "�����ҵ�ѽѽ��";
	private static String password = "XXXXXX";// ���벻��͸¶��Ǹ����������

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
		driver.findElement(By.name("password")).sendKeys(pwd);// ���뱾��������
		driver.findElement(By.className("loginnow")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	// ������������������������ٶ�һ�±����Ƿ�һ��
	public static void Search() {
		WebElement webElement = driver.findElement(By.name("word"));
		webElement.sendKeys("������");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webElement.submit();

	}

	// ���Բ�����ֱ�ӵ�����
	public static void DirectClick() {
		WebElement webElement = driver.findElement(By.name("word"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webElement.submit();// ����������ֱ�ӵ������
		// System.out.println(driver.getTitle());

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �����������������������
	public static void SearchMax() {
		WebElement webElement = driver.findElement(By.name("word"));
		webElement
				.sendKeys("������ ���� ��������,�Գ�ͤ��.�����Ъ,������������,��������,���۴߷�.ִ���࿴����,��������ҭ.��ȥȥ,ǧ���̲�,ĺ������������.�����Թ������,���ǿ�,���������.�������Ѻδ�?������,�������.��ȥ����,Ӧ�������þ�����.������ǧ�ַ���,�������˵! ������ ���� ��������,�Գ�ͤ��.�����Ъ,������������,��������,���۴߷�.ִ���࿴����,��������ҭ.��ȥȥ,ǧ���̲�,ĺ������������.�����Թ������,���ǿ�,���������.�������Ѻδ�?������,�������.��ȥ����,Ӧ�������þ�����.������ǧ�ַ���,�������˵!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ���Ե���ٶ�һ�°�ť�����������������
	public static void SearchClickMax() {
		WebElement webElement = driver.findElement(By.name("word"));
		webElement
				.sendKeys("������ ���� ��������,�Գ�ͤ��.�����Ъ,������������,��������,���۴߷�.ִ���࿴����,��������ҭ.��ȥȥ,ǧ���̲�,ĺ������������.�����Թ������,���ǿ�,���������.�������Ѻδ�?������,�������.��ȥ����,Ӧ�������þ�����.������ǧ�ַ���,�������˵! ������ ���� ��������,�Գ�ͤ��.�����Ъ,������������,��������,���۴߷�.ִ���࿴����,��������ҭ.��ȥȥ,ǧ���̲�,ĺ������������.�����Թ������,���ǿ�,���������.�������Ѻδ�?������,�������.��ȥ����,Ӧ�������þ�����.������ǧ�ַ���,�������˵!");
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

	// ���������������һ���ַ���Ϊһ�����ּ���
	public static void SearchFirst() {
		WebElement webElement = driver.findElement(By.name("word"));
		webElement
				.sendKeys("#������ ���� ��������,�Գ�ͤ��.�����Ъ,������������,��������,���۴߷�.ִ���࿴����,��������ҭ.��ȥȥ,ǧ���̲�,ĺ������������.�����Թ������,���ǿ�,���������.�������Ѻδ�?������,�������.��ȥ����,Ӧ�������þ�����.������ǧ�ַ���,�������˵! ������ ���� ��������,�Գ�ͤ��.�����Ъ,������������,��������,���۴߷�.ִ���࿴����,��������ҭ.��ȥȥ,ǧ���̲�,ĺ������������.�����Թ������,���ǿ�,���������.�������Ѻδ�?������,�������.��ȥ����,Ӧ�������þ�����.������ǧ�ַ���,�������˵!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ���Ե���ٶ�һ�°�ť��������ո�ϲ�
	public static void BlankMerge() {
		WebElement webElement = driver.findElement(By.name("word"));
		webElement
				.sendKeys("�����������������жԳ�ͤ�������Ъ������ �����������������۴߷�                                                                                                                               ִ���࿴���۾�");
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

	// ���������������
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
