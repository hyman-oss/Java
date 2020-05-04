package com.hyman.leetcode;

/**
 * 力扣 第28题
 * @author hyman
 */
public class StrStr {

    public static int strStr(String haystack, String needle) {
        int l = haystack.length();
        int s = needle.length();
        if(needle.length() == 0){
            return 0;
        }

        int i = 0;
        while (i < l && s <= l){
            if(haystack.charAt(i) != needle.charAt(0)){
                i++;
            }else {

                int k = i;
                int o = 0;
                while(o < s){
                    if(haystack.charAt(k) == needle.charAt(o) && k < l){
                        o++;
                        k++;
                    }else {
                        break;
                    }
                }
                if(o == needle.length()){
                    return k;
                }else {
                    i++;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String test = "hello";
        String tst2 = "ll";
        System.out.println(StrStr.strStr(test,tst2));
    }
}
