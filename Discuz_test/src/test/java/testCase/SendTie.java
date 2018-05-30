package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperFaTiePage;
import pageHelper.HelperLoginIndexPage;

/**
 * Created by lenovo on 2018/5/8.
 */
public class SendTie extends BasicTestCase{
    @Test
    public void sendTie(){
    //默认版块发帖
    HelperLoginIndexPage.morenLink(seleniumUtil);
    HelperFaTiePage.submitTie(seleniumUtil);
    }

}
