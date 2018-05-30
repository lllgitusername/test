package pageHelper;

import page.GunLiZhongxinPage;
import page.LoginIndexPage;
import page.LoginPage;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HelperLoginIndexPage {
    //模块一登录后首页
    public static void morenLink(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(LoginIndexPage.MOREN,10);
        seleniumUtil.click(LoginIndexPage.MOREN);
    }
    public static void searchContent(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.waitForElementLoad(LoginIndexPage.SEARCH,10);
        seleniumUtil.sendKeys(LoginIndexPage.SEARCH,content);
    }
    public static void searchSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(LoginIndexPage.SEARCHSUB,10);
        seleniumUtil.click(LoginIndexPage.SEARCHSUB);
    }
    public static void enterFaTie(SeleniumUtil seleniumUtil){
        seleniumUtil.click(LoginIndexPage.FATIEIMG);
    }
}
