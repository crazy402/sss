package com.crazy.bookstore.bookstorev100.utils;

import java.util.UUID;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/7/7 10:20
 * @description //
 **/
public class UUIDUtils {
    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
    }
}
