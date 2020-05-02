package com.hyman.leetcode;

import java.util.*;

/**
 * 力扣 第20题  有效括号
 * @author hyman
 */
public class Practice20 {

    public static boolean isValid(String s) {
        if(s.length() == 0){
            return true;
        }
        Map<Character,Character> p = new HashMap<>();
        p.put(')','(');
        p.put('}','{');
        p.put(']','[');

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c =='['){
                stack.push(c);
            } else {
                if(stack.empty() || stack.pop().equals(p.get(c))){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
