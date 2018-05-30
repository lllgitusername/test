package pageHelper;

import page.AdminIndexPge;
import page.LoginIndexPage;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HelperAdminIndexPage {
    public static void morenLink(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(AdminIndexPge.MOREN,10);
        seleniumUtil.click(AdminIndexPge.MOREN);
    }
    public static void newModel(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(LoginIndexPage.NEWMODEL,10);
        seleniumUtil.click(LoginIndexPage.NEWMODEL);
    }
    public static void exit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(AdminIndexPge.EXIT,10);
        seleniumUtil.click(AdminIndexPge.EXIT);
    }
}
