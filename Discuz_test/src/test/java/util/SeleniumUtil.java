package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.IOException;
import java.util.List;

/**
 * Created by lenovo on 2018/5/7.
 */
public class SeleniumUtil {

    Logger log=Logger.getLogger(SeleniumUtil.class);
    WebDriver driver=null;
    BrowserEngine browserEngine=new BrowserEngine();
//    public WebDriver getDriver(String inputDriver){
//        if(inputDriver.equals("chrome")){
//            driver=new ChromeDriver();
//            log.info("启动谷歌浏览器");
//        }else if(inputDriver.equals("fireFox")){
//            driver=new FirefoxDriver();
//            log.info("启动火狐浏览器");
//        }else{
//            log.info("没有可识别的浏览器");
//        }
//        return driver;
//    }
    public WebDriver getDriver() throws IOException {
        String browserName=browserEngine.getDriver();
        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
            driver=new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
            driver=new FirefoxDriver();
        }
        log.info("启动浏览器");
        return driver;
    }
    public WebElement findElement(By by){
        WebElement ele=null;
        try{
            ele=driver.findElement(by);
            log.info("查找元素"+getLocaterEle(ele,">"));
        }catch (NoSuchElementException e){
            log.error("未找到元素");
            e.getStackTrace();
        }
        return ele;
    }
    /**设置显示等待元素*/
    public void waitForElementLoad(final By by, int timeOut){
        log.info("开始查找元素："+by);
        try{
            WebDriverWait wait = new WebDriverWait(driver, timeOut, 1000);
            wait.until(new ExpectedCondition<Boolean>() {

                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        } catch (TimeoutException e){
            log.error("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
            Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
        }
        log.info("找到了元素 [" + by + "]");
    }

    public void openUrl() throws IOException {
        String url=browserEngine.getUrl();
        driver.get(url);
        log.info("打开网址"+url);
    }
    public String getLocaterEle(WebElement element,String expectedText){
        String eleText=element.toString();
        String subEle=null;
        try{
            subEle=eleText.substring(eleText.indexOf(expectedText)+1,eleText.length()-1);
            //log.info("查找到元素信息"+subEle);
        }catch (Exception e){
            log.error("查找"+expectedText+"失败");
        }
        return subEle;
    }
    public List<WebElement> findElements(By by){
        List<WebElement> elements=driver.findElements(by);
        log.info("查找一组元素");
        return elements;
    }
    public void clear(By by){
        WebElement ele=findElement(by);
        ele.clear();
        log.info("清空元素"+getLocaterEle(ele,">")+"上的内容");
    }
    public void click(By by){
        WebElement ele=findElement(by);
        ele.click();
        log.info("点击元素"+getLocaterEle(ele,">"));
    }
    public void sendKeys(By by,String content){
        WebElement ele=findElement(by);
        clear(by);
        ele.sendKeys(content);
        log.info("给元素"+getLocaterEle(ele,">")+"输入内容"+content);
    }
    public String getText(By by){
        WebElement ele=findElement(by);
        String text=ele.getText();
        log.info("获取元素文本："+text);
        return text;
    }
    public void assertTitle(String expectedTitle){
        String actual=driver.getTitle();
        try{
            Assert.assertEquals(actual,expectedTitle);

        }catch (AssertionError e){
            log.error("预期文字是：["+expectedTitle+"],但实际文字是: ["+actual+"]");
            Assert.fail("预期文字是：["+expectedTitle+"],但实际文字是: ["+actual+"]");
        }
        log.info("查找到预期标题："+expectedTitle);
    }
    public void assertTitle(String actualTitle,String expectedTitle){
        try{
            Assert.assertEquals(actualTitle,expectedTitle);

        }catch (AssertionError e){
            log.error("预期文字是：["+expectedTitle+"],但实际文字是: ["+actualTitle+"]");
            Assert.fail("预期文字是：["+expectedTitle+"],但实际文字是: ["+actualTitle+"]");
        }
        log.info("查找到预期标题："+expectedTitle);
    }
    public boolean isExist(By by){
        WebElement ele=null;
        try {
            ele = driver.findElement(by);
            log.info("找到元素");
            return true;

        }catch(NoSuchElementException e){
            e.printStackTrace();
            log.error("未找到元素");
            return false;
        }
    }
    public void isassertForText(String expected,By by){
        try{
            WebElement ele=driver.findElement(by);
            String actual=ele.getText();
            Assert.assertEquals(actual, expected);
            log.info("找到了期望的文字"+expected);
        }catch (AssertionError e){
            log.error("未找到期望的文字是"+expected);
        }

    }



}
