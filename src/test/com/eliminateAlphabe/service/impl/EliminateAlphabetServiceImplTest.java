package com.eliminateAlphabe.service.impl;

import com.eliminateAlphabe.service.IEliminateAlphabetService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EliminateAlphabetServiceImplTest{

    private IEliminateAlphabetService service;

    @Before
    public void before(){
        service = new EliminateAlphabetServiceImpl();
    }

    @Test
    public void testEliminateAlphabet(){
        String str = service.exec("aabcccbbad");
        Assert.assertEquals("error",str,"d");
        str = service.exec("aa");
        Assert.assertEquals("error",str,"aa");
        str = service.exec("aabbcccbadyyzzzy");
        Assert.assertEquals("error",str,"d");

    }
}