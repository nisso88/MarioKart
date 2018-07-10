import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
    }

    @After
    public void fin()
    {
        driver.quit();
    }
}
