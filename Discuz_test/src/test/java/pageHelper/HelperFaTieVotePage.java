package pageHelper;

import page.FaTieVotePage;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/9.
 */
public class HelperFaTieVotePage {
    public static void clickFaQi(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(FaTieVotePage.VOTE,10);
        seleniumUtil.click(FaTieVotePage.VOTE);
    }
    public static void subject(SeleniumUtil seleniumUtil,String subject){
        seleniumUtil.waitForElementLoad(FaTieVotePage.SUBJECT,10);
        seleniumUtil.sendKeys(FaTieVotePage.SUBJECT,subject);
    }
    public static void select1(SeleniumUtil seleniumUtil,String select1){
        seleniumUtil.waitForElementLoad(FaTieVotePage.SUBJECT,10);
        seleniumUtil.sendKeys(FaTieVotePage.SELECT1,select1);
    }
    public static void select2(SeleniumUtil seleniumUtil,String select2){
        seleniumUtil.waitForElementLoad(FaTieVotePage.SUBJECT,10);
        seleniumUtil.sendKeys(FaTieVotePage.SELECT2,select2);
    }

    public static void submit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(FaTieVotePage.POSTBUT);
    }
}
