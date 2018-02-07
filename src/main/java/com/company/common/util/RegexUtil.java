package com.company.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * com.company.common.util
 *
 * @author Wang
 * @create 2018-02-05 上午10:12
 * @description:
 **/
public class RegexUtil {
    public static String getCmdTitle(String s){
        Pattern p = Pattern.compile("[a-z]{3,8}");
        // 获取完整的域名
        // Pattern p=Pattern.compile("[^//]*?\\.(com|cn|net|org|biz|info|cc|tv)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(s);
        matcher.find();
        return matcher.group();
    }
}
