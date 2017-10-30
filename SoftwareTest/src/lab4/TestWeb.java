//package lab4;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.Assert;
//import com.thoughtworks.selenium.SeleneseTestBase;
//import com.thoughtworks.selenium.DefaultSelenium;
//
//public class TestWeb extends SeleneseTestBase {
//
//	DefaultSelenium selenium = null;
//
//	@Before
//	public void setUp() throws Exception {
//		selenium = new DefaultSelenium("localhost", 4444,
//				"*firefox3 D:\\Program Files\\Mozilla Firefox\\firefox.exe",
//				"http://www.baidu.com");
//		selenium.start();
//	}
//
//	@Test
//	public void testBaiduSearch() throws Exception {
//		selenium.open("http://www.baidu.com");
//		Thread.sleep(5000);
//		selenium.type("id=kw1", "selenium");
//		selenium.click("id=su1");
//		Thread.sleep(5000);
//		Assert.assertEquals("selenium_°Ù¶ÈËÑË÷", selenium.getTitle());
//		Thread.sleep(5000);
//
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		selenium.stop();
//	}
//
//}
//
//// Notice:
// // selenium.waitForPageToLoad("50000"); is no use, so use Thread.sleep
