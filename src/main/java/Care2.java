import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Care2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        //WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://staging-careportal.ambrygen.com/#/auth/login");
        //Thread.sleep(5000);
        //w.until(ExpectedConditions.visibilityOfElementLocated(by))
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("pradnya.ashte+adminstag@coditas.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Genome@123");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//label/span[1]")).click();
        driver.findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
//            Actions a=new Actions(driver);
//            (driver.findElement(By.xpath("//span[@class='link-text ng-tns-c584-88 ng-star-inserted']");
        Thread.sleep(2000);
        //driver.switchTo().frame (driver.findElements(By.cssSelector("div[class='no-print ng-tns-c570-5'] span"));
        driver.findElement(By.cssSelector("span[style='margin-right: 30px;']")).click();
        //driver.switchTo().frame(driver.findElement(By.id("#mat-select-value-19")));

//            WebElement staticdropdown =driver.findElement(By.id("#mat-select-value-19"));
//            Select dropdown=new Select(staticdropdown);
//            dropdown.selectByIndex(0);
//            System.out.println(dropdown.getFirstSelectedOption().getText());


    }
}
