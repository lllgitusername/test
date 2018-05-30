package testCase;

import org.testng.annotations.Test;
import pageHelper.*;

import java.util.Set;

/**
 * Created by lenovo on 2018/5/8.
 */
public class GuanLiTestCase extends BasicTestCase {
    @Test
    public void addModel() throws InterruptedException {
        //进入管理中心
        HelperAdminMorenPage.guanliClick(seleniumUtil);
        Set<String> winHandles=driver.getWindowHandles();
        for (String winHandle:winHandles){
            driver.switchTo().window(winHandle);
        }
        Thread.sleep(3000);
        HelperGunliEnterPage.inputPassword(seleniumUtil,"admin");
        HelperGunliEnterPage.submit(seleniumUtil);
        Thread.sleep(10000);
        //进入论坛
        HelperGunLiZhongxinPage.luntan(seleniumUtil);
        Thread.sleep(5000);
        driver.switchTo().frame("main");
        HelperLuntanPage.clickAdd(seleniumUtil);
        HelperLuntanPage.newBankuaiName(seleniumUtil,"版块一");
        HelperLuntanPage.submit(seleniumUtil);
        Thread.sleep(10000);
        //退出
        String window=driver.getWindowHandle();
        driver.switchTo().window(window);
        HelperLuntanPage.exit(seleniumUtil);
        HelperAdminIndexPage.exit(seleniumUtil);
    }
}
