import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.xml.bind.Element;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Relativeloc2 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement nameEditbox =driver.findElement(By.cssSelector("input[name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditbox)).getText());
        WebElement dateofbirth =driver.findElement(By.cssSelector("label[for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(dateofbirth)).click();
       WebElement iceCreamlabel= driver.findElement(By.cssSelector("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamlabel)).click();
       WebElement radiobutton=driver.findElement(By.id("inlineRadio1"));
       System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radiobutton)).getText());
        //driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();



        //WebElement rdb = driver.findElement(By.id("inlineRadio1"));



       // System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
    }
}

