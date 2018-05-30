package testCase;

import org.testng.annotations.Test;
import org.w3c.css.sac.SACMediaList;
import pageHelper.*;

import java.util.Set;

/**
 * Created by lenovo on 2018/5/7.
 */
public class TestCase2 extends BasicTestCase{
    @Test
    public void adminLogin() throws InterruptedException {
        //登录
        HelperLoginPage.InputUsername(seleniumUtil,"admin");
        HelperLoginPage.InputPassword(seleniumUtil,"root");
        HelperLoginPage.loginSubmit(seleniumUtil);
        Thread.sleep(5000);
        HelperAdminIndexPage.morenLink(seleniumUtil);
        //删除帖子
        HelperAdminMorenPage.selectEle(seleniumUtil);
        HelperAdminMorenPage.delect(seleniumUtil);
        HelperAdminMorenPage.acceptDelete(seleniumUtil);
        //进入管理中心
        HelperAdminMorenPage.guanliClick(seleniumUtil);
        Set<String> winHandles=driver.getWindowHandles();
        for (String winHandle:winHandles){
            driver.switchTo().window(winHandle);
        }
        HelperGunliEnterPage.inputPassword(seleniumUtil,"root");
        HelperGunliEnterPage.submit(seleniumUtil);
        //进入论坛
        HelperGunLiZhongxinPage.luntan(seleniumUtil);

        driver.switchTo().frame("main");
        HelperLuntanPage.clickAdd(seleniumUtil);
        HelperLuntanPage.newBankuaiName(seleniumUtil,"版块一");
        HelperLuntanPage.submit(seleniumUtil);

        //退出
        String window=driver.getWindowHandle();
        driver.switchTo().window(window);
        HelperLuntanPage.exit(seleniumUtil);
        HelperAdminIndexPage.exit(seleniumUtil);
        //普通用户登录
        HelperLoginPage.InputUsername(seleniumUtil,"admin123");
        HelperLoginPage.InputPassword(seleniumUtil,"admin123");
        HelperLoginPage.loginSubmit(seleniumUtil);
        //进入新版块
        HelperAdminIndexPage.newModel(seleniumUtil);
        HelperFaTiePage.inputSubject(seleniumUtil,"believe");
        HelperFaTiePage.inputArea(seleniumUtil,"everything is best");
        HelperFaTiePage.submitTie(seleniumUtil);
        HelperAfterFaTiePage.morenLink(seleniumUtil);
        HelperFaTiePage.liulanTie(seleniumUtil);
        HelperAfterFaTiePage.huifuTie(seleniumUtil,"回复帖子test");
        //退出登录
        HelperAfterFaTiePage.exit(seleniumUtil);
    }
}
