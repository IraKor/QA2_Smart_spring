import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelfiFirstTest {



    private final By TITLE = By.xpath(".//h1[contains(@class, 'headline__title')]");

    @Test
    public void delfiFirstTest() {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.delfi.lv");

        WebElement firstTitle = driver.findElement(TITLE);
        String titleText = firstTitle.getText();

    }
}
