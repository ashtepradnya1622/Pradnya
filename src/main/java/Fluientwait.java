//import com.sun.deploy.security.SelectableSecurityManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//
//import java.time.Duration;
//import java.util.NoSuchElementException;
//import java.util.function.Function;
//
//twait {
//    public static void main(String[] args) throws InterruptedException {
//
//        {
//            ChromeOptions op = new ChromeOptions();
//            op.setBinary("C:\\Users\\Coditas\\Downloads\\V4-Automation-master\\V4-Automation-master\\V4-Automation-master\\src\\main\\resources\\chrome\\chrome.exe");
//            WebDriver driver = new ChromeDriver(op);
//            driver.get("https://the-internet.herokuapp.cpublic class Fluienom/dynamic_loading/1");
//            driver.findElement(By.cssSelector("[id=start] button")).click();
//
//            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                    .withTimeout(Duration.ofSeconds(30))
//                    .pollingEvery(Duration.ofSeconds(5))
//                    .ignoring(NoSuchElementException.class);
//            WebElement foo = wait.until(new Function<WebDriver, WebElement>()
//            {
//                public WebElement apply(WebDriver driver) {
//                    return driver.findElement(By.cssSelector("[id='finish'] h4"));
//                }
//            });
//            System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4"))).;
//        }
//    }
//}
//
//
//
//
