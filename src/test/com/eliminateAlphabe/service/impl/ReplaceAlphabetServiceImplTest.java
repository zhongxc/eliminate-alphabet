package com.eliminateAlphabe.service.impl;

import com.eliminateAlphabe.service.IEliminateAlphabetService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ReplaceAlphabetServiceImplTest {

    private IEliminateAlphabetService service;

    @Before
    public void before(){
        service = new ReplaceAlphabetServiceImpl();
    }

    @Test
    public void testEliminateAlphabet(){
        String str = service.exec("abcccbad");
        Assert.assertEquals("error",str,"d");
        str = service.exec("aa");
        Assert.assertEquals("error",str,"aa");
        str = service.exec("abcccbadyyzzz");
        Assert.assertEquals("error",str,"dx");

    }
}