package com.eliminateAlphabe.service.impl;

import com.eliminateAlphabe.service.IEliminateAlphabetService;

public abstract class AbstractEliminateAlphabetService implements IEliminateAlphabetService{


    public String exec(String str){
        if (str.length()<3){
            System.out.println(str);
            return str;
        }else {
            String[] strArray = str.split("|");
            for (int i = 0; i+2 < strArray.length; i++) {
                if (strArray[i].equals(strArray[i+1]) && strArray[i].equals(strArray[i+2])){
                    String exec = exec(eliminateAlphabet(i, str));
                    return exec;
                }
            }
            return str;
        }

    }


    protected abstract String eliminateAlphabet(int i, String str);
}
