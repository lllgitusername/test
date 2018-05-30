package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/9.
 */
public class FaTieVotePage {
    public static final By VOTE=By.linkText("发起投票");
    public static final By SUBJECT=By.id("subject");
    public static final By SELECT1=By.xpath("//*[@id=\"pollm_c_1\"]/p[1]/input");
    public static final By SELECT2=By.xpath("//*[@id=\"pollm_c_1\"]/p[2]/input");
    public static final By SELECT3=By.xpath("//*[@id=\"pollm_c_1\"]/p[3]/input");
    public static final By POSTBUT=By.id("postsubmit");
}
