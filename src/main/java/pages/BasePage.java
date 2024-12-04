package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }
    public static WebDriver initDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chromeOptions);
    }
    public void navigateTo(String url){
        driver.get(url);
    }
    public WebElement find (String locator){
    return  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public WebElement findClass (String locator){
        return  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
    }
    public void clicElement (String locator){
        find(locator).click();
    }

    public String capturaAtributo(String locator){
        return find(locator).getAttribute("textContent");
    }
    public void closeBrowser(){
        driver.quit();
         }
    public void clicJavas(String locator) {
        WebElement element = driver.findElement(By.xpath(locator));  // Localizar el elemento
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);  // Pasar el WebElement encontrado
    }
}

