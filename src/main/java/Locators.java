//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import java.time.Duration;
//
//public class Locators {
//    public static void main(String[] args) {
//        ChromeOptions op = new ChromeOptions();
//        op.setBinary("C:\\Users\\Coditas\\Downloads\\V4-Automation-master\\V4-Automation-master\\V4-Automation-master\\src\\main\\resources\\chrome\\chrome.exe");
//        WebDriver driver = new ChromeDriver(op);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get("https://rahulshettyacademy.com/locatorspractice/");
//        driver.findElement(By.id("inputUsername")).sendKeys("Pradnya");
//        driver.findElement(By.name("inputPassword")).sendKeys("Admin@123");
        //driver.findElement(By.className("submit")).click();
//        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//        driver.findElement(By.linkText("Forgot your password?")).click();
//        //Thread.sleep(4000);
//        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("priyajohn");
//        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Pragya@gmail.com");
//        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9075524067");
//        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//
//        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//
//        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//
//        Thread.sleep(1000);
//
//        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//
//        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
//
//        driver.findElement(By.id("chkboxOne")).click();
//
//        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
//        driver.findElement(By.className("signInBtn")).click();
//
//        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//
//        driver.findElement(By.linkText("Forgot your password?")).click();
//
////        Thread.sleep(1000);//
//
//        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
//
//        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
//
//        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//
//        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
//
//        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
//
//        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//
//        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//
//        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//
//        Thread.sleep(1000);
//
//        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//
//        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
//
//        driver.findElement(By.id("chkboxOne")).click();
//
//        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
//
//    }
//}
//
