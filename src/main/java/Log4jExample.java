import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Log4jExample {
    public static void main(String args[]) {
        Logger logger = Logger.getLogger("Log4jDemo");
        PropertyConfigurator.configure("C:\\Users\\win\\IdeaProjects\\LOG4J\\src\\main\\java\\log4j.properties");
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(TimeOuts,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://google.com/");
        logger.debug("open website");
        driver.navigate().to("https://www.facebook.com/");
        logger.debug("open website");
        driver.manage().window().maximize();
        logger.info("Maximize the website");
        driver.findElement(By.id("email")).sendKeys("poojamehesare@gmail.com");
        logger.warn("entering username");
        driver.close();
    }
}
