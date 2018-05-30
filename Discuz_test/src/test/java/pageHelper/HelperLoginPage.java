package pageHelper;

import page.LoginIndexPage;
import page.LoginPage;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/7.
 */
public class HelperLoginPage {
    public static void InputUsername(SeleniumUtil seleniumUtil,String username){
        seleniumUtil.waitForElementLoad(LoginPage.USERNAME,10);
        seleniumUtil.sendKeys(LoginPage.USERNAME,username);
    }
    public static void InputPassword(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.waitForElementLoad(LoginPage.PASSWORD,10);
        seleniumUtil.sendKeys(LoginPage.PASSWORD,password);
    }
    public static void loginSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(LoginPage.BUTTON,10);
        seleniumUtil.click(LoginPage.BUTTON);
    }



    //模块二


}
