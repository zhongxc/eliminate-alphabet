package com.eliminateAlphabe.service.impl;

import org.springframework.stereotype.Service;

/**
 * 消除字母服务类实现
 */
public class EliminateAlphabetServiceImpl extends AbstractEliminateAlphabetService{

    @Override
    protected String eliminateAlphabet(int i, String str){
        String s = str.substring(0, i) + str.substring(i + 3);
        System.out.println(s);
        return s;
    }

}
