package com.huawei.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author rango
 * @date 2019/3/20 22:59
 */
public class MillTime {
    public static void main(String[] args) {
        //method 1
        Calendar nowtime = new GregorianCalendar();
        String strDateTime = "[" + String.format("%04d", nowtime.get(Calendar.YEAR)) + "/" +
                String.format("%02d", nowtime.get(Calendar.MONTH)) + "/" +
                String.format("%02d", nowtime.get(Calendar.DATE)) + " " +
                String.format("%02d", nowtime.get(Calendar.HOUR)) + ":" +
                String.format("%02d", nowtime.get(Calendar.MINUTE)) + ":" +
                String.format("%02d", nowtime.get(Calendar.SECOND)) + "." +
                String.format("%03d", nowtime.get(Calendar.MILLISECOND)) + "]";
        System.out.println(strDateTime);

        //method 2
        String msg = "";
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SSS");
        msg += "[" + sdf.format(date) + "]";

        System.out.println(msg);
    }
}

