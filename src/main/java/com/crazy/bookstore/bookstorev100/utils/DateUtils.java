package com.crazy.bookstore.bookstorev100.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/7/7 10:15
 * @description //
 **/
public class DateUtils {
    public static String getDateToString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
        return  simpleDateFormat.format(new Date());
    }
}
