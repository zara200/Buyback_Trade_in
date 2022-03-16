package Modules;

import Main.Base;
import Utilities.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Process extends Base {
    Elements e = new Elements();

    @Test(priority = 1)
    public void Select_Mobile_Category() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(1500);
        WebElement Mobile = driver.findElement(By.xpath(e.Mobile));
        Mobile.click();
    }

    @Test(priority = 2)
    public void Mobile_brand_click() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(1500);
        WebElement brand = driver.findElement(By.xpath(e.brand));
        brand.click();
    }

    @Test(priority = 3)
    public void select_Mobile_brand() throws InterruptedException {
        Thread.sleep(1500);
        Select select_brand = new Select(driver.findElement(By.xpath(e.brand)));
        select_brand.selectByIndex(2);
    }

    @Test(priority = 4)
    public void Click_device() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(1500);
        WebElement device = driver.findElement(By.xpath(e.device));
        device.click();

    }
    @Test(priority = 5)
    public void select_device_dropdown() throws InterruptedException {
        Thread.sleep(1500);
        Select select_device = new Select(driver.findElement(By.xpath(e.device)));
        select_device.selectByIndex(4);
}
    @Test(priority = 6)
    public void Sign_in() throws InterruptedException {

        Thread.sleep(1500);
        WebElement sign_in = driver.findElement(By.xpath(e.sign_in));
        sign_in.click();

        Thread.sleep(1500);
        WebElement email = driver.findElement(By.xpath(e.email));
        email.click();
        email.sendKeys("Zara@cartlow.com");

        Thread.sleep(1500);
        WebElement password = driver.findElement(By.xpath(e.password));
        password.click();
        password.sendKeys("demo101");

        Thread.sleep(1500);
        WebElement sign_in_button = driver.findElement(By.xpath(e.sign_in_button));
        sign_in_button.click();
    }
    @Test(priority = 7)
    public void address() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(1500);
        WebElement proceed_to_pickup = driver.findElement(By.xpath(e.proceed_to_pickup));
        proceed_to_pickup.click();
    }

    @Test(priority = 8)
    public void select_address() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)", "");
        Thread.sleep(1500);
        WebElement select_address = driver.findElement(By.xpath(e.select_address));
        select_address.click();
    }

    @Test(priority = 9)
    public void TextVisibility() throws InterruptedException {
        Thread.sleep(15000);
        WebElement msg = driver.findElement(By.xpath(e.text));
        String text = msg.getText();
        Assert.assertEquals(text, "Your order has been recieved, We will schedule pickup soon. Pack your item in a box properly and paste the airway bill on it", "Not found");
        System.out.println(text);
    }

}