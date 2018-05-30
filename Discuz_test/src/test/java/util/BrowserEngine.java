package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by lenovo on 2018/5/8.
 */
public class BrowserEngine {
    public static String browserName;
    public static String url;
    public static WebDriver driver;
    public static Properties prop=null;
    public void initConfigData() throws IOException {
        prop=new Properties();
        //加载配置文件
        InputStream ips=new FileInputStream("./Browser.properties");
        prop.load(ips);
       // ips.close();
    }
//    static{
//        try {
//            prop=new Properties();
//            InputStream ips=new FileInputStream("./Browser.properties");
//            prop.load(ips);
//        }catch (IOException e){
//            e.getStackTrace();
//        }
//    }
    public String getDriver() throws IOException {
        initConfigData();
        browserName= prop.getProperty("browserName");

        return browserName;
    }
    public String getUrl() throws IOException {
        initConfigData();
        url=prop.getProperty("url");
        return url;
    }
}
