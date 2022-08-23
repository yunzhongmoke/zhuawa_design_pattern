package com.w.framework.utils;

import java.util.Locale;

/**
 * @author blue
 * @version 1.0
 * 用于set方法的拼接
 */
public class StringUtils {

    public static String getSetterMethodByFieldName(String fieldName) {
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }
}
