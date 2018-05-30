package pageHelper;

import page.LoginPage;
import page.LuntanPage;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HelperLuntanPage {
    public static void clickAdd(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(LuntanPage.ADDNEW,10);
        seleniumUtil.click(LuntanPage.ADDNEW);
    }
    public static void newBankuaiName(SeleniumUtil seleniumUtil,String modelName){
        seleniumUtil.waitForElementLoad(LuntanPage.NEWNAME,10);
        seleniumUtil.sendKeys(LuntanPage.NEWNAME,modelName);
    }
    public static void submit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(LuntanPage.SUBMIT,10);
        seleniumUtil.click(LuntanPage.SUBMIT);
    }
    public static void exit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(LuntanPage.EXIT,10);
        seleniumUtil.click(LuntanPage.EXIT);
    }
}
