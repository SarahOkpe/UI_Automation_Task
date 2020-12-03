package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    //import selenium driver
    private WebDriver driver;

    //import chrome driver
    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        //fetch URL
        driver.get("https://www.facebook.com/");

        //make the page wait a while for URL to load
        Thread.sleep(5000);

        //maximize page
        driver.manage().window().maximize();

        //fetch page title
        System.out.println(driver.getTitle());

        //make the page to wait a while for URL to fully load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //locate email field
        driver.findElement(By.id("email")).sendKeys("08065971269");

        //locate password field
        driver.findElement(By.id("pass")).sendKeys("freedom2012");

        //locate button field
        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();


    }
    //close browser
    public static void main(String[] args) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }

    /* quit browser */

    @AfterClass
    public void tearDown() {
        driver.quit();
    }




}
