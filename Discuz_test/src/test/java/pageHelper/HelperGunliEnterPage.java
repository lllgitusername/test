package pageHelper;

import page.FaTiePage;
import page.GuanliEnterPage;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HelperGunliEnterPage {
    public static void inputPassword(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.waitForElementLoad(GuanliEnterPage.PASSWORD,10);
        seleniumUtil.sendKeys(GuanliEnterPage.PASSWORD,password);
    }
    public static void submit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(GuanliEnterPage.SUBMIT,10);
        seleniumUtil.click(GuanliEnterPage.SUBMIT);
    }
}
