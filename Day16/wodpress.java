// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class WordpresswalkthroughTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void wordpresswalkthrough() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1936, 1056));
    {
      WebElement element = driver.findElement(By.linkText("ಕನ್ನಡ"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("ravi tambade");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".MjjYud:nth-child(8) .LC20lb")).click();
    driver.findElement(By.id("s")).click();
    driver.findElement(By.id("s")).sendKeys("TAP");
    driver.findElement(By.id("searchsubmit")).click();
    driver.findElement(By.linkText("TAP your Potential")).click();
    js.executeScript("window.scrollTo(0,550.4000244140625)");
    driver.findElement(By.cssSelector(".entry-content > p:nth-child(3)")).click();
    driver.findElement(By.id("s")).click();
    driver.findElement(By.id("s")).sendKeys("ays see Job ads that say “Five years of experience required, Three to two years of experienced required”. Most of the time students ask me meaning of this statement in class room. Infact, now physical classroom has been transformed into Virtual Live Classroom. Learn from anywhere and teach from anywhere have become fact. Most of you are enjoying the benefits of Virtual Live Classroom, so do I. I look such ads and keep thinking what does it really mean? As I think, this sentence may give you number, but it tells you nothing.");
    driver.findElement(By.id("searchsubmit")).click();
    driver.findElement(By.cssSelector(".search")).click();
  }
}
