package com.eliminateAlphabe.service.impl;

import org.springframework.stereotype.Service;

import javax.naming.Name;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 高阶需求
 * 把字母替换为上琴字母实现类
 */
public class ReplaceAlphabetServiceImpl extends  AbstractEliminateAlphabetService{

    private static final String[] ALPHABET_ARRAY = {"a" ,"b" ,"c" ,"d" ,"e" ,"f" ,"g" ,"h" ,"i" ,"j" ,"k" ,"l" ,"m" ,"n" ,"r" ,"s" ,"t" ,"u" ,"v" ,"w" ,"x" ,"y" ,"z"};

    @Override
    protected String eliminateAlphabet(int i, String str){
        String s = String.valueOf(str.charAt(i));
        int i1 = 0;
        for (; i1 < ALPHABET_ARRAY.length; i1++) {
            if (s.equals(ALPHABET_ARRAY[i1])) {
                break;
            }
        }
        String replaceBy = "";
        if (i1!=0){
            replaceBy = ALPHABET_ARRAY[i1-1];
        }
        String replaceStr = str.substring(i, i + 3);
        String s1 = str.substring(0, i) + replaceBy + str.substring(i + 3);
        System.out.println(String.format("%s,%s is replaced by %s",s1 , replaceStr, replaceBy));
        return s1;
    }

}
