/*
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testing5 {
    WebDriver driver;

    @BeforeClass (alwaysRun = true)
    public void beforeMethod(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }
    @Test (groups = {"Header Tests","Button Tests"})
    public void pageTitle(){
        driver.getTitle();
        System.out.println("The Page Title is: "+driver.getTitle());
    }
    @Test (dependsOnMethods = {"pageTitle"}, groups = {"Header Tests"})
    public void test_header(){
        WebElement header_3 = driver.findElement(By.xpath("//*[@id=\"third-header\"]"));
        System.out.println(header_3.getText());
        Assert.assertEquals("Third header", header_3.getText());

    }
    @Test (dependsOnMethods = {"pageTitle"}, groups = {"Header Tests"})
    public void color_test(){
        WebElement header_color = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));

        System.out.println(header_color.getCssValue("color"));
        Assert.assertEquals("#21ba45", header_color.getCssValue("color"));
    }
    @Test (dependsOnMethods = {"pageTitle"}, groups = {"Button Tests"})
    public void olive(){
        WebElement olive_btn = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/button[4]"));
        System.out.println(olive_btn.getText());
        Assert.assertEquals("Olive",olive_btn.getText());
    }
    @Test
    public void
}
*/
