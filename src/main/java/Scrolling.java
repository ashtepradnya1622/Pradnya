//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import java.util.List;
//
//public class Scrolling {
//
//    public static void main(String[] args) throws InterruptedException
//    {
//       // ChromeOptions chromeoptions =new ChromeOptions();
////chromeoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
////chromeoptions.addArguments("--remote-allow-origins=*");
////       ChromeOptions op = new ChromeOptions();
//       // chromeoptions.setBinary("C:\\Users\\Coditas\\Downloads\\V4-Automation-master\\V4-Automation-master\\V4-Automation-master\\src\\main\\resources\\chrome\\chrome.exe");
//        //WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//        driver.manage().window().maximize();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,600)");
//        Thread.sleep(4000);
//        js.executeScript("document.querySelector('.tableFixHead').scrollTop=6000");
//        //List <WebElement >values =driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
//        //int sum =0;
//        //for (int i=0;i<values.size();i++)
//        //{
//            //sum = sum+Integer.parseInt(values.get(i).getText());
//           // System.out.println(sum);
//       // }
//
//
//    }
//}
//
//
