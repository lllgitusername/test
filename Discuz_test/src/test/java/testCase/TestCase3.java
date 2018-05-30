package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperAfterFaTiePage;
import pageHelper.HelperLoginIndexPage;
import pageHelper.HelperLoginPage;
import pageHelper.HelperTieZiPage;

import java.util.Set;

/**
 * Created by lenovo on 2018/5/9.
 */
public class TestCase3 extends BasicTestCase{
      @Test
       public void manageTie(){
          //登录
          HelperLoginPage.InputUsername(seleniumUtil,"admin123");
          HelperLoginPage.InputPassword(seleniumUtil,"admin123");
          HelperLoginPage.loginSubmit(seleniumUtil);
          //搜索帖子
          HelperLoginIndexPage.searchContent(seleniumUtil,"believe");
          HelperLoginIndexPage.searchSubmit(seleniumUtil);
          Set<String> winHandles=driver.getWindowHandles();
          for (String winHandle:winHandles){
              driver.switchTo().window(winHandle);
          }
          HelperTieZiPage.clickTitle(seleniumUtil);
          Set<String> winHandless=driver.getWindowHandles();
          for (String winHandle:winHandless){
              driver.switchTo().window(winHandle);
          }
          HelperAfterFaTiePage.getTitle(seleniumUtil,"believe");
          HelperAfterFaTiePage.exit(seleniumUtil);
       }
}
