package ac;

   import..
 
 16 
 17 public class HeadlessTest {
 18 Logger log = LoggerFactory.getLogger(HeadlessTest.class);
 19 
 20 @Test
 21 public void HeadlessChromeDriverTest() throws IOException {
 22 
 23 System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
 24 ChromeOptions chromeOptions = new ChromeOptions();
 25 chromeOptions.addArguments("--headless");
 26 
 27 WebDriver driver = new ChromeDriver(chromeOptions);
 28 driver.navigate().to("https://www.avenuecode.com/");
 29 
 30 String pageTitle = driver.getTitle();
 31 log.info("Page opened: {}", pageTitle);
 32 
 33 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 34 //copying the file into /screenshots directory
 35 FileUtils.copyFile(scrFile, new File("output/screenshots/homepage.png"));
 36 
 37 Assert.assertTrue(pageTitle.contains("Trusted Advisors for E-Commerce | Avenue Code"));
 38 log.info("Quitting driver");
 39 driver.quit();
 40 }
 41 }
