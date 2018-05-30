package pageHelper;

import page.PostVotePage;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/9.
 */
public class HelperPostVotePage {
    public static void selectRadio1(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PostVotePage.RADIO1,10);
        seleniumUtil.click(PostVotePage.RADIO1);
    }
    public static void selectRadio2(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PostVotePage.RADIO2,10);
        seleniumUtil.click(PostVotePage.RADIO2);
    }
//    public static void selectRadio3(SeleniumUtil seleniumUtil){
//        seleniumUtil.waitForElementLoad(PostVotePage.RADIO3,10);
//        seleniumUtil.click(PostVotePage.RADIO3);
//    }
    public static void submit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PostVotePage.SUBMIT,10);
        seleniumUtil.click(PostVotePage.SUBMIT);
    }
    public static void getSelect1(SeleniumUtil seleniumUtil){
        System.out.println("选项一:");
        seleniumUtil.waitForElementLoad(PostVotePage.SELECTTEXT1,10);
        seleniumUtil.getText(PostVotePage.SELECTTEXT1);
        seleniumUtil.waitForElementLoad(PostVotePage.PERCENT1,10);
        seleniumUtil.getText(PostVotePage.PERCENT1);
    }
    public static void getSelect2(SeleniumUtil seleniumUtil){
        System.out.println("选项二:");
        seleniumUtil.waitForElementLoad(PostVotePage.SELECTTEXT2,10);
        seleniumUtil.getText(PostVotePage.SELECTTEXT2);
        seleniumUtil.waitForElementLoad(PostVotePage.PERCENT2,10);
        seleniumUtil.getText(PostVotePage.PERCENT2);
    }
    public static void getSubject(SeleniumUtil seleniumUtil){
        System.out.println("主题为:");
        seleniumUtil.waitForElementLoad(PostVotePage.SUBJECT,10);
        seleniumUtil.getText(PostVotePage.SUBJECT);
    }

}
