package br.com.m3Tech.utils;

import junit.framework.TestCase;

public class StringUtilsTests extends TestCase{
	
    public void testaSeStringEhVaziaOuNula(){
    	
    	String nulo = null;
    	
        assertTrue( StringUtils.isEmpty("") );
        assertTrue( StringUtils.isEmpty(nulo) );
        assertTrue( StringUtils.isEmpty(" ") );
        assertFalse(StringUtils.isEmpty(" A") );
        assertFalse(StringUtils.isEmpty(" A ") );
    }
    
    public void testaSeStringNaoEhVaziaOuNula(){
    	
    	String nulo = null;
    	
        assertFalse( StringUtils.isNotEmpty("") );
        assertFalse( StringUtils.isNotEmpty(nulo) );
        assertFalse( StringUtils.isNotEmpty(" ") );
        assertTrue(StringUtils.isNotEmpty(" A") );
        assertTrue(StringUtils.isNotEmpty(" A ") );
    }

}
