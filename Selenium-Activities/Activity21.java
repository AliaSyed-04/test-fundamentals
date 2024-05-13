import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.w3c.dom.html.HTMLInputElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.Set;

public class Activity21 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/tab-opener");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title is: " + pageTitle);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String parent_handles = driver.getWindowHandle();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"launcher\"]"));
        element.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> handles = driver.getWindowHandles();




    }

}
