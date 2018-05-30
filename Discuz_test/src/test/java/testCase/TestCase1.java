package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperAfterFaTiePage;
import pageHelper.HelperFaTiePage;
import pageHelper.HelperLoginIndexPage;
import pageHelper.HelperLoginPage;

/**
 * Created by lenovo on 2018/5/7.
 */
public class TestCase1 extends BasicTestCase {
    @Test
    public void login() throws InterruptedException {
        //登录
        HelperLoginPage.InputUsername(seleniumUtil,"admin123");
        HelperLoginPage.InputPassword(seleniumUtil,"admin123");
        HelperLoginPage.loginSubmit(seleniumUtil);
        Thread.sleep(5000);
        //默认版块发帖
        HelperLoginIndexPage.morenLink(seleniumUtil);
        HelperFaTiePage.inputSubject(seleniumUtil,"believe");
        HelperFaTiePage.inputArea(seleniumUtil,"everything is best");
        HelperFaTiePage.submitTie(seleniumUtil);
        Thread.sleep(3000);
        //默认版块回复贴
        HelperAfterFaTiePage.morenLink(seleniumUtil);
        Thread.sleep(3000);
        HelperFaTiePage.liulanTie(seleniumUtil);
        Thread.sleep(3000);
        HelperAfterFaTiePage.huifuTie(seleniumUtil,"回复帖子test");

    }
}
