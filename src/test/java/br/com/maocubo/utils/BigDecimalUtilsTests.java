package br.com.maocubo.utils;

import java.math.BigDecimal;

import br.com.maocubo.tech.utils.BigDecimalUtils;
import junit.framework.TestCase;

public class BigDecimalUtilsTests extends TestCase{
	
    public void testaSeBigDecimalEhNuloOuZero(){
    	
    	BigDecimal valor1 = null;
    	BigDecimal valor2 = BigDecimal.ZERO;
    	BigDecimal valor3 = new BigDecimal("0.000");
    	BigDecimal valor4 = new BigDecimal("0.175");
    	BigDecimal valor5 = new BigDecimal(0.175);
    	
        assertTrue( BigDecimalUtils.isNullOrZero(valor1) );
        assertTrue( BigDecimalUtils.isNullOrZero(valor2) );
        assertTrue( BigDecimalUtils.isNullOrZero(valor3) );
        assertFalse(BigDecimalUtils.isNullOrZero(valor4) );
        assertFalse(BigDecimalUtils.isNullOrZero(valor5) );
    }
    


}
