//import java.time.Duration;
//
//import dev.failsafe.internal.util.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//
//
//public class Locators3 {
//    public static void main(String[] args) throws InterruptedException {
//
//        {
//            String name = "rahul";
//            ChromeOptions op = new ChromeOptions();
//            op.setBinary("C:\\Users\\Coditas\\Downloads\\V4-Automation-master\\V4-Automation-master\\V4-Automation-master\\src\\main\\resources\\chrome\\chrome.exe");
//            WebDriver driver = new ChromeDriver(op);
//
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//            driver.get("https://rahulshettyacademy.com/locatorspractice/");
//
//            driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//
//            driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
//
//            driver.findElement(By.className("signInBtn")).click();
//
//            Thread.sleep(2000);
//
//            System.out.println(driver.findElement(By.tagName("p")).getText());
//
//            Assert.state(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
//
//            Assert.state(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
//
//            driver.findElement(By.xpath("//*[text()='Log Out']")).click();
//
//            driver.close();
//
//
//        }
//
//
//        public static String getPassword (WebDriver driver) throws InterruptedException
//
//        {
//
//            driver.get("https://rahulshettyacademy.com/locatorspractice/");
//
//            driver.findElement(By.linkText("Forgot your password?")).click();
//
//            Thread.sleep(1000);
//
//            driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//
//            String passwordText = driver.findElement(By.cssSelector("form p")).getText();
//
//            //Please use temporary password 'rahulshettyacademy' to Login.
//
//            String[] passwordArray = passwordText.split("'");
//
//            String[] passwordArray2 = passwordArray[1].split("'");
//
//            //passwordArray2[0]
//
//            String password = passwordArray[1].split("'")[0];
//
//            return password;
//
//           // 0 th index -Please use temporary password
//
//            //1 st index -rahulshettyacademy ' to Login.
//
//
//           // 0 th index -rahulshettyacademy
//
//            //1 st index -to Login.
//        }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//
