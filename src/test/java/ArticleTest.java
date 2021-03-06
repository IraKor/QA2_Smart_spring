import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArticleTest {
    private final String URL = "http://delfi.lv";
    private final By TITLE = By.xpath(".//h1[contains(@class,'headline_title')]");
    private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'd-inline')]");
    private final By COMMENT_COUNT = By.xpath(".//a[contains(@class, 'text-red-ribbon')]");
    private final By COMMENT_PAGE_TITLE = By.xpath(".//h1(@class = 'article-title']/a");

    private WebDriver driver;

    @Test
    public void articleTitleCheck() {
        //Set driver path
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");

        //Open Browser
        driver = new ChromeDriver();

        //Full screen
        driver.manage().window().maximize();

        //Open Home Page
        driver.get(URL);

        //Find first article title
        WebElement homePageTitle = driver.findElement(TITLE);

        //Save to String
        String homePageTitleTxt = driver.findElement(TITLE).getText();

        //click on article
        driver.findElement(TITLE).click();

        //Find Title
        WebElement articlePageTitle = driver.findElement(ARTICLE_PAGE_TITLE);

        //Save to string
        String articlePageTitleTxt = articlePageTitle.getText();

        //Check article title
        Assertions.assertEquals(homePageTitle, articlePageTitleTxt, "Wrong article page title!");

        //Find comment count
        WebElement commentCount = driver.findElement(COMMENT_COUNT);

        //click on comment count
        commentCount.click();

        //Find title
        String commentPageTitle = driver.findElement(COMMENT_PAGE_TITLE).getText();

        //Check title
        Assertions.assertEquals(homePageTitle, commentPageTitle, "Wrong comment page title!");

        //close browser
    }

    @AfterEach
    public void closeBrowser() {
        driver.close();
    }
}
