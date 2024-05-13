/*
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class CheeseWebsite {

    WebDriver driver;

    @BeforeClass
    public void op_br(){
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://www.google.com/search?client=firefox-b-d&q=Cheese");
    }
    @Test
    public void about_page(){

        WebElement ab_pg = driver.findElement(By.id("result-stats"));

        System.out.println(ab_pg.getText());
    }

    @AfterClass
    public void cl_br(){
        driver.close();
    }
}
*/
