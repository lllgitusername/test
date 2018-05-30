package pageHelper;

import page.AfterFaTiePge;
import page.FaTiePage;
import page.LoginPage;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HelperFaTiePage {
    //模块一发帖浏览帖

    public static void inputSubject(SeleniumUtil seleniumUtil,String subject){
        seleniumUtil.waitForElementLoad(FaTiePage.SUBJECT,10);
        seleniumUtil.sendKeys(FaTiePage.SUBJECT,subject);
    }
    public static void inputArea(SeleniumUtil seleniumUtil,String area){
        seleniumUtil.waitForElementLoad(FaTiePage.SUBJECT,10);
        seleniumUtil.sendKeys(FaTiePage.SUBJECT,area);
    }
    public static void submitTie(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(FaTiePage.SUBMITTEXT,10);
        seleniumUtil.click(FaTiePage.SUBMITTEXT);
    }
    public static void liulanTie(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(FaTiePage.LIULANTIE,10);
        seleniumUtil.click(FaTiePage.LIULANTIE);
    }
}
