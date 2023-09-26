//import javafx.scene.control.Tab;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import java.util.Iterator;
//import java.util.Set;
//
//import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;
//import static java.awt.SystemColor.window;
//
//public class Invokingmultiplewindows {
//    public static void main(String[] args) {
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://rahulshettyacademy.com/angularpractice/");
//        driver.switchTo().newWindow(WindowType.TAB);
//       // driver.switchTo().newWindow();
//        Set<String> handels=driver.getWindowHandles();
//        Iterator<String> IT=handels.iterator();
//       String paerntwindowid= IT.next();
//      String childwindow= IT.next();
//      driver.switchTo().window(childwindow);
//      driver.get("https://courses.rahulshettyacademy.com/courses");
//      String coursename=driver.findElement(By.cssSelector("a[href='/p/postman-tutorial']")).getText();
//      driver.switchTo().window(paerntwindowid);
//      WebElement name=driver.findElement(By.cssSelector("[name='name']")).sendKeys(coursename);
//        namw.getrect().getdimesnion()
//      //driver.quit();
//    }
//}
