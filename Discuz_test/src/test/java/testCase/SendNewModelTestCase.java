package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperAdminIndexPage;
import pageHelper.HelperAfterFaTiePage;
import pageHelper.HelperFaTiePage;

/**
 * Created by lenovo on 2018/5/9.
 */
public class SendNewModelTestCase extends BasicTestCase{
    @Test
    public void sendNewModel(){
        //进入新版块
        HelperAdminIndexPage.newModel(seleniumUtil);
        HelperFaTiePage.submitTie(seleniumUtil);
        HelperAfterFaTiePage.morenLink(seleniumUtil);
        HelperFaTiePage.liulanTie(seleniumUtil);
        HelperAfterFaTiePage.huifuTie(seleniumUtil,"回复帖子test");
        //退出登录
        HelperAfterFaTiePage.exit(seleniumUtil);
    }
}
