package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/9.
 */
public class PostVotePage {
    public static final By RADIO1=By.id("option_1");
    public static final By RADIO2=By.id("option_2");
   // public static final By RADIO3=By.id("option_3");
    public static final By SUBMIT=By.id("pollsubmit");
    public static final By SELECTTEXT1=By.xpath("//*[@id=\"poll\"]/div[2]/table/tbody/tr[1]/td[2]/label");
    public static final By SELECTTEXT2=By.xpath("//*[@id=\"poll\"]/div[2]/table/tbody/tr[3]/td[2]/label");
    public static final By PERCENT1=By.xpath("//*[@id=\"poll\"]/div[2]/table/tbody/tr[2]/td[3]");
    public static final By PERCENT2=By.xpath("//*[@id=\"poll\"]/div[2]/table/tbody/tr[4]/td[3]");
    public static final By SUBJECT=By.xpath("//*[@id=\"thread_subject\"]");
}
