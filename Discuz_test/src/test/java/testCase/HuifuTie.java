package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperAfterFaTiePage;
import pageHelper.HelperFaTiePage;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HuifuTie extends BasicTestCase {
    @Test
    public void huifuTie() throws InterruptedException {
        //默认版块回复贴
        HelperAfterFaTiePage.morenLink(seleniumUtil);
        Thread.sleep(3000);
        HelperFaTiePage.liulanTie(seleniumUtil);
        Thread.sleep(3000);
        HelperAfterFaTiePage.huifuTie(seleniumUtil,"回复帖子test");
        //退出
        HelperAfterFaTiePage.exit(seleniumUtil);

    }
}
