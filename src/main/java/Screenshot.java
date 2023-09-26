import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {

//    public static void main(String[] args) throws IOException {
//
//        WebDriver driver=new FirefoxDriver();
//        driver.get("https://www.google.com");
//
//        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(file,new File("src/RR.jpg"));
//
//        driver.quit();
    //}
public static void main(String[] args) throws IOException {
    WebDriver driver=new FirefoxDriver();
    driver.get("https://www.google.com/");
    File file=( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file,new File("src/ee.png"));
    driver.quit();

}
}
