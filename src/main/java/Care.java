import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Care {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        //WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://staging-careportal.ambrygen.com/#/auth/login");
        //Thread.sleep(5000);
        //w.until(ExpectedConditions.visibilityOfElementLocated(by))
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("pradnya.ashte+adminstag@coditas.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Genome@123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label/span[1]")).click();
        //driver.findElement(By.id("mat-checkbox-149")).click();
        //driver.findElement(By.cssSelector("label.mat-checkbox-layout']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='anchor-link']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='anchor-link help-link']")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary btn-primary xl']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.cssSelector("input[type='email']")).sendKeys("pradnya.ashte+adminstag@coditas.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='email']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("pradnya.ashte+adminstag@coditas.com");
        driver.findElement(By.xpath("//SPAN[@CLASS='mat-button-wrapper']")).click();
        //driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pradnya.ashte+adminstag@coditas.com");
       // driver.findElement(By.xpath("//button/span[1]")).click();

        //Thread.sleep(5000);
        //driver.findElement(By.xpath("//button[@type='submit']/span[1]")).click();
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
        //driver.findElement(By.cssSelector(".mat-form-field-flex.ng-tns-c164-1")).sendKeys("pradnya.ashte+adminstag@coditas.com");
        // driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("pooo");
       // driver.findElement(By.cssSelector("mat-button-wrapper")).click();

    }
}
