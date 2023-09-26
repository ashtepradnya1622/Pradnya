import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.findElement(By.id("ap_email")).sendKeys("ashtepradnya1622@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pradnya@123");
        driver.findElement(By.id("signInSubmit")).click();
        Actions a=new Actions(driver);
        a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")),"Womenstop").doubleClick().build().perform();

    }
}
