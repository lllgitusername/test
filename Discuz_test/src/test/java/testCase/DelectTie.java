package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperAdminIndexPage;
import pageHelper.HelperAdminMorenPage;

/**
 * Created by lenovo on 2018/5/8.
 */
public class DelectTie extends BasicTestCase{
    @Test
    public void delete(){
        HelperAdminIndexPage.morenLink(seleniumUtil);
        //删除帖子
        HelperAdminMorenPage.selectEle(seleniumUtil);
        HelperAdminMorenPage.delect(seleniumUtil);
        HelperAdminMorenPage.acceptDelete(seleniumUtil);
    }
}
