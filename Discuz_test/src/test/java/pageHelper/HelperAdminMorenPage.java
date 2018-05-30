package pageHelper;

import page.AdminMorenPage;
import page.LoginPage;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HelperAdminMorenPage {
    public static void selectEle(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(AdminMorenPage.SELECT,10);
        seleniumUtil.click(AdminMorenPage.SELECT);
      }
    public static void delect(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(AdminMorenPage.DELETE,10);
        seleniumUtil.click(AdminMorenPage.DELETE);
    }
    public static void acceptDelete(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(AdminMorenPage.ACCEPT,10);
        seleniumUtil.click(AdminMorenPage.ACCEPT);
    }
    public static void guanliClick(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(AdminMorenPage.GUANLIZHONGXIN,10);
        seleniumUtil.click(AdminMorenPage.GUANLIZHONGXIN);
    }
}
