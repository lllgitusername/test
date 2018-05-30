package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import util.LogConfiguration;
import util.SeleniumUtil;

import java.io.IOException;

/**
 * Created by lenovo on 2018/5/7.
 */
public class BasicTestCase {
    public static WebDriver driver=null;
    public static SeleniumUtil seleniumUtil=null;
    @BeforeMethod
    public void setUP() throws IOException {
        LogConfiguration.initLog();
        seleniumUtil=new SeleniumUtil();

        driver=seleniumUtil.getDriver();
        seleniumUtil.openUrl();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
