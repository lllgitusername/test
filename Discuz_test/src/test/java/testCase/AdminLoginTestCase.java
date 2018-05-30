package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;

/**
 * Created by lenovo on 2018/5/8.
 */
public class AdminLoginTestCase extends BasicTestCase{
    @Test
    public void adminLogin(){
        //登录
        HelperLoginPage.InputUsername(seleniumUtil,"admin123");
        HelperLoginPage.InputPassword(seleniumUtil,"admin123");
        HelperLoginPage.loginSubmit(seleniumUtil);

    }
}
