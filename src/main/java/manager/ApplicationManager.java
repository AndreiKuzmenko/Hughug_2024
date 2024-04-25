package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    HelperUser user;


    public HelperUser getUser() {
        return user;

    }


    @BeforeSuite
    public void init(){
        wd = new ChromeDriver();
        user = new HelperUser(wd);
        wd.manage().window().maximize();
        wd.navigate().to("https://nohehug.co.il/");
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterSuite
    public void tearDown(){
        wd.quit();
    }
}
