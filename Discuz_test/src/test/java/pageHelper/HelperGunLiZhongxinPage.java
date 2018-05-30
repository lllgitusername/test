package pageHelper;

import page.GuanliEnterPage;
import page.GunLiZhongxinPage;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HelperGunLiZhongxinPage {
    public static void luntan(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(GunLiZhongxinPage.LUNTAN,10);
        seleniumUtil.click(GunLiZhongxinPage.LUNTAN);
    }
}
