package util;

import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by lenovo on 2018/5/7.
 */
public class LogConfiguration {
    public static void initLog(){
        SimpleDateFormat dateFormat=new SimpleDateFormat("yy_MM_dd HH_mm_ss");
        String date=dateFormat.format(new Date());
        String dateLog="./Log/"+date+".log";
        Properties proper=new Properties();
        proper.setProperty("log4j.rootLogger","info,toConsole,toFile");
        proper.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        proper.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        proper.setProperty("log4j.appender.toConsole.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        proper.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");
        proper.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        proper.setProperty("log4j.appender.toFile.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        proper.setProperty("log4j.appender.toFile.file",dateLog);
        PropertyConfigurator.configure(proper);
    }
}
