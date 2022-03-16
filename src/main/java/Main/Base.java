package Main;

import Utilities.Elements;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class Base {

    Elements e= new Elements();
    public static WebDriver driver;

    @BeforeTest
    public void main() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://web.cartlow.lan/buyback/");
        Thread.sleep(1500);
        WebElement cross_button=driver.findElement(By.xpath(e.cross_button));
        cross_button.click();
    }
}
