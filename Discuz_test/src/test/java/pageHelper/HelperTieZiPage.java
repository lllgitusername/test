package pageHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import page.TieZiPage;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/9.
 */
public class HelperTieZiPage {
    public static void clickTitle(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(TieZiPage.Title,10);
        seleniumUtil.click(TieZiPage.Title);
    }
}
