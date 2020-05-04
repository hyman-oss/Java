package com.hyman.leetcode;

import java.util.Stack;

/**
 * 力扣第38题 外观数列
 * @author hyman
 */
public class CountAndSay {

    /**
     * 外观数列
     * @param n
     * @return
     */
    public static String countAndSay(int n) {
        String l = String.valueOf(1);
        while (n > 1){
            int i = 0;
            int j = 1;
            StringBuilder sb = new StringBuilder();
            for(j = 1;j< l.length();j++){
                if(l.charAt(i) != l.charAt(j)){
                    sb.append(j-i);
                    sb.append(l.charAt(i));
                    i = j;
                }
            }
            if( i != j){
                sb.append(j-i);
                sb.append(l.charAt(i));
            }
            n--;
            l = sb.toString();
        }
        return l;
    }

    public static void main(String[] args) {
        CountAndSay.countAndSay(4);
    }
}
