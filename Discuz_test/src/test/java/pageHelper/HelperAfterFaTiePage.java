package pageHelper;

import page.*;
import util.LogConfiguration;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HelperAfterFaTiePage {
    //模块一回帖
    public static void morenLink(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(LoginIndexPage.MOREN,10);
        seleniumUtil.click(LoginIndexPage.MOREN);
    }
    public static void huifuTie(SeleniumUtil seleniumUtil,String huifu){
        seleniumUtil.waitForElementLoad(AfterFaTiePge.TEXTAREA,10);
        seleniumUtil.sendKeys(AfterFaTiePge.TEXTAREA,huifu);
        seleniumUtil.waitForElementLoad(AfterFaTiePge.SUBMITTEXT,10);
        seleniumUtil.click(AfterFaTiePge.SUBMITTEXT);
    }
    public static void exit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(AfterFaTiePge.EXIT,10);
        seleniumUtil.click(AfterFaTiePge.EXIT);
    }
    public static void getTitle(SeleniumUtil seleniumUtil,String title){
        String actualTitle=seleniumUtil.getText(AfterFaTiePge.TITLE);
        seleniumUtil.assertTitle(actualTitle,title);
    }
}
