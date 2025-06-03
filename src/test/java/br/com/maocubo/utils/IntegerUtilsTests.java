package br.com.maocubo.utils;

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
    
    public void testarNumeroAleatorio11ate99() {
    	Integer random = IntegerUtils.random(11, 99);
    	
    	for(int i = 0; i < 100; i++) {
    	System.out.println(IntegerUtils.random(11, 99));
    	}
    	
    	assertTrue( random > 10 && random < 100);
    }

}
