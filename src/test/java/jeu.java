import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jeu {

    WebDriver driver;

    @Before
    public void init()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.fr/");

    }


    @Test
    public void test(){
        WebElement categories = driver.findElement(By.id("nav-shop"));

        Actions actions = new Actions(driver);
        actions.moveToElement(categories);
        actions.build().perform();
        WebElement livres = driver.findElement(By.cssSelector("span[data-nav-panelkey='VideogamesConsolesPanel']"));
        actions.moveToElement(livres).build().perform();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-flyout-shopAll>.nav-subcats")));

        WebElement NintendoSwitch = driver.findElement(By.linkText("Nintendo Switch"));

        NintendoSwitch.click();

    }

    @After
    public void fin()
    {
        driver.quit();
    }
}
