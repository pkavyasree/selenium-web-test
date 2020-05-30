import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
  
public class HeadlessTest {
  Logger log = LoggerFactory.getLogger(HeadlessTest.class);
  
  @Test
  public void HeadlessChromeDriverTest() throws IOException {
  
  System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
  ChromeOptions chromeOptions = new ChromeOptions();
  chromeOptions.addArguments("--headless");
  
  WebDriver driver = new ChromeDriver(chromeOptions);
  driver.get("http://bimarian.com");
  System.out.println("Chrome browser opened and navigated to Bimarian site");
  driver.quit();
  }
  }
