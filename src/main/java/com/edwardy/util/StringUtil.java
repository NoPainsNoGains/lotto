package com.edwardy.util;

/**
 * Created by yuminghua on 5/19/18.
 */
public class StringUtil {
    public static int getEndIndex(String string){
        String regex = "(?<!\\\\)',";
        string = string.replaceAll(regex,"^^^");
        return  string.indexOf("^^^");
    }
    public static void main(String [] args){
        String line = "134\\',sd\\',ss',sss\\',ssddssd',";
        System.out.println(getEndIndex(line));
    }
}
