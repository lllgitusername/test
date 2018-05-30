package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperFaTieVotePage;
import pageHelper.HelperLoginIndexPage;
import pageHelper.HelperLoginPage;
import pageHelper.HelperPostVotePage;

/**
 * Created by lenovo on 2018/5/9.
 */
public class TestCase4 extends BasicTestCase {
    @Test
    public static void vote() throws InterruptedException {
        //登录
        HelperLoginPage.InputUsername(seleniumUtil,"admin123");
        HelperLoginPage.InputPassword(seleniumUtil,"admin123");
        HelperLoginPage.loginSubmit(seleniumUtil);
        //发起投票
        Thread.sleep(3000);
        HelperLoginIndexPage.morenLink(seleniumUtil);
        HelperLoginIndexPage.enterFaTie(seleniumUtil);
        HelperFaTieVotePage.clickFaQi(seleniumUtil);
        HelperFaTieVotePage.subject(seleniumUtil,"vote2");
        HelperFaTieVotePage.select1(seleniumUtil,"basketball");
        HelperFaTieVotePage.select2(seleniumUtil,"baseball");
        HelperFaTieVotePage.submit(seleniumUtil);
        HelperPostVotePage.selectRadio1(seleniumUtil);
        HelperPostVotePage.submit(seleniumUtil);
        HelperPostVotePage.getSelect1(seleniumUtil);
        HelperPostVotePage.getSelect2(seleniumUtil);
        HelperPostVotePage.getSubject(seleniumUtil);
    }
}
