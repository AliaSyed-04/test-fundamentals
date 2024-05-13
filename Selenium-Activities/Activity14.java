/*
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.List;

public class Activity14 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Actions action = new Actions(driver);
        // Open the browser
        driver.get("https://v1.training-support.net/selenium/tables");

        // get the title of the page
        System.out.println(driver.getTitle());

        Actions action = new Actions(driver);

        //Using Xpaths on the second table

        //1. Find the number of rows
        List<WebElement> rows = driver.findElement(By.xpath("//table[@class='sortableTable']/tbody/tr"));
        System.out.println("Rows: "+rows.size());



    }
}
*/
