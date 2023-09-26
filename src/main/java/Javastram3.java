import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class Javastram3 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.id("search-field")).sendKeys("rice");
       List<WebElement>veggies= driver.findElements(By.xpath("//tr/td[1]"));
      List<WebElement>filterdlist =veggies.stream().filter(veggie->veggie.getText().contains("rice")).collect(Collectors.toList());
        Assert.assertEquals(veggies.size(),filterdlist.size());
    }
}
