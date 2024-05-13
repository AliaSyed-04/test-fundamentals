import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.w3c.dom.html.HTMLInputElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class suiteCRM {

    WebDriver driver;

    @BeforeClass
    public void () {
        WebDriverManager.firefoxdriver().setup();

        driver.get("https://alchemy.hguy.co/crm/");
        //printing the pageTitle
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);

    }
}





