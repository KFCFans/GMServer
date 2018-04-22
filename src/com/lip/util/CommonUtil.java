package com.lip.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtil {

    /*
     * 将时间戳转换为时间字符串
     */
    public static String stampToDateString(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = Long.parseLong(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }

    /*
     * 将时间戳转换为时间对象
     */
    public static Date stampToDate(String s){
        long lt = Long.parseLong(s);

        Date date = new Date(lt);
        return date;
    }

}
