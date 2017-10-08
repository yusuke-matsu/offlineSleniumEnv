
import static org.junit.Assert.*;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seletest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  /**
   * chrome driverの読み込み
   * @see <a href="URL">https://www.google.co.jp/</a>
   * @throws Exception [description]
   */
  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
  System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
	 // chromeDriverのパス
	driver = new ChromeDriver();
    baseUrl = "https://www.google.co.jp/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }


  /**
   * お勉強用のテストケース
   * @author yusuke matsugaya
   * @version 1.0.0
   *
   * @throws Exception chrome 読み込みケースの失敗
   */
  @Test
  public void test() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("こんにちは");
    driver.findElement(By.cssSelector("span.csb.ch")).click();
    driver.findElement(By.xpath("//table[@id='nav']/tbody/tr/td[4]/a/span")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
