package com.my.test.set;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by binary on 18/4/18.
 * SimpleDateFormat 线程安全性测试
 */
public class DateFormatThreadTest {

    private static final ThreadLocal<DateFormat> DF = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };

    public static void main(String[] args) {
        /// 暂时被注释掉,后续可能恢复使用的代码片断,在注释代码上方,统一规定使用三 个斜杠(///)来说明注释掉代码的理由。
        System.out.println(DF.get().format(new Date()));
        /**
         * 获取当前毫秒/纳秒时间 在JDK8中推荐使用Instant
         */
        System.out.println("当前毫秒时间:" + System.currentTimeMillis());
        System.out.println("当前那秒时间:" + System.nanoTime());
        // TODO 如何使用Instant
    }

}
