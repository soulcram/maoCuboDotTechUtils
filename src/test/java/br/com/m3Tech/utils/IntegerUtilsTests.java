package br.com.m3Tech.utils;

import junit.framework.TestCase;

public class IntegerUtilsTests extends TestCase{
	Integer nulo = null;
	Integer naoNulo = 10;
	
    public void testaSeNumeroEhNulo(){

        assertTrue( IntegerUtils.isNull(nulo) );
        assertFalse( IntegerUtils.isNull(naoNulo));
        assertTrue( IntegerUtils.isNotNull(naoNulo) );
        assertFalse( IntegerUtils.isNotNull(nulo));
    }
    
    public void testaSeNullRetornaZero(){
    	
        assertTrue( IntegerUtils.zeroIfNull(nulo).equals(0));
        assertTrue( IntegerUtils.zeroIfNull(naoNulo).equals(10));
        assertTrue( IntegerUtils.zeroIfNull(nulo) == 0);
        assertTrue( IntegerUtils.zeroIfNull(naoNulo) == 10);
    }

}
