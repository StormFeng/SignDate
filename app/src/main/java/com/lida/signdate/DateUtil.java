package com.lida.signdate;

import java.util.Calendar;

/**
 * Created by Administrator on 2017/8/16.
 */

public class DateUtil {

    public static int getCurrentMonthLastDay() {
        Calendar a = Calendar.getInstance();
        a.set(Calendar.DATE, 1);//把日期设置为当月第一天
        a.roll(Calendar.DATE, -1);//日期回滚一天，也就是最后一天
        int maxDate = a.get(Calendar.DATE);
        return maxDate;
    }

    public static String getCurrentYearAndMonth(){
        Calendar a = Calendar.getInstance();
        int year = a.get(Calendar.YEAR);
        int month = a.get(Calendar.MONTH) + 1;
        return year+"年"+month+"月";
    }

    public static int getFirstDayOfMonth(){
        Calendar a = Calendar.getInstance();
        a.set(Calendar.DAY_OF_MONTH,1);
        int i = a.get(Calendar.DAY_OF_WEEK);
        return i;
    }
}
