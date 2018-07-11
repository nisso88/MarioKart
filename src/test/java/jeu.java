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

        Actions actions = new Actions(driver);

        WebElement categories = driver.findElement(By.id("nav-shop"));
        actions.moveToElement(categories);
        actions.build().perform();

        WebElement livres = driver.findElement(By.cssSelector("span[data-nav-panelkey='VideogamesConsolesPanel']"));
        actions.moveToElement(livres).build().perform();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-flyout-shopAll>.nav-subcats")));

        WebElement NintendoSwitch = driver.findElement(By.linkText("Nintendo Switch"));
        NintendoSwitch.click();

        WebElement catjeux = driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[2]/div"));
        actions.moveToElement(catjeux).build().perform();
        catjeux.click();


        WebElement N1ventes = driver.findElement(By.cssSelector("h2[data-attribute=\"Mario Kart 8 Deluxe\"]"));
        actions.moveToElement(N1ventes).build().perform();
        N1ventes.click();


        

    }

    @After
    public void fin()
    {
        driver.quit();
    }
}
